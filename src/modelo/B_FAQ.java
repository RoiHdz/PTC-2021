/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author danie
 */
public class B_FAQ {

    private int id_BFAQ;
    private String Nombre;
    private double cantidad_Max;
    private double cantidad_Actual;
    private String Tipo;
    private String Estado;


    /*Cambiar la tabla y campos en las consultas*/
    public static String Listar = "SELECT nombre, cantidadMax, cantidadActual, tipo, Estado FROM B_FAQ";
    public static String Registar = "INSERT INTO B_FAQ VALUES(?,?,?,?,?)";
    public static String Actualizar = "UPDATE B_FAQ SET Nombre,  cantidad_Max, cantidad_Actual,Estado,Tipo WHERE id_FAQ=?";
    public static String Elimidar = "DELETE from B_Maquinaria WHERE id_BMa=?";

    public int getId_BFAQ() {
        return id_BFAQ;
    }

    public void setId_BFAQ(int id_BFAQ) {
        this.id_BFAQ = id_BFAQ;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getCantidad_Max() {
        return cantidad_Max;
    }

    public void setCantidad_Max(double cantidad_Max) {
        this.cantidad_Max = cantidad_Max;
    }

    public double getCantidad_Actual() {
        return cantidad_Actual;
    }

    public void setCantidad_Actual(double cantidad_Actual) {
        this.cantidad_Actual = cantidad_Actual;
    }

    public void setCantidad_Actual(int cantidad_Actual) {
        this.cantidad_Actual = cantidad_Actual;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
