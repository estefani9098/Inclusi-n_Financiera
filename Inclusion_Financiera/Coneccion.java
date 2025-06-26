package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
        Connection con;

    public Connection getConnection() {
        try {
            String url = "jdbc:sqlserver://LAPTOP-1U6TKV21\\SQLEXPRESS01:1433;databaseName=bdinclusionfinanciera;encrypt=true;trustServerCertificate=true";
            String usuario = "Diana7347";
            String contraseña = "MiClave2025*";

            con = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("✅ Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("❌ Error en la conexión: " + e.getMessage());
        }
        return con;
    }

    public static void main(String[] args) {
        new Conexion().getConnection();
    }
}
