/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author danie
 */
public class Labor {
    
    // Variables
    private int idLabor;
    private String labor;

    // Consultas
    public static String Listar = "SELECT * FROM Labor";
    public static String Registar = "INSERT INTO Labor VALUES(?)";
    public static String Actualizar = "UPDATE Labor SET  labor = ? WHERE idLabor = ?"; 
    public static String Elimidar = "DELETE from Labor WHERE idLabor=?";

    public int getIdLabor() {
        return idLabor;
    }

    public void setIdLabor(int idLabor) {
        this.idLabor = idLabor;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }
    
    
}
