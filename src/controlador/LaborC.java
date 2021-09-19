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
import subPanel.pnlConfiguracion2;

/**
 *
 * @author danie
 */
public class LaborC {
   private static modelo.Conexion con = new modelo.Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    private static  pnlConfiguracion2 vista;

    public static boolean isRegister(modelo.Labor l) {
        String sql = modelo.Labor.Registar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, l.getLabor());
           
            ps.executeUpdate();
            return true;
        } catch (SQLException ex){
            System.out.println(ex);
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static boolean isUpdate(modelo.Labor l) {
        /*Cambiar el modelo Labor*/
        String sql = modelo.Labor.Actualizar;
        try {
            
            ps = conexion.prepareStatement(sql); 
            ps.setString(1, l.getLabor());
            ps.setInt(2, l.getIdLabor());
           
            
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static boolean isDelete(modelo.Parcela l) {
        String sql = modelo.Parcela.Elimidar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, l.getCodigoParcela());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void setListar(String buscar) {
        /*Cambiar el panel pnlConfiguracion2 y la tabla*/
        DefaultTableModel model = (DefaultTableModel)pnlConfiguracion2.tblLabores.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String sql = "";

        if (buscar.equals("")) {
            sql = modelo.Labor.Listar;
        } else {
            /*Cambiar la consulta*/
            sql = "SELECT *FROM Labor WHERE ( "             
                   
                    +"labor LIKE '" + buscar + "%' " 
                   + ")";
        }
        String datos[] = new String[2];

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("idLabor");
                datos[1] = rs.getString("labor");
              
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            /*Cambiar LaborC*/
            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static String extraerIDMAX(){
        String sql ="SELECT MAX(idLabor)AS valor FROM Labor";
        int idLabor=0;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
         idLabor=rs.getInt("valor");
                     }
            if(idLabor ==0){
            
           idLabor=1;     
                }else {
            idLabor= idLabor+1;
            
            }
            return String.valueOf(idLabor);
            
        } catch (Exception ex) {
            return null;
            //Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    }

