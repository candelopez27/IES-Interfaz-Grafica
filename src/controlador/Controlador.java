package controlador;

import dao.EstudianteDAO;
import dao.InscripcionDAO;
import dao.MateriaDAO;
import dao.mysql.EstudianteDAOMYSQL;
import dao.mysql.MateriaDAOMYSQL;
import dao.mysql.InscripcionMateriaDAOMySQL;

import modelo.Estudiante;
import modelo.InscripcionMateria;
import modelo.Materia;
import java.util.ArrayList;

public class Controlador {

    private Estudiante estudiante;
    private MateriaDAO materiaDAO;
    private InscripcionDAO inscripcionDAO;
    private EstudianteDAO estudianteDAO;
    
    // NUEVOS ATRIBUTOS: Instancias para persistencia dual en MySQL
    private EstudianteDAOMYSQL estudianteMySQLDAO;
    private MateriaDAOMYSQL materiaMySQLDAO;
    private InscripcionMateriaDAOMySQL inscripcionMySQLDAO;

    public Controlador() {
        this.materiaDAO     = new MateriaDAO();
        this.inscripcionDAO = new InscripcionDAO();
        this.estudianteDAO  = new EstudianteDAO();
        
        // NUEVA INICIALIZACIÓN: Creamos los objetos DAO de MySQL
        this.estudianteMySQLDAO  = new EstudianteDAOMYSQL();
        this.materiaMySQLDAO     = new MateriaDAOMYSQL();
        this.inscripcionMySQLDAO = new InscripcionMateriaDAOMySQL();

        this.estudiante = estudianteDAO.cargarEstudiante();

        // solo carga materias e inscripciones si el estudiante existe
        if (this.estudiante != null) {
            ArrayList<Materia> materias = materiaDAO.leerMaterias();
            ArrayList<InscripcionMateria> inscripciones =
                    inscripcionDAO.cargarInscripciones(materias);
            for (InscripcionMateria ins : inscripciones) {
                this.estudiante.getMaterias().add(ins);
            }
        }
    }

    // verifica si el legajo ingresado corresponde al estudiante guardado
    public boolean login(String legajo) {
        if (estudiante != null && estudiante.getLegajo().equalsIgnoreCase(legajo)) {
            return true;
        }
        return false;
    }

    // devuelve true si hay un estudiante guardado en el archivo
    public boolean existeEstudiante() {
        return this.estudiante != null;
    }

    // la VentanaRegistro llama a este método cuando el usuario completa el formulario
    public String crearEstudiante(String nombre, String legajo,
                                  String carrera, String anioStr) {
        if (nombre.isBlank() || legajo.isBlank() ||
            carrera.isBlank() || anioStr.isBlank()) {
            return "Completá todos los campos.";
        }
        try {
            int anio = Integer.parseInt(anioStr);
            this.estudiante = new Estudiante(carrera, legajo, nombre, anio);
            
            // 1. Guardamos en archivo de texto obligatorio
            estudianteDAO.guardarEstudiante(this.estudiante);
            
            // 2. Guardamos de forma segura en MySQL
            try {
                estudianteMySQLDAO.guardarEstudiante(this.estudiante);
            } catch (Exception e) {
                System.err.println("Bonus MySQL Omitido (Crear Estudiante): " + e.getMessage());
            }
            
            return null; // null = éxito
        } catch (NumberFormatException e) {
            return "El año debe ser un número.";
        } catch (IllegalArgumentException e) {
            return e.getMessage(); // captura validaciones de PersonaAcademica
        }
    }

    public void inscribirMateria(String nombre, String codigo, int cuatrimestre, int anio) {
        ArrayList<Materia> todasLasMaterias = materiaDAO.leerMaterias();

        // busca la materia en el archivo en lugar de crearla nueva
        Materia materiaExistente = null;
        for (Materia m : todasLasMaterias) {
            if (m.getCodigo().equalsIgnoreCase(codigo)) {
                materiaExistente = m;
                break;
            }
        }
        if (materiaExistente != null) {
            estudiante.inscribirse(materiaExistente);
            
            // 1. Persiste en archivo de texto obligatorio
            inscripcionDAO.guardarInscripciones(estudiante.getMaterias());
            
            // 2. Guardamos la nueva inscripción en MySQL
            try {
                InscripcionMateria nuevaIns = estudiante.getInscripcion(codigo);
                if (nuevaIns != null) {
                    inscripcionMySQLDAO.guardarInscripcion(estudiante.getLegajo(), nuevaIns);
                }
            } catch (Exception e) {
                System.err.println("Bonus MySQL Omitido (Inscribir Materia): " + e.getMessage());
            }
        }
    }

    public void darDeBaja(String codigoMateria) {
        // Obtenemos la inscripción antes de borrarla por si necesitamos actualizar MySQL
        InscripcionMateria insABorrar = estudiante.getInscripcion(codigoMateria);
        
        estudiante.darDeBaja(codigoMateria);
        materiaDAO.guardarMaterias(getMaterias());
        inscripcionDAO.guardarInscripciones(estudiante.getMaterias());
        
        // Sincroniza de forma segura en MySQL
        try {
            if (estudiante != null) {
                // ASEGURAMOS EL PADRE: Primero guardamos/actualizamos al estudiante en MySQL
                estudianteMySQLDAO.guardarEstudiante(this.estudiante);
                
                for (InscripcionMateria ins : estudiante.getMaterias()) {
                    inscripcionMySQLDAO.guardarInscripcion(estudiante.getLegajo(), ins);
                }
            }
        } catch (Exception e) {
            System.err.println("MySQL Omitido (Dar de baja): " + e.getMessage());
        }
    }

    public void registrarAsistencia(String codigoMateria, boolean presente) {
        InscripcionMateria ins = estudiante.getInscripcion(codigoMateria);
        if (ins != null) {
            ins.registrarAsistencia(presente);
            
            // 1. Persiste el cambio en archivo de texto obligatorio
            inscripcionDAO.guardarInscripciones(estudiante.getMaterias());
            
            // 2. BONUS: Impacta en MySQL asegurando primero al estudiante
            try {
                if (estudiante != null) {
                    estudianteMySQLDAO.guardarEstudiante(this.estudiante); // Asegura FK
                    inscripcionMySQLDAO.guardarInscripcion(this.estudiante.getLegajo(), ins);
                }
            } catch (Exception e) {
                System.err.println("MySQL Omitido (Asistencia): " + e.getMessage());
            }
        }
    }

    public String registrarNota(String codigoMateria, double nota) {
        if (nota < 0 || nota > 10) return "La nota debe estar entre 0 y 10.";
        InscripcionMateria ins = estudiante.getInscripcion(codigoMateria);
        if (ins == null) return "Materia no encontrada.";
        if (ins.getNotas().size() >= 5) return "Ya tiene 5 notas registradas.";
        
        ins.agregarNota(nota);
        
        // 1. Persiste la nota en archivo de texto obligatorio
        inscripcionDAO.guardarInscripciones(estudiante.getMaterias());

        try {
            if (estudiante != null) {
                estudianteMySQLDAO.guardarEstudiante(this.estudiante); 
                inscripcionMySQLDAO.guardarInscripcion(this.estudiante.getLegajo(), ins);
            }
        } catch (Exception e) {
            System.err.println("Bonus MySQL Omitido (Registrar Nota): " + e.getMessage());
        }
        return null;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public ArrayList<Materia> getMaterias() {
        ArrayList<Materia> lista = new ArrayList<>();
        for (InscripcionMateria ins : estudiante.getMaterias()) {
            lista.add(ins.getMateria());
        }
        return lista;
    }

    public ArrayList<InscripcionMateria> getInscripciones() {
        return estudiante.getMaterias();
    }

    public ArrayList<InscripcionMateria> getMateriasCriticas() {
        return estudiante.getMateriasCriticas();
    }

    public double getPromedioGeneral() {
        return estudiante.getPromedioGeneral();
    }

    public String crearMateria(String nombre, String codigo, String cuatrStr, String anioStr) {
        if (nombre.isBlank() || codigo.isBlank() ||
            cuatrStr.isBlank() || anioStr.isBlank()) {
            return "Completá todos los campos.";
        }
        if (codigo.length() < 3 || codigo.length() > 10) {
            return "El código debe tener entre 3 y 10 caracteres.";
        }
        int cuatrimestre, anio;
        try {
            cuatrimestre = Integer.parseInt(cuatrStr);
            anio = Integer.parseInt(anioStr);
        } catch (NumberFormatException e) {
            return "Cuatrimestre y año deben ser números.";
        }
        if (cuatrimestre != 1 && cuatrimestre != 2) {
            return "El cuatrimestre debe ser 1 o 2.";
        }
        
        Materia nuevaMateria = new Materia(nombre, codigo, cuatrimestre, anio);
        ArrayList<Materia> todas = materiaDAO.leerMaterias();
        todas.add(nuevaMateria);
        
        // 1. Guarda en el archivo de texto obligatorio
        materiaDAO.guardarMaterias(todas);
        
        // 2. BONUS: Guarda la nueva materia disponible en MySQL
        try {
            materiaMySQLDAO.guardarMateria(nuevaMateria);
        } catch (Exception e) {
            System.err.println("Bonus MySQL Omitido (Crear Materia): " + e.getMessage());
        }
        return null;
    }

    public ArrayList<Materia> getMateriasDisponibles() {
        ArrayList<Materia> todasLasMaterias = materiaDAO.leerMaterias();
        ArrayList<Materia> inscriptas = getMaterias();

        // filtra las que el estudiante ya tiene
        ArrayList<Materia> disponibles = new ArrayList<>();
        for (Materia m : todasLasMaterias) {
            boolean yaInscripta = false;
            for (Materia i : inscriptas) {
                if (i.getCodigo().equalsIgnoreCase(m.getCodigo())) {
                    yaInscripta = true;
                    break;
                }
            }
            if (!yaInscripta) disponibles.add(m);
        }
        return disponibles;
    }
    
    public String obtenerReporteMateriasAprobadas() {
        if (this.estudiante == null) {
            return "No hay ningún estudiante registrado o logueado en el sistema.";
        }
            return this.estudiante.getReporteMateriasAprobadas();
        }
}