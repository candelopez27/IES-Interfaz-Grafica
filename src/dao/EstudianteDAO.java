
package dao;
import modelo.Estudiante;
import java.io.*;
public class EstudianteDAO {
    private static final String ARCHIVO = "estudiante.txt";

    // Lee el archivo y devuelve el estudiante
    public Estudiante cargarEstudiante() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            return null; // si no existe, el controlador le va a pedir los datos al usuario
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea = br.readLine();
            if (linea != null && !linea.trim().isEmpty()) {
                return Estudiante.fromTexto(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer estudiante: " + e.getMessage());
        }

        return null;
    }

    // Guarda el estudiante en el archivo
    public void guardarEstudiante(Estudiante estudiante) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))) {
            bw.write(estudiante.toTexto());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar estudiante: " + e.getMessage());
        }
    }
    
}
