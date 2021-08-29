package modelo;

public class Bodega2 {

    private int idMaquinaria;
    private String nombre;
    private String marca;
    private int cantidadMax;
    private int cantidadActual;
    private int idEM;  

    /*Cambiar la tabla y campos en las consultas*/
    public static String Listar = "select b.nombre,b.marca,b.cantidadMax,b.cantidadActual, e.estado from B_Maquinaria B INNER JOIN\n" +
    "EstadoMaquinaria E ON (E.idEM = B.idEM)";
    public static String Registar = "INSERT INTO B_Maquinaria VALUES(?, ?, ? , ?, 1)";
    public static String Actualizar = "UPDATE B_Maquinaria SET nombre, marca, cantidadMax, cantidadActual WHERE idLabor=?";
    public static String Elimidar = "DELETE from Labor WHERE idLabor=?";

    /*Crear metodos get y set de cada variable creada al inicio*/
    /*Solo dale click derecho > insertar codigo > getter y setter > todas las VARIABLES*/
    /*Solo las del inicio, las consultas no*/
    
        public int getIdMaquinaria() {
        return idMaquinaria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    /*Crear TODOS los campos de la tabla*/
    public int getIdEM() {
        return idEM;
    }

    public void setIdMaquinaria(int idMaquinaria) {
        this.idMaquinaria = idMaquinaria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCantidadMax(int cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void setIdEM(int idEM) {
        this.idEM = idEM;
    }

    
    
    
}