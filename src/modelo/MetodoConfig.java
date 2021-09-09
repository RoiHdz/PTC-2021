package modelo;

public class MetodoConfig {

    private int id;
    private String metodo;

    public static String Listar = "SELECT * FROM metodoAplicacion";
    public static String Registar = "INSERT INTO metodoAplicacion VALUES(?)";
    public static String Actualizar = "UPDATE metodoAplicacion SET metodoAplicacion = ? WHERE idMetodo=?";
    public static String Elimidar = "DELETE FROM metodoAplicacion WHERE idMetodo=?";

    public MetodoConfig() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

}
