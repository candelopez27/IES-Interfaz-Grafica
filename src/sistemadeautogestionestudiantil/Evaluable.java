package sistemadeautogestionestudiantil;

public interface Evaluable {
    String getCondicion();
    double getPromedio();
    boolean estaAprobada();
    
    default void mostrarEstadoAcademico() {
        System.out.println("=== ESTADO ACADÉMICO ===");
        System.out.printf("Condición: %s%n", getCondicion());
        System.out.printf("Promedio:  %.2f%n", getPromedio());
        if (estaAprobada()) {
            System.out.println("Aprobada: Sí");
        } else {
            System.out.println("Aprobada: No");
        }
    }
}
