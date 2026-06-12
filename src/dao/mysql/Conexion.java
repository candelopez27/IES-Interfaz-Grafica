package dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // CAMBIADO: Ahora apunta a autogestion_estudiantil
    private static final String URL = "jdbc:mysql://localhost:3306/autogestion_estudiantil?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Vacío por defecto en XAMPP

    public static Connection obtenerConexion() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Error: No se encontró el driver de MySQL: " + e.getMessage());
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}