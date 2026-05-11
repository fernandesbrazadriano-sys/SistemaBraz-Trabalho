/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import bean.AfbVendas;
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

public class DaoAfbVendas extends DaoAfbAbstract {
     @Override
    public void insert(Object object) {
        AfbVendas afbVendas = (AfbVendas) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_adriano_braz";
            user = "adriano_braz";
            password = "adriano_braz";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into AFB_Vendas values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, afbVendas.getAfbIdVenda());
            pst.setInt(2, afbVendas.getAfbIdCliente());
            pst.setInt(3, afbVendas.getAfbIdVendedor());
            pst.setString(4, afbVendas.getAfbAtivo());
            pst.setInt(5, afbVendas.getAfbTotal());
             pst.setDate(6, null);
            pst.setString(7, afbVendas.getAfbObservacoes());
            pst.setString(8, afbVendas.getAfbFormaPagamento());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAfbClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoAfbClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     @Override
    public void update(Object object) {
        AfbVendas afbVendas = (AfbVendas) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_adriano_braz";
            user = "adriano_braz";
            password = "adriano_braz";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement("update set AFB_Vendas values(?,?,?,?,?,?,?,?) ");
          
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger( AfbVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger( AfbVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
         AfbVendas  afbVendas = ( AfbVendas) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_adriano_braz";
            user = "adriano_braz";
            password = "adriano_braz";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete from AFB_Vendas values(?,?,?,?,?,?,?,?) ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            //
             pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger( AfbVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger( AfbVendas.class.getName()).log(Level.SEVERE, null, ex);
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

