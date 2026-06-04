package modelo;

abstract class PersonaAcademica {
    private String nombre;
    private String legajo;
    PersonaAcademica(String nombre, String legajo){
        this.nombre = nombre;
        this.legajo = legajo;
    }
    
    public String getNombre(){
        if (nombre ==null  || nombre.isEmpty()   ) {
           return "El nombre no puede estar vacío";
        }
        return nombre;
    }
    public String getLegajo (){
        if (legajo == null) {
            return "El legajo no puede ser nulo";
        }
        return legajo;
    }
    
    abstract void mostrarResumen(); 
}
