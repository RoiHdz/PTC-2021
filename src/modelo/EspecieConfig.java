package modelo;

public class EspecieConfig {

    private int id;
    private String especie;
    private int germinacion;
    private int diasCosecha;
    private String temporada;
    private int marcoPlantacion;
    private int diasRiego;
    private String estado;
    private String foto;

    public static String Listar = "SELECT especie, germinacion, diasCosecha, diasRiego, estado FROM Especie";
    public static String Registar = "INSERT INTO Especie VALUES(?,?,?,?,?,?,?,?)";
    public static String Actualizar = "UPDATE Especie SET especie=?, germinacion=?, diasCosecha=?, temporada=?, marcoPlantacion=?, diasRiego=?, estado=?, foto=? WHERE idEspecie=?";
    public static String Elimidar = "DELETE FROM especie WHERE idEspecie=?";

    public EspecieConfig() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getGerminacion() {
        return germinacion;
    }

    public void setGerminacion(int germinacion) {
        this.germinacion = germinacion;
    }

    public int getDiasCosecha() {
        return diasCosecha;
    }

    public void setDiasCosecha(int diasCosecha) {
        this.diasCosecha = diasCosecha;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getMarcoPlantacion() {
        return marcoPlantacion;
    }

    public void setMarcoPlantacion(int marcoPlantacion) {
        this.marcoPlantacion = marcoPlantacion;
    }

    public int getDiasRiego() {
        return diasRiego;
    }

    public void setDiasRiego(int diasRiego) {
        this.diasRiego = diasRiego;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}
