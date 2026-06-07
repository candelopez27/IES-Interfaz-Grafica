package modelo;

public abstract class PersonaAcademica {
    private String nombre;
    private String legajo;

    public PersonaAcademica(String nombre, String legajo) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (legajo == null || legajo.isBlank()) {
            throw new IllegalArgumentException("El legajo no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() { return nombre; }
    public String getLegajo() { return legajo; }

    public abstract void mostrarResumen();
}