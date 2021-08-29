package modelo;

public class Parcela {

    // Variables
    private int codigoParcela;
    private double perimetro;
    private String tipoTierra;
    private String estado;

    // Consultas
    public static String Listar = "SELECT * FROM Parcela";
    public static String Registar = "INSERT INTO Parcela VALUES(?,?,?)";
    public static String Actualizar = "UPDATE Labor SET labor WHERE idLabor=?";
    public static String Elimidar = "DELETE from Labor WHERE idLabor=?";

    // Getter y Setter

    public int getCodigoParcela() {
        return codigoParcela;
    }

    public void setCodigoParcela(int codigoParcela) {
        this.codigoParcela = codigoParcela;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String getTipoTierra() {
        return tipoTierra;
    }

    public void setTipoTierra(String tipoTierra) {
        this.tipoTierra = tipoTierra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
