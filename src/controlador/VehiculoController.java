
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Vehiculo;
import conexion.Conexion;


public class VehiculoController {
    public boolean guardar(Vehiculo objeto){
    boolean respuesta = false;
    Connection cn = Conexion.conectar();
    
    // Ajustado a 'tb_vehiculos' y al orden exacto de tus columnas
    String sql = "INSERT INTO tb_vehiculos (placa, propietario, tipo_vehiculo, hora_entrada, hora_salida, estado, valor_pagado) VALUES (?, ?, ?, ?, ?, ?, ?)";
    
    try {
        PreparedStatement past = cn.prepareStatement(sql);
        
        // Pasamos los parámetros en el orden exacto de los signos '?' de arriba
        past.setString(1, objeto.getPlaca());
        past.setString(2, objeto.getPropietario());
        past.setString(3, objeto.getTipo_vehiculo()); // Asegúrate de que envíe "carro" o "moto"
        past.setString(4, objeto.getHora_entrada());   // Formato esperado por MySQL: "YYYY-MM-DD HH:MM:SS"
        past.setString(5, objeto.getHora_salida());    // Puede ser null si apenas va a entrar
        past.setString(6, objeto.getEstado());         // Asegúrate de que envíe "parqueado" o "retirado"
        past.setDouble(7, objeto.getValor_pagado());
        
        // Ejecutamos la inserción
        int filasAfectadas = past.executeUpdate();
        if (filasAfectadas > 0) {
            respuesta = true;
        }
        
        // Cerramos la conexión
        cn.close();
        
    } catch (SQLException e) {
        System.out.println("Error al registrar el vehículo en tb_vehiculos: " + e.getMessage());
    }
    
    return respuesta;
   }
        
        
}

