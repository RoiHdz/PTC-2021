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
import subPanel.pnlConfiguracion2;

public class MetodoConfigC {

    private static modelo.Conexion con = new modelo.Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    private static pnlConfiguracion2 vista;

    public static boolean isRegister(modelo.MetodoConfig l) {
        String sql = modelo.MetodoConfig.Registar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, l.getMetodoAplicacion());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }

    public static boolean isUpdate(modelo.MetodoConfig l) {
        String sql = modelo.MetodoConfig.Actualizar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, l.getMetodoAplicacion());
            ps.setInt(2, l.getIdMetodo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }

    public static boolean isDelete(modelo.MetodoConfig l) {
        String sql = modelo.MetodoConfig.Elimidar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, l.getIdMetodo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }

    public static void setListar(String buscar) {
        DefaultTableModel model = (DefaultTableModel) pnlConfiguracion2.tblMetodo.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String sql = "";

        if (buscar.equals("")) {
            sql = modelo.MetodoConfig.Listar;
        } else {
            /*Cambiar la consulta*/
            sql = "SELECT * FROM metodoAplicacion WHERE metodoAplicacion LIKE '" + buscar + "%'";
        }
        String datos[] = new String[2];

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idMetodo");
                datos[1] = rs.getString("metodoAplicacion");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            /*Cambiar LaborC*/
            Logger.getLogger(MetodoConfigC.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
           
        public static String extraerIDMax(){
        String sql ="SELECT MAX(idMetodo)AS valor FROM metodoAplicacion";
        int idMetodo=0;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
         idMetodo=rs.getInt("valor");
                     }
            if(idMetodo ==0){
            
           idMetodo=1;     
                }else {
          idMetodo= idMetodo+1;
            
            }
            return String.valueOf(idMetodo);
            
        } catch (Exception ex) {
            return null;
            //Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
