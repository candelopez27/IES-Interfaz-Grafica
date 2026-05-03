package sistemadeautogestionestudiantil;
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaDeAutogestionEstudiantil {
    static Scanner sc = new Scanner(System.in);
    static Estudiante alumno;
    public static void main(String[] args) {
          
     System.out.println("========================================");
        System.out.println("   SISTEMA DE AUTOGESTIÓN ESTUDIANTIL  ");
        System.out.println("=========================================");
        System.out.println();
        // Datos del estudiante al inicio
        System.out.print("Ingresá tu nombre: ");
        String nombre = sc.nextLine().trim();
        System.out.print("Ingresá tu legajo: ");
        String legajo = sc.nextLine().trim();
        System.out.print("Ingresá tu carrera: ");
        String carrera = sc.nextLine().trim();
        System.out.print("Ingresá el año de ingreso: ");
        int anioIngreso = sc.nextInt();
         alumno = new Estudiante(carrera, legajo, nombre, anioIngreso);
        System.out.println("\n¡Bienvenido/a, " + alumno.getNombre() + "!");

        menuPrincipal();
    }
    public static void menuPrincipal() {
        int opcion;
        do {
            System.out.println("\n┌─────────────────────────────────┐");
            System.out.println("│         MENÚ PRINCIPAL          │");
            System.out.println("├─────────────────────────────────┤");
            System.out.println("│  1. Ver perfil del estudiante   │");
            System.out.println("│  2. Gestión de materias         │");
            System.out.println("│  3. Registrar asistencia        │");
            System.out.println("│  4. Registrar calificación      │");
            System.out.println("│  5. Ver reportes                │");
            System.out.println("│  0. Salir                       │");
            System.out.println("└─────────────────────────────────┘");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> verPerfil();
                case 2 -> menuMaterias();
                case 3 -> registrarAsistencia();
                case 4 -> menuCalificaciones();
                case 5 -> menuReportes();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("⚠  Opción inválida. Intentá de nuevo.");
            }
        } while (opcion != 0);
    }

    
    //  1. VER PERFIL
    
    public static void verPerfil() {
        System.out.println();
        alumno.mostrarResumen();
    }
     
    // 2. MENU MATERIAS
    public static void menuMaterias(){
     int opcion;
        do {
            System.out.println("\n┌───────────────────────────────────┐");
            System.out.println("  │       GESTIÓN DE MATERIAS     │");
            System.out.println("  ├────────────────────────────────────┤");
            System.out.println("  │  1. Inscribirse a una materia  │");
            System.out.println("  │  2. Darse de baja              │");
            System.out.println("  │  3. Listar materias            │");
            System.out.println("  │  4. Buscar materia             │");
            System.out.println("  │  0. Volver                     │");
            System.out.println("  └─────────────────────────────────────┘");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> inscribirseMateria();
                case 2 -> bajaMateriaMenu();
                case 3 -> listarMaterias();
                case 4 -> buscarMateriaMenu();
                case 0 -> {}
                default -> System.out.println("⚠  Opción inválida.");
            }
        } while (opcion != 0);
    }

    public static void inscribirseMateria() {
        sc.nextLine();

        System.out.print("Nombre de la materia: ");
        String nombre = sc.nextLine().trim();

        System.out.print("Código: ");
        String codigo = sc.nextLine().trim().toUpperCase();

        System.out.print("Cuatrimestre (1 o 2): ");
        int cuatrimestre = sc.nextInt();

        System.out.print("Año: ");
        int anio = sc.nextInt();

        Materia m = new Materia(nombre, codigo, cuatrimestre, anio);
        alumno.inscribirse(m);                                       
    }
    
    public static void registrarAsistencia(){
        System.out.println("Ingrese el codigo de la materia: ");
        String codigoMateria = sc.nextLine();
        
        InscripcionMateria inscripcion = alumno.getInscripcion(codigoMateria);
        while (inscripcion == null) {
            System.out.println("Error: no encontramos ese codigo: "+codigoMateria);
            System.out.println("Ingrese nuevamente el codigo de la materia");
            codigoMateria = sc.nextLine();
            inscripcion = alumno.getInscripcion(codigoMateria);
        }
        System.out.println("Estuvo presente?");
        String respuesta =sc.nextLine();
        if (respuesta.equalsIgnoreCase("Si")) {
            inscripcion.registrarAsistencia(true);
        } else {
            inscripcion.registrarAsistencia(false);
        }
        //imprimir porcentaje actualizado:
        double porcentajeActual = inscripcion.getPorcentajeAsistencia(); 
        System.out.println("Tu porcentaje de asistencias actualizado: "+porcentajeActual);
        String condicion = inscripcion.getCondicion();
        //Advertencias
        if (porcentajeActual>=75 && porcentajeActual<=80) {
        System.out.println("Su condicion es: "+condicion +"\nSe encuentra en una zona de riesgo por inasistencias, no falte más :)");
        } else if(porcentajeActual<75){
        System.out.println("Se encuentra en perdida de regularidad por ende su condición es "+ condicion);
        }
    }
}


        
        
        
 
      




        

    

