package modelo;

public class Variacion {
    private int id;
    private String variacion;
    private int idEspecie;
    
    public static String Listar = "SELECT variacion, idEspecie FROM Variacion";
    public static String Registar = "INSERT INTO Variacion VALUES(?,?)";
    public static String Actualizar = "UPDATE variacion=?, idEspecie=? SET Variacion WHERE idVariacion=?";
    public static String Elimidar = "DELETE FROM variacion WHERE idVariacion=?";

    public Variacion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVariacion() {
        return variacion;
    }

    public void setVariacion(String variacion) {
        this.variacion = variacion;
    }

    public int getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }
    
    
}
