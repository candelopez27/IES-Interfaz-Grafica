package sistemadeautogestionestudiantil;

import java.util.HashSet;

public class Materia {
    private String nombre;
    private String codigo;
    private int cuatrimestre;
    private int anio;
    
    Materia(String materia, String codigo, int cuatrimestre, int anio){
        this.nombre = materia;
        this.codigo = codigo;
        this.cuatrimestre = cuatrimestre;
        this.anio = anio;
    }
    
    public String getNombre() {return nombre;}
    public String getCodigo(){ return codigo;}
    public int getCuatrimestre(){ return cuatrimestre;}
    public int getAnio(){ return anio;}
    
    
    private static HashSet<String> codigos = new HashSet<>();
    void setCodigo(String codigo){
        if (!codigos.contains(codigo)) {
            this.codigo = codigo;
            codigos.add(codigo);
        }else{
            System.out.println("El código ya existe");
        }
    }
    
    void setCuatrimestre(int cuatrimestre){
        if (cuatrimestre != 1 && cuatrimestre !=2) {
            System.out.println("Error: Cuatrimestre debe ser 1 o 2");
        } else {
            this.cuatrimestre = cuatrimestre; //guarda el valor que recibió el setter en el atributo del objeto.
        }
    }
}
