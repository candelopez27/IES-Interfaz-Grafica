package dao;
import modelo.Materia;
import java.io.*;
import java.util.ArrayList;

public class MateriaDAO {

    private static final String ARCHIVO = "materias.txt";

    public ArrayList<Materia> leerMaterias() {
        ArrayList<Materia> lista = new ArrayList<>();
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return lista;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    lista.add(Materia.fromTexto(linea));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void guardarMaterias(ArrayList<Materia> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (Materia m : lista) {
                bw.write(m.toTexto());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}