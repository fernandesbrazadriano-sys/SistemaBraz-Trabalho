/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import bean.AfbUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import dao.DaoAfbAbstract;


/**
 *
 * @author u07994189199
 */

public class DaoAfbUsuarios  extends DaoAfbAbstract {
     @Override
    public void insert(Object object) {
        AfbUsuarios afbUsuarios = (AfbUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_adriano_braz";
            user = "adriano_braz";
            password = "adriano_braz";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into AFB_Usuarios values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, afbUsuarios.getAfbIdUsuarios());
            pst.setString(2, afbUsuarios.getAfbNome());
            pst.setString(3, afbUsuarios.getAfbApelido());
            pst.setString(4, afbUsuarios.getAfbCpf());
            pst.setDate(5, null);
            pst.setInt(6, afbUsuarios.getAfbNivel());
            pst.setString(7, afbUsuarios.getAfbSenha());
            pst.setString(8, afbUsuarios.getAfbAtivo());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAfbUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoAfbUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     @Override
    public void update(Object object) {
        AfbUsuarios afbUsuarios = (AfbUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_adriano_braz";
            user = "adriano_braz";
            password = "adriano_braz";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement("update set AFB_Usuarios values(?,?,?,?,?,?,?,?) ");
          
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger( AfbUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger( AfbUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
         AfbUsuarios  afbUsuarios = ( AfbUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_adriano_braz";
            user = "adriano_braz";
            password = "adriano_braz";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete from AFB_Usuarios values(?,?,?,?,?,?,?,?) ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            //
             pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger( AfbUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger( AfbUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;
    }
}

