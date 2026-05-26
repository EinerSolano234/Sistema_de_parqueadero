
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    public static Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    Connection conectar = null;
    
    String usuario = "root";
    String contrasena = "1234";
    String bd = "parqueadero";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
    
    public Connection establecerConexion() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conectar = DriverManager.getConnection(cadena, usuario, contrasena);

            System.out.println("Conexión exitosa");

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("Error en la conexión: " + e.toString());

        }

        return conectar;
    }


    
}
