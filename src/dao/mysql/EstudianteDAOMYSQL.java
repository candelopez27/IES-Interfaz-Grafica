package dao.mysql;

import modelo.Estudiante;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAOMYSQL {

    public void guardarEstudiante(Estudiante e) {
        String sql = "INSERT INTO estudiante (legajo, nombre, carrera, anio_ingreso) "
                   + "VALUES (?, ?, ?, ?) "
                   + "ON DUPLICATE KEY UPDATE nombre = ?, carrera = ?, anio_ingreso = ?";
        
        try (Connection con = Conexion.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, e.getLegajo());
            ps.setString(2, e.getNombre());
            ps.setString(3, e.getCarrera());
            ps.setInt(4, e.getAnioIngreso());
            
            // Campos para el UPDATE si ya existe
            ps.setString(5, e.getNombre());
            ps.setString(6, e.getCarrera());
            ps.setInt(7, e.getAnioIngreso());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error al guardar Estudiante en MySQL: " + ex.getMessage());
        }
    }

    public List<Estudiante> obtenerTodos() {
        List<Estudiante> lista = new ArrayList<>();
        String sql = "SELECT * FROM estudiante";
        try (Connection con = Conexion.obtenerConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            
            while (rs.next()) {
                Estudiante e = new Estudiante(
                    rs.getString("legajo"),
                    rs.getString("nombre"),
                    rs.getString("carrera"),
                    rs.getInt("anio_ingreso")
                );
                lista.add(e);
            }
        } catch (SQLException ex) {
            System.err.println("Error al leer Estudiantes de MySQL: " + ex.getMessage());
        }
        return lista;
    }
}