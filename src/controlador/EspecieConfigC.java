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
            ps = conexion.prepareStatement(sql);
            ps.setString(1, l.getEspecie());
            ps.setInt   (2, l.getGerminacion());
            ps.setInt   (3, l.getDiasCosecha());
            ps.setString(4, l.getTemporada());
            ps.setInt   (5, l.getMarcoPlantacion());
            ps.setInt   (6, l.getDiasRiego());
            ps.setString(7, l.getEstado());
            ps.setString(8, l.getFoto());
            ps.setInt(9, l.getId());
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
        String datos[] = new String[5];

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("especie");
                datos[1] = rs.getString("germinacion");
                datos[2] = rs.getString("diasCosecha");
                datos[3] = rs.getString("diasRiego");
                datos[4] = rs.getString("estado");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            /*Cambiar LaborC*/
            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
