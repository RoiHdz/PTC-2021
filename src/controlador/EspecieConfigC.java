package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import subPanel.pnlConfiguracion1;

public class EspecieConfigC {
    
    private static modelo.Conexion con = new modelo.Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    private static pnlConfiguracion1 vista;
    
        public static boolean isRegister(modelo.EspecieConfig l) {
        /*Cambiar el modelo labor*/
        String sql = modelo.EspecieConfig.Registar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, l.getEspecie());
            ps.setInt   (2, l.getGerminacion());
            ps.setInt   (3, l.getDiasCosecha());
            ps.setString(4, l.getTemporada());
            ps.setInt   (5, l.getMarcoPlantacion());
            ps.setInt   (6, l.getDiasRiego());
            ps.setString(7, l.getEstado());
            ps.setString(8, l.getFoto());
            ps.setString(9, l.getVariacion());
            
            /**/
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    /*Cambiar el modelo Labor*/
    public static boolean isUpdate(modelo.EspecieConfig l) {
        /*Cambiar el modelo Labor*/
        String sql = modelo.EspecieConfig.Actualizar;
        try {
            /* especie=?, germinacion=?, diasCosecha=?,diasRiego=?,estado=?,temporada=?,marcoPlantacion=?*/
            ps = conexion.prepareStatement(sql);
            ps.setString(1, l.getEspecie());
            ps.setInt   (2, l.getGerminacion());
            ps.setInt   (3, l.getDiasCosecha());
            ps.setInt   (4, l.getDiasRiego());
            ps.setString(5, l.getEstado());
            ps.setString(6, l.getTemporada());
            ps.setInt   (7, l.getMarcoPlantacion());
            ps.setString(8, l.getVariacion());
            ps.setString(9, l.getFoto());
            
            
            ps.setInt(10, l.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }

    public static boolean isDelete(modelo.EspecieConfig l) {
        String sql = modelo.EspecieConfig.Elimidar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, l.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }

    public static void setListar(String buscar) {
        /*Cambiar el panel pnlConfiguracion2 y la tabla*/
        DefaultTableModel model = (DefaultTableModel)pnlConfiguracion1.tblEspecies.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String sql = "";

        if (buscar.equals("")) {
            sql = modelo.EspecieConfig.Listar;
        } else {
            /*Cambiar la consulta*/
            sql = "SELECT especie, diasGerminacion, diasCosecha, diasRiego, estado FROM Especie WHERE especie LIKE '" + buscar + "%'";
        }
        String datos[] = new String[9];

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("idEspecie");
                datos[1] = rs.getString("especie");
                datos[2] = rs.getString("germinacion");
                datos[3] = rs.getString("diasCosecha");
                datos[4] = rs.getString("diasRiego");
                 datos[5] = rs.getString("estado");
                 datos[6] = rs.getString("temporada");
                  datos[7] = rs.getString("marcoPlantacion");
                  datos[8] = rs.getString("variacion");
                 
               

                model.addRow(datos);
            }
        } catch (SQLException ex) {
            /*Cambiar LaborC*/
            Logger.getLogger(EspecieConfigC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
        public static String extraerIDMax(){
        String sql ="SELECT MAX(idEspecie)AS valor FROM Especie";
        int idEspecie=0;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
        idEspecie=rs.getInt("valor");
                     }
            if(idEspecie ==0){
            
           idEspecie=1;     
                }else {
           idEspecie= idEspecie+1;
            
            }
            return String.valueOf(idEspecie);
            
        } catch (Exception ex) {
            return null;
            //Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
