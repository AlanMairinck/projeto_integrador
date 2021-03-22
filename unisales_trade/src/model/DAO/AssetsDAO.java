/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Assets;
import model.ConnectionFactory;

/**
 *
 * @author alanm
 */
public class AssetsDAO implements GenericDAO<Assets>{

    @Override
    public void insert(Assets t) {
         String sql = "INSERT INTO "
                    + "portfolio_assets(nm_asset,qt_asset,dt_firstbuy,dt_lastbuy,vl_lastBuy,vl_amountInvested,wallet_id) "
                    + "VALUES(?,?,?,?,?,?,?)";
        
        PreparedStatement pstmt = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, t.getNm_asset());
            pstmt.setObject(2, t.getQt_asset());
            pstmt.setObject(3, t.getDt_firstBuy());
            pstmt.setObject(4, t.getDt_lastBuy());
            pstmt.setObject(5, t.getVl_lastBuy());
            pstmt.setObject(6, t.getVl_amountInvested());
            pstmt.setObject(7, t.getWallet().getId_wallet());

            pstmt.execute();
            pstmt.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
    }

    @Override
    public void update(Assets t) {
        String sql = "UPDATE portfolio_assets set nm_asset=?,qt_asset=?,vl_lastBuy=?,"
                + "vl_amountInvested=?,dt_firstBuy=?,dt_lastBuy=?,"
                + "wallet_id=? WHERE portfolio_assets_id = ?";
        
        PreparedStatement pstmt = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, t.getNm_asset());
            pstmt.setObject(2, t.getQt_asset());
            pstmt.setObject(3, t.getVl_lastBuy());
            pstmt.setObject(4, t.getVl_amountInvested());
            pstmt.setObject(5, t.getDt_firstBuy());
            pstmt.setObject(6, t.getDt_lastBuy());
            pstmt.setObject(7, t.getWallet().getId_wallet());
            pstmt.setObject(8, t.getId_asset());

            pstmt.execute();
            pstmt.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM portfolio_assets WHERE portfolio_assets_id = ?";
        
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
    public Assets getById(int id) {
        String sql = "SELECT * FROM portfolio_assets WHERE portfolio_assets_id=?";
        
        Assets a = null;//new Assets();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, id);
            rs = pstmt.executeQuery();
            
            if(rs.next())
            {
                a = new Assets(rs.getInt("portfolio_assets_id"),
                                    rs.getString("nm_asset"),
                                    rs.getInt("qt_asset"),
                                    rs.getBigDecimal("vl_lastBuy"),
                                    rs.getBigDecimal("vl_amountInvested"),
                                    rs.getDate("dt_firstBuy"),
                                    rs.getDate("dt_lastBuy"),
                                    new WalletDAO().getById(rs.getInt("wallet_id"))
                            );
            }
        pstmt.close();
        rs.close();
        
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        
        return a;
    }

    @Override
    public List<Assets> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Assets> getByWallet(int idWallet) {
        String sql = "SELECT * FROM portfolio_assets WHERE wallet_id = ?";
        
        List<Assets> lAssets = new ArrayList<Assets>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, idWallet);
            rs = pstmt.executeQuery();
            
            while(rs.next())
            {
                lAssets.add(new Assets(
                                        rs.getInt("portfolio_assets_id"),
                                        rs.getString("nm_asset"),
                                        rs.getInt("qt_asset"),
                                        rs.getBigDecimal("vl_lastBuy"),
                                        rs.getBigDecimal("vl_amountInvested"),
                                        rs.getDate("dt_firstBuy"),
                                        rs.getDate("dt_lastBuy"),
                                        new WalletDAO().getById(rs.getInt("wallet_id"))
                                    )
                        );
        }
        pstmt.close();
        rs.close();
        
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        
        return lAssets;
    }

    public Assets getByName(String nm_asset) {
        String sql = "SELECT * FROM portfolio_assets WHERE nm_asset= ?";
        
        Assets assets = null;//new Assets();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, nm_asset);
            rs = pstmt.executeQuery();
            
            if(rs.next())
            {
                assets = new Assets(rs.getInt("portfolio_assets_id"),
                                    rs.getString("nm_asset"),
                                    rs.getInt("qt_asset"),
                                    rs.getBigDecimal("vl_lastBuy"),
                                    rs.getBigDecimal("vl_amountInvested"),
                                    rs.getDate("dt_firstBuy"),
                                    rs.getDate("dt_lastBuy"),
                                    new WalletDAO().getById(rs.getInt("wallet_id"))
                            );
            }
            pstmt.close();
            rs.close();
        
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        
        return assets;
    }

    
}
