package controlador;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import subPanel.pnlParcela1;

public class ParcelaC {
        private static modelo.Conexion con = new modelo.Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    private static pnlParcela1 vista;

    public static boolean isRegister(modelo.Parcela l) {
        String sql = modelo.Parcela.Registar;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setDouble(1, l.getPerimetro());
            ps.setString(2, l.getTipoTierra());
            ps.setString(3, l.getEstado());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex){
            System.out.println(ex);
            return false;
//            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static boolean isUpdate(modelo.Parcela l) {
        /*Cambiar el modelo Labor*/
        String sql = modelo.Parcela.Actualizar;
        try {
            
            ps = conexion.prepareStatement(sql);        
            ps.setDouble(1, l.getPerimetro());
            ps.setString(2, l.getTipoTierra());
            ps.setString(3, l.getEstado());
            ps.setInt(4, l.getCodigoParcela());
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
        DefaultTableModel model = (DefaultTableModel)pnlParcela1.tblParcela.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        String sql = "";

        if (buscar.equals("")) {
            sql = modelo.Parcela.Listar;
        } else {
            /*Cambiar la consulta*/
            sql = "SELECT *FROM Parcela WHERE ( "             
                    + "Perimetro LIKE '" + buscar + "%' OR"  
                    +"TipoTierra LIKE '" + buscar + "%' OR " 
                    +"Estado LIKE '" + buscar + "%' " 
                   + ")";
        }
        String datos[] = new String[4];

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("codigoParcela");
                datos[1] = rs.getString("perimetro");
                datos[2] = rs.getString("tipoTierra");
                datos[3] = rs.getString("Estado");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            /*Cambiar LaborC*/
            Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static String extraerIDMax(){
        String sql ="SELECT MAX(codigoParcela)AS valor FROM Parcela";
        int codigoParcela=0;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
         codigoParcela=rs.getInt("valor");
                     }
            if(codigoParcela ==0){
            
           codigoParcela=1;     
                }else {
            codigoParcela= codigoParcela+1;
            
            }
            return String.valueOf(codigoParcela);
            
        } catch (Exception ex) {
            return null;
            //Logger.getLogger(LaborC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    }
