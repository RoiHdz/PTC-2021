package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import subPanel.pnlBodega2;

public class Bodega2C {

    private static modelo.Conexion con = new modelo.Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    /*Cambiar el panel LaborC*/
    private static pnlBodega2 vista;

    public static boolean isRegister(modelo.Bodega2 l) {
        /*Cambiar el modelo labor*/
        String sql = modelo.Bodega2.Registar;
        try {
            ps = conexion.prepareStatement(sql);
            /*Vas a poner todo los Set que hayas creado y el numero significa el orden */
            /*El orden que va de campo (No poner el setId porque es auto incrementable)*/
            ps.setString(1, l.getNombre());
            ps.setString(2, l.getMarca());
            ps.setInt(3, l.getCantidadMax());
            ps.setInt(4, l.getCantidadActual());
            /**/
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    /*Cambiar el modelo Labor*/
    public static boolean isUpdate(modelo.Bodega2 l) {
        /*Cambiar el modelo Labor*/
        String sql = modelo.Bodega2.Actualizar;
        try {
            ps = conexion.prepareStatement(sql);
            /*Colocar todos los get en orden de la tabla y por ultimo el id*/
            ps.setString(1, l.getNombre());
            ps.setString(2, l.getMarca());
            ps.setInt(3, l.getCantidadMax());
            ps.setInt(4, l.getCantidadActual());
            ps.setInt(5, l.getIdMaquinaria());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static boolean isDelete(modelo.Bodega2 l) {
        String sql = modelo.Labor.Elimidar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, l.getIdMaquinaria());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void setListar(String buscar) {
        /*Cambiar el panel pnlConfiguracion2 y la tabla*/
        DefaultTableModel model = (DefaultTableModel)pnlBodega2.tblMaquinaria.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String sql = "";

        if (buscar.equals("")) {
            sql = modelo.Bodega2.Listar;
        } else {
            /*Cambiar la consulta*/
            sql = "SELECT * FROM Labor WHERE B_Maquinaria LIKE '" + buscar + "%'";
        }
        String datos[] = new String[5];

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                /*Colocar los get en orden que se mostraran en la tabla*/
                /*lo que va entre comillas es como se llama en la tabal SER EXACTOS*/
                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("marca");
                datos[2] = rs.getString("cantidadMax");
                datos[3] = rs.getString("cantidadActual");
                datos[4] = rs.getString("estado");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            /*Cambiar LaborC*/
            Logger.getLogger(Bodega2C.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }
    
    public static String extraerIdMax(){
        /*Cambiar consulta*/
        String sql="select max(idMaquinaria) FROM B_Maquinaria";
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
}