/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import modelo.Materia;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author cande
 */

public class MateriaDAO {

    private static final String ARCHIVO = "materias.txt";

    public ArrayList<Materia> leerMaterias() {
        ArrayList<Materia> lista = new ArrayList<>();
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) return lista; // si no existe, lista vacía sin error

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    String[] p = linea.split(",");
                    lista.add(new Materia(p[0], p[1],
                              Integer.parseInt(p[2]),
                              Integer.parseInt(p[3])));
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
                bw.write(m.getNombre() + "," + m.getCodigo() + ","
                       + m.getCuatrimestre() + "," + m.getAnio());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 

