package modelo;

import modelo.Consultable;
import java.util.HashSet;

public class Materia implements Consultable {
    private String nombre;
    private String codigo;
    private int cuatrimestre;
    private int anio;
    
    public Materia(String materia, String codigo, int cuatrimestre, int anio){
        this.nombre = materia;
        setCodigo(codigo);
        setCuatrimestre(cuatrimestre);
        this.anio = anio;
    }
    
    public String getNombre() {return nombre;}
    public String getCodigo(){ return codigo;}
    public int getCuatrimestre(){ return cuatrimestre;}
    public int getAnio(){ return anio;}
    
    
    private static HashSet<String> codigos = new HashSet<>();
    public void setCodigo(String codigo){
        if (!codigos.contains(codigo)) {
            this.codigo = codigo;
            codigos.add(codigo);
        }else{
            System.out.println("ERROR: El código ya existe");
        }
    }
    
    public boolean setCuatrimestre(int cuatrimestre){
        if (cuatrimestre != 1 && cuatrimestre != 2) {
            System.out.println("Error: Cuatrimestre debe ser 1 o 2");
            return false;
        } else {
            this.cuatrimestre = cuatrimestre;
            return true;
        }
    }
    public static void limpiarCodigos(){
        codigos.clear();
    }
    
    @Override
    public void mostrarResumen() {
        System.out.println("=== MATERIA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Cuatrimestre: " + cuatrimestre);
        System.out.println("Año: " + anio);
    }
    public String toTexto(){
    return nombre + ";" + codigo + ";" + cuatrimestre + ";" + anio;
    }
    public static Materia fromTexto(String linea){
    String[] partes = linea.split(";");
    return new Materia(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3]));
    }
}
