package modelo;

public class Materia implements Consultable {
    private String nombre;
    private String codigo;
    private int cuatrimestre;
    private int anio;
    
    public Materia(String materia, String codigo, int cuatrimestre, int anio) {
        this.nombre = materia;
        setCodigo(codigo);
        setCuatrimestre(cuatrimestre);
        this.anio = anio;
    }
    
    public String getNombre() { return nombre; }
    public String getCodigo() { return codigo; }
    public int getCuatrimestre() { return cuatrimestre; }
    public int getAnio() { return anio; }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public boolean setCuatrimestre(int cuatrimestre) {
        if (cuatrimestre != 1 && cuatrimestre != 2) {
            System.out.println("Error: Cuatrimestre debe ser 1 o 2");
            return false;
        }
        this.cuatrimestre = cuatrimestre;
        return true;
    }
    
    @Override
    public void mostrarResumen() {
        System.out.println("=== MATERIA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Cuatrimestre: " + cuatrimestre);
        System.out.println("Año: " + anio);
    }
    
    public String toTexto() {
        return nombre + "," + codigo + "," + cuatrimestre + "," + anio;
    }
    
    public static Materia fromTexto(String linea) {
        String[] partes = linea.split(",");
        return new Materia(partes[0], partes[1], 
                           Integer.parseInt(partes[2]), 
                           Integer.parseInt(partes[3]));
    }
}