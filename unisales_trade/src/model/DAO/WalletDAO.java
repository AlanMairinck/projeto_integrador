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
import java.util.ArrayList;
import java.util.List;
import model.ConnectionFactory;
import model.Wallet;

/**
 *
 * @author alanm
 */
public class WalletDAO implements GenericDAO<Wallet>{

    @Override
    public void insert(Wallet t) 
    {
        String sql = "INSERT INTO wallet (nm_wallet,amount_invested,dt_create,trader_id) "
                     +"VALUES(?,?,?,?)";
        
        PreparedStatement pstmt = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, t.getNm_wallet());
            pstmt.setObject(2, t.getAmount_invested());
            pstmt.setObject(3, t.getDt_created());
            pstmt.setObject(4, t.getTrader().getId_trader());

            pstmt.execute();
            pstmt.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
    }

    @Override
    public void update(Wallet t) {
        String sql = "UPDATE wallet set nm_wallet=?,amount_invested=?,dt_create=?,trader_id=? WHERE wallet_id = ?";
        
        PreparedStatement pstmt = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, t.getNm_wallet());
            pstmt.setObject(2, t.getAmount_invested());
            pstmt.setObject(3, t.getDt_created());
            pstmt.setObject(4, t.getTrader().getId_trader());
            pstmt.setObject(5, t.getId_wallet());

            pstmt.execute();
            pstmt.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM wallet WHERE wallet_id=?";
        
        PreparedStatement pstmt = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, id);
            pstmt.execute();
            pstmt.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
    }

    @Override
    public Wallet getById(int id) {
        String sql = "SELECT * FROM wallet WHERE wallet_id=?";
        
        Wallet w = new Wallet();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, id);
            rs = pstmt.executeQuery();
            
            while(rs.next())
            {
                w.setId_wallet(rs.getInt("wallet_id"));
                w.setNm_wallet(rs.getString("nm_wallet"));
                w.setAmount_invested(rs.getBigDecimal("amount_invested"));
                w.setDt_created(rs.getDate("dt_create"));
                w.setTrader(new TraderDAO().getById(rs.getInt("trader_id")));
        }
        pstmt.close();
        rs.close();
        
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        
        return w;
    }

    @Override
    public List<Wallet> getAll() {
        String sql = "SELECT * FROM wallet";
        
        List<Wallet> lWallet = new ArrayList<Wallet>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while(rs.next())
            {
                lWallet.add(new Wallet(
                                        rs.getInt("wallet_id"),
                                        rs.getString("nm_wallet"),
                                        rs.getBigDecimal("amount_invested"),
                                        rs.getDate("dt_create"),
                                        new TraderDAO().getById(rs.getInt("trader_id"))
                                    )
                        );
        }
        pstmt.close();
        rs.close();
        
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        
        return lWallet;
    }
    
    public List<Wallet> getByIdTrader(int idTrader) {
        String sql = "SELECT * FROM wallet WHERE trader_id=?";
        
        List<Wallet> lWallet = new ArrayList<Wallet>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, idTrader);
            rs = pstmt.executeQuery();
            
            while(rs.next())
            {
                lWallet.add(new Wallet(
                                        rs.getInt("wallet_id"),
                                        rs.getString("nm_wallet"),
                                        rs.getBigDecimal("amount_invested"),
                                        rs.getDate("dt_create"),
                                        new TraderDAO().getById(rs.getInt("trader_id"))
                                    )
                        );
        }
        pstmt.close();
        rs.close();
        
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        
        return lWallet;
    }
}
