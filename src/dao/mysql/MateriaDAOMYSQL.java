package dao.mysql;

import modelo.Materia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MateriaDAOMYSQL {

    public void guardarMateria(Materia m) {
        String sql = "INSERT INTO materias (codigo, nombre, cuatrimestre, anio) "
                   + "VALUES (?, ?, ?, ?) "
                   + "ON DUPLICATE KEY UPDATE nombre = ?, cuatrimestre = ?, anio = ?";
        
        try (Connection con = Conexion.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, m.getCodigo());
            ps.setString(2, m.getNombre());
            ps.setInt(3, m.getCuatrimestre());
            ps.setInt(4, m.getAnio());
            
            ps.setString(5, m.getNombre());
            ps.setInt(6, m.getCuatrimestre());
            ps.setInt(7, m.getAnio());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error al guardar Materia en MySQL: " + ex.getMessage());
        }
    }

    public List<Materia> obtenerTodas() {
        List<Materia> lista = new ArrayList<>();
        String sql = "SELECT * FROM materias";
        try (Connection con = Conexion.obtenerConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            
            while (rs.next()) {
                Materia m = new Materia(
                    rs.getString("nombre"),
                    rs.getString("codigo"),
                    rs.getInt("cuatrimestre"),
                    rs.getInt("anio")
                );
                lista.add(m);
            }
        } catch (SQLException ex) {
            System.err.println("Error al leer Materias de MySQL: " + ex.getMessage());
        }
        return lista;
    }
}