/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Assets;
import model.ConnectionFactory;
import model.DAO.WalletDAO;
import view.WellcomeTradeUI;

/**
 *
 * @author alanm
 */
public class unisales_trade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        String nm_asset = "bidi4";
//         String sql = "SELECT * FROM portfolio_assets WHERE nm_asset= ?";
//        
//        Assets assets = new Assets();
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//        
//        try (Connection conn = ConnectionFactory.getConnection()) 
//        {
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setObject(1, nm_asset);
//            rs = pstmt.executeQuery();
//            
//            System.out.println(rs.getRow());
//            
//            if(rs.getRow() != 0)
//            {
//                assets.setId_assets(rs.getInt("portfolio_assets_id"));
//                assets.setNm_assets(rs.getString("nm_assets"));
//                assets.setQt_assets(rs.getInt("qt_asset"));
//                assets.setVl_lastBuy(rs.getBigDecimal("vl_lastBuy"));
//                assets.setVl_amountInvested(rs.getBigDecimal("vl_amountInvested"));
//                assets.setDt_firstBuy(rs.getDate("dt_firtBuy"));
//                assets.setDt_lastBuy(rs.getDate("dt_lastBuy"));
//                assets.setWallet(new WalletDAO().getById(rs.getInt("wallet_id")));
//            }
//            pstmt.close();
//            rs.close();
//        
//        } catch (SQLException e) 
//        {
//            e.printStackTrace();
//        } 
        
        
        WellcomeTradeUI wellcome = new WellcomeTradeUI();
        wellcome.setLocationRelativeTo(null);
        wellcome.setVisible(true);
    }
    
}
