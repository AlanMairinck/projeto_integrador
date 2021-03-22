/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.ConnectionFactory;
import model.Trader;

/**
 *
 * @author alanm
 */
public class TraderDAO implements GenericDAO<Trader>{
    
    public Trader getTraderCPF(String cpf) throws SQLException
    {
        String sql = "SELECT * FROM trader WHERE cpf =?";
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Trader trader = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, cpf);

            rs = pstmt.executeQuery();
            
            if(rs.next()){
            trader = new Trader(rs.getInt("trader_id"),
                                rs.getString("nm_trader"),
                                rs.getString("cpf"),
                                rs.getDate("dt_birthday"),
                                rs.getString("password"),
                                rs.getString("email"),
                                new PermissionDAO().getById(rs.getInt("permission_id")));
        }
        pstmt.close();
        rs.close();
        
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        
        return trader;
    }

    @Override
    public void insert(Trader t) {
        String sql = "INSERT INTO trader (nm_trader,cpf,dt_birthday,password,email,permission_id) "
                     +"VALUES(?,?,?,?,?,?)";
        
        PreparedStatement pstmt = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, t.getNm_trader());
            pstmt.setObject(2, t.getCpf());
            pstmt.setObject(3, t.getDt_birthday());
            pstmt.setObject(4, t.getPassword());
            pstmt.setObject(5, t.getEmail());
            pstmt.setObject(6, t.getPermission().getId_permission());

            pstmt.execute();
            pstmt.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
    }

    @Override
    public void update(Trader t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Trader getById(int id) 
    {
        String sql = "SELECT * FROM trader WHERE trader_id =?";
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Trader trader = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, id);

            rs = pstmt.executeQuery();
            
            if(rs.next()){
            trader = new Trader(rs.getInt("trader_id"),
                                rs.getString("nm_trader"),
                                rs.getString("cpf"),
                                rs.getDate("dt_birthday"),
                                rs.getString("password"),
                                rs.getString("email"),
                                new PermissionDAO().getById(rs.getInt("permission_id")));
        }
        pstmt.close();
        rs.close();
        
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        
        return trader;
    }

    @Override
    public List<Trader> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
