package modelo;

public class Bodega2 {

    private int idMaquinaria;
    private String Nombre;
    private String Marca;
    private int cantidadMax;
    private int cantidadActual;
    private String Estado;  

    /*Cambiar la tabla y campos en las consultas*/
    public static String Listar = "SELECT * FROM B_Maquinaria";
    public static String Registar = "INSERT INTO B_Maquinaria VALUES(?, ?, ? , ?,?)";
    public static String Actualizar = "UPDATE B_Maquinaria SET Nombre=?, Marca=?, cantidadMax=?, cantidadActual=? ,Estado=? WHERE idMaquinaria=?";
    
    public static String Elimidar = "DELETE from B_Maquinaria WHERE id_BMa=?";
   

    /*Crear metodos get y set de cada variable creada al inicio*/
    /*Solo dale click derecho > insertar codigo > getter y setter > todas las VARIABLES*/
    /*Solo las del inicio, las consultas no*/

    public int getidMaquinaria() {
        return idMaquinaria;
    }

    public void setId_BMa(int idMaquinaria) {
        this.idMaquinaria = idMaquinaria;
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

    public int getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(int cantidaMax) {
        this.cantidadMax = cantidaMax;
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