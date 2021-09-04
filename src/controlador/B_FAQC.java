/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import subPanel.pnlBodega3;
import modelo.B_FAQ;

/**
 *
 * @author danie
 */
public class B_FAQC {
    
    
    private static modelo.Conexion con = new modelo.Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    /*Cambiar el panel LaborC*/
    private static pnlBodega3 vista;

    public static boolean isRegister(modelo.B_FAQ l) {
        /*Cambiar el modelo labor*/
        String sql = modelo.B_FAQ.Registar;
        try {
            ps = conexion.prepareStatement(sql);
            /*Vas a poner todo los Set que hayas creado y el numero significa el orden */
            /*El orden que va de campo (No poner el setId porque es auto incrementable)*/
             
            ps.setString(1, l.getNombre());
            ps.setDouble(2, l.getCantidad_Max());
            ps.setDouble(3, l.getCantidad_Actual());
            ps.setString(4, l.getTipo());
             ps.setString(5, l.getEstado());
            /**/
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    /*Cambiar el modelo Labor*/
    public static boolean isUpdate(modelo.B_FAQ l) {
        /*Cambiar el modelo Labor*/
        String sql = modelo.B_FAQ.Actualizar;
        try {
            ps = conexion.prepareStatement(sql);
            /*Colocar todos los get en orden de la tabla y por ultimo el id*/
           
            ps.setString(1, l.getNombre());
            ps.setDouble(2, l.getCantidad_Max());
            ps.setDouble(3, l.getCantidad_Actual());
            ps.setString(4, l.getTipo());
             ps.setString(5, l.getEstado());
           
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static boolean isDelete(modelo.B_FAQ l) {
        String sql = modelo.B_FAQ.Elimidar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, l.getId_BFAQ());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void setListar(String buscar) {
        /*Cambiar el panel pnlConfiguracion2 y la tabla*/
        DefaultTableModel model = (DefaultTableModel)pnlBodega3.tblBFAQ.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String sql = "";

        if (buscar.equals("")) {
            sql = modelo.B_FAQ.Listar;
        } else {
            /*Cambiar la consulta*/
            sql = "SELECT * FROM B_FAQ WHERE id_BFAQ LIKE '" + buscar + "%'";
        }
        String datos[] = new String[6];

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                /*Colocar los get en orden que se mostraran en la tabla*/
                /*lo que va entre comillas es como se llama en la tabal SER EXACTOS*/
                datos[0] = rs.getString("id_BFAQ");
                datos[1] = rs.getString("Nombre");
                datos[2] = rs.getString("cantidad_Max");
                datos[3] = rs.getString("cantidad_Actual");
                datos[4] = rs.getString("Tipo");
                datos[5] = rs.getString("Estado");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            /*Cambiar LaborC*/
            Logger.getLogger(B_FAQC.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }
    /*
    public static String extraerIdMax(){
      
        String sql="select max(id_BFAQ) FROM B_FAQ";
        int id = 0;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                id = rs.getInt(1);
            }
            if (id == 0) {
                id = 1;
            }
            else{
                id = id + 1;
            }
            return String.valueOf(id);
        } catch (SQLException ex) {
            return null;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
*/
    
}
