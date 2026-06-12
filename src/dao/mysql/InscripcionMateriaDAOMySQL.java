package dao.mysql;

import modelo.InscripcionMateria;
import java.sql.*;
import java.util.ArrayList;

public class InscripcionMateriaDAOMySQL {

    public void guardarInscripcion(String legajoEstudiante, InscripcionMateria ins) {
        String sql = "INSERT INTO inscripciones (legajo_estudiante, codigo_materia, total_clases, clases_asistidas, notas) "
                   + "VALUES (?, ?, ?, ?, ?) "
                   + "ON DUPLICATE KEY UPDATE total_clases = ?, clases_asistidas = ?, notas = ?";
        
        // Convertimos la lista de notas de tipo Double a String separado por comas
        StringBuilder notasStr = new StringBuilder();
        ArrayList<Double> listaNotas = ins.getNotas();
        if (listaNotas != null) {
            for (int i = 0; i < listaNotas.size(); i++) {
                notasStr.append(listaNotas.get(i));
                if (i < listaNotas.size() - 1) {
                    notasStr.append(",");
                }
            }
        }

        try (Connection con = Conexion.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            // Parámetros para el INSERT
            ps.setString(1, legajoEstudiante);
            ps.setString(2, ins.getMateria().getCodigo());
            ps.setInt(3, ins.getTotalClases());
            ps.setInt(4, ins.getClasesAsistidas());
            ps.setString(5, notasStr.toString());
            
            // Parámetros para el UPDATE
            ps.setInt(6, ins.getTotalClases());
            ps.setInt(7, ins.getClasesAsistidas());
            ps.setString(8, notasStr.toString());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.err.println("Error al guardar Inscripción en MySQL: " + ex.getMessage());
        }
    }
}