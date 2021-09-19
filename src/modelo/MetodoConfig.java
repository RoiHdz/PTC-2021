package modelo;

public class MetodoConfig {

    private int idMetodo;
    private String metodoAplicacion;

    public static String Listar = "SELECT * FROM metodoAplicacion";
    public static String Registar = "INSERT INTO metodoAplicacion VALUES(?)";
    public static String Actualizar = "UPDATE metodoAplicacion SET metodoAplicacion = ? WHERE idMetodo=?";
    public static String Elimidar = "DELETE FROM metodoAplicacion WHERE idMetodo=?";

    public MetodoConfig() {
    }

    public int getIdMetodo() {
        return idMetodo;
    }

    public void setIdMetodo(int idMetodo) {
        this.idMetodo = idMetodo;
    }

    public String getMetodoAplicacion() {
        return metodoAplicacion;
    }

    public void setMetodoAplicacion(String metodoAplicacion) {
        this.metodoAplicacion = metodoAplicacion;
    }

}
