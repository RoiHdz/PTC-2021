package modelo;

public class Labor {
    /*Crear TODOS los campos de la tabla*/
    private int id;
    private String labor;

    /*Cambiar la tabla y campos en las consultas*/
    public static String Listar = "Select * from Labor";
    public static String Registar = "INSERT INTO Labor (labor) VALUES(?)";
    public static String Actualizar = "UPDATE Labor SET labor WHERE idLabor=?";
    public static String Elimidar = "DELETE from Labor WHERE idLabor=?";

    /*Crear metodos get y set de cada variable creada al inicio*/
    /*Solo dale click derecho > insertar codigo > getter y setter > todas las VARIABLES*/
    /*Solo las del inicio, las consultas no*/
    
    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
