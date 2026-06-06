package controlador;

import dao.EstudianteDAO;
import dao.InscripcionDAO;
import dao.MateriaDAO;
import modelo.Estudiante;
import modelo.InscripcionMateria;
import modelo.Materia;
import java.util.ArrayList;

public class Controlador {

    private Estudiante estudiante;
    private MateriaDAO materiaDAO;
    private InscripcionDAO inscripcionDAO;
    private EstudianteDAO estudianteDAO;

    public Controlador() {
        this.materiaDAO      = new MateriaDAO();
        this.inscripcionDAO  = new InscripcionDAO();
        this.estudianteDAO   = new EstudianteDAO();

        // carga los datos al iniciar
        this.estudiante = estudianteDAO.cargarEstudiante();
        ArrayList<Materia> materias = materiaDAO.leerMaterias();
        ArrayList<InscripcionMateria> inscripciones = 
                  inscripcionDAO.cargarInscripciones(materias);

        for (InscripcionMateria ins : inscripciones) {
            estudiante.getMaterias().add(ins);
        }
    }

    public void inscribirMateria(String nombre, String codigo,
                                  int cuatrimestre, int anio) {
        Materia m = new Materia(nombre, codigo, cuatrimestre, anio);
        estudiante.inscribirse(m);
        materiaDAO.guardarMaterias(getMaterias());
        inscripcionDAO.guardarInscripciones(estudiante.getMaterias());
    }

    public void darDeBaja(String codigoMateria) {
        estudiante.darDeBaja(codigoMateria);
        materiaDAO.guardarMaterias(getMaterias());
        inscripcionDAO.guardarInscripciones(estudiante.getMaterias());
    }

    public void registrarAsistencia(String codigoMateria, boolean presente) {
        InscripcionMateria ins = estudiante.getInscripcion(codigoMateria);
        if (ins != null) {
            ins.registrarAsistencia(presente);
            inscripcionDAO.guardarInscripciones(estudiante.getMaterias());
        }
    }

    public void registrarNota(String codigoMateria, double nota) {
        InscripcionMateria ins = estudiante.getInscripcion(codigoMateria);
        if (ins != null) {
            ins.agregarNota(nota);
            inscripcionDAO.guardarInscripciones(estudiante.getMaterias());
        }
    }

    // --- datos para la Vista ---

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
}