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

public class VariacionC {

    private static modelo.Conexion con = new modelo.Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    private static pnlConfiguracion1 vista;

    public static boolean isRegister(modelo.Variacion l) {
        String sql = modelo.Variacion.Registar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, l.getVariacion());
            ps.setInt(2, l.getIdEspecie());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public static boolean isUpdate(modelo.Variacion l) {
        String sql = modelo.Variacion.Actualizar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, l.getVariacion());
            ps.setInt(2, l.getIdEspecie());
            ps.setInt(3, l.getIdVariacion());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }

    public static boolean isDelete(modelo.Variacion l) {
        String sql = modelo.Variacion.Elimidar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, l.getIdVariacion());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void setListar(String buscar) {
        /*Cambiar el panel pnlConfiguracion2 y la tabla*/
        DefaultTableModel model = (DefaultTableModel) pnlConfiguracion1.tblVariacion.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String sql = "";

        if (buscar.equals("")) {
            sql = modelo.Variacion.Listar;
        } else {
            /*Cambiar la consulta*/
            sql = "SELECT variacion, idEspecie FROM Variacion WHERE variacion LIKE '" + buscar + "%'";
        }
        String datos[] = new String[2];

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("variacion");
                datos[1] = rs.getString("idEspecie");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VariacionC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
