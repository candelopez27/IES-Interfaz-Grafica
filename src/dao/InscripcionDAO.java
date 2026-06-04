
package dao;

import modelo.InscripcionMateria;
import modelo.Materia;
import java.io.*;
import java.util.ArrayList;

public class InscripcionDAO {
    private static final String ARCHIVO = "inscripciones.txt";

    // Lee el archivo y devuelve la lista de inscripciones
    public ArrayList<InscripcionMateria> cargarInscripciones(ArrayList<Materia> todasLasMaterias) {
        ArrayList<InscripcionMateria> lista = new ArrayList<>();

        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            return lista; // devuelve lista vacía sin error
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    InscripcionMateria insc = InscripcionMateria.fromTexto(linea, todasLasMaterias);
                    if (insc != null) {
                        lista.add(insc);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer inscripciones: " + e.getMessage());
        }

        return lista;
    }

    // Escribe toda la lista de inscripciones en el archivo
    public void guardarInscripciones(ArrayList<InscripcionMateria> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (InscripcionMateria insc : lista) {
                bw.write(insc.toTexto());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar inscripciones: " + e.getMessage());
        }
    }
    
}
