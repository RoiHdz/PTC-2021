/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

   
public class B_FAQ {
    private int idFAQ;
    private String Nombre;
    private double cantidadMax;
    private double cantidadActual;
     private String Tipo;     
    private String Estado;  
     

    /*Cambiar la tabla y campos en las consultas*/
    public static String Listar = "SELECT * FROM B_FAQ";
    public static String Registar = "INSERT INTO B_FAQ VALUES(?,?,?,?,?)";
    public static String Actualizar = "UPDATE B_FAQ SET Nombre=?,  cantidadMax=?, cantidadActual=?,Estado=?,Tipo=? WHERE idFAQ=?";
    public static String Elimidar = "DELETE from B_Maquinaria WHERE id_BMa=?";

    public int getidFAQ() {
        return idFAQ;
    }

    public void setidFAQ(int idFAQ) {
        this.idFAQ = idFAQ;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(double cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }



    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
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
