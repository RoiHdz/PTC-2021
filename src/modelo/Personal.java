package modelo;

import java.util.Date;

public class Personal {

    private int idPersonal;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private String edad;
    private String dui;
    private String nit;
    private String genero;
    private String tipoPersonal;
    private String estado;

    public static String Listar = "SELECT CONCAT(primerNombre, ' ', segundoNombre, ' ', primerApellido, ' ', segundoApellido) AS Nombre, dbo.edad(fechaNacimiento)AS Edad, dui, nit, genero, tipoPersonal, estado FROM Personal";
    public static String Registar = "INSERT INTO Personal VALUES (?,?,?,?,?,?,?,?,?,?)";
    public static String Actualizar = "UPDATE Personal SET primerNombre=?, segundoNombre=?, primerApellido=?, segundoApellido=?, fechaNacimiento=?, dui=?, nit=?, genero=?, tipoPersonal=?, estado=?  WHERE idPersonal=?";
    public static String Elimidar = "DELETE FROM Personal WHERE idPersonal=?";

    public Personal() {
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }    

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoPersonal() {
        return tipoPersonal;
    }

    public void setTipoPersonal(String tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
