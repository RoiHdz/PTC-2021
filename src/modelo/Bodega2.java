package modelo;

public class Bodega2 {

    private int id_BMa;
    private String Nombre;
    private String Marca;
    private int cantidaMax;
    private int cantidadActual;
    private String Estado;  

    /*Cambiar la tabla y campos en las consultas*/
    public static String Listar = "SELECT * FROM B_Maquinaria";
    public static String Registar = "INSERT INTO B_Maquinaria VALUES(?, ?, ? , ?,?)";
    public static String Actualizar = "UPDATE B_Maquinaria SET Nombre, Marca, cantidaMax, cantidadActual WHERE id_BMa=?";
    public static String Elimidar = "DELETE from B_Maquinaria WHERE id_BMa=?";
   

    /*Crear metodos get y set de cada variable creada al inicio*/
    /*Solo dale click derecho > insertar codigo > getter y setter > todas las VARIABLES*/
    /*Solo las del inicio, las consultas no*/

    public int getId_BMa() {
        return id_BMa;
    }

    public void setId_BMa(int id_BMa) {
        this.id_BMa = id_BMa;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getCantidaMax() {
        return cantidaMax;
    }

    public void setCantidaMax(int cantidaMax) {
        this.cantidaMax = cantidaMax;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
       

    
    
    
}