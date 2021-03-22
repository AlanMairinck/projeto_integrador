/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.List;
import model.ConnectionFactory;
import model.Permission;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alanm
 */
public class PermissionDAO implements GenericDAO<Permission> {

    @Override
    public void insert(Permission t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Permission t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Permission getById(int id) {
        String sql = "SELECT * FROM permission WHERE permission_id =?";
        
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Permission p = null;
        
        try (Connection conn = ConnectionFactory.getConnection()) 
        {
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, id);

            rs = pstmt.executeQuery();
            
            if(rs.next()){
                p = new Permission(rs.getInt("permission_id"),
                                rs.getString("ds_permission"));
            }
        pstmt.close();
        rs.close();
        
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        
        return p;
    }

    @Override
    public List<Permission> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
