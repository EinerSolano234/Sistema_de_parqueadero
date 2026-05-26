
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Vehiculo {
    private int id_vehiculo;
    private String  placa; 
    private String  propietario; 
    private String  tipo_vehiculo; 
    private String  hora_entrada; 
    private String  hora_salida;
    private double  valor_pagado;
    private String  estado; 

    public Vehiculo() {
    }
    
    

    public Vehiculo(int id_vehiculo, String placa, String propietario, String tipo_vehiculo, String hora_entrada, String hora_salida, double valor_pagado, String estado) {
        this.id_vehiculo = id_vehiculo;
        this.placa = placa;
        this.propietario = propietario;
        this.tipo_vehiculo = tipo_vehiculo;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.valor_pagado = valor_pagado;
        this.estado = estado;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public double getValor_pagado() {
        return valor_pagado;
    }

    public void setValor_pagado(double valor_pagado) {
        this.valor_pagado = valor_pagado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "id_vehiculo=" + id_vehiculo + ", placa=" + placa + ", propietario=" + propietario + ", tipo_vehiculo=" + tipo_vehiculo + ", hora_entrada=" + hora_entrada + ", hora_salida=" + hora_salida + ", valor_pagado=" + valor_pagado + ", estado=" + estado + '}';
    }
    
    
}
