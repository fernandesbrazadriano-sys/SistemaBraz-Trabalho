/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import bean.AfbVendasProdutos;
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

public class DaoAfbVendasProdutos extends DaoAfbAbstract {
     @Override
    public void insert(Object object) {
        AfbVendasProdutos afbVendasProdutos = (AfbVendasProdutos) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_adriano_braz";
            user = "adriano_braz";
            password = "adriano_braz";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into AFB_Vendas_Produtos values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, afbVendasProdutos.getAfbIdVendaProd());
            pst.setInt(2, afbVendasProdutos.getAfbIdProduto());
            pst.setInt(3, afbVendasProdutos.getAfbIdVenda());
            pst.setString(4, afbVendasProdutos.getAfbDesconto());
            pst.setString(5, afbVendasProdutos.getAfbObservacoes());
             pst.setString(6,afbVendasProdutos.getAfbValorUnitario());
            pst.setInt(7, afbVendasProdutos.getAfbSubtotal());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAfbClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoAfbClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     @Override
    public void update(Object object) {
        AfbVendasProdutos afbVendasProdutos = (AfbVendasProdutos) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_adriano_braz";
            user = "adriano_braz";
            password = "adriano_braz";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement("update set AFB_Vendas_Produtos values(?,?,?,?,?,?,?,?) ");
          
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger( AfbVendasProdutos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger( AfbVendasProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Object object) {
         AfbVendasProdutos  afbVendasProdutos = ( AfbVendasProdutos) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_adriano_braz";
            user = "adriano_braz";
            password = "adriano_braz";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete from AFB_Vendas_Produtos values(?,?,?,?,?,?,?,?) ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            //
             pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger( AfbVendasProdutos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger( AfbVendasProdutos.class.getName()).log(Level.SEVERE, null, ex);
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

