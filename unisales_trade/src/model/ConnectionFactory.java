/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author alanm
 */
public class ConnectionFactory {
    private ConnectionFactory(){throw new UnsupportedOperationException();}
    
    public static Connection getConnection()
    {
        Connection conn = null;
        
        try (InputStream input = ConnectionFactory.class.getClassLoader().getResourceAsStream("connection.properties")){
            Properties prop = new Properties();
            prop.load(input);
            
            String driver = prop.getProperty("jdbc.driver");
            String databaseAddress = prop.getProperty("db.addres");
            String dbname = prop.getProperty("db.name");
            String user = prop.getProperty("db.user.login");
            String password = prop.getProperty("db.user.password");
                        
            StringBuilder sb = new StringBuilder("jdbc:")
                    .append(driver).append("://")
                    .append(databaseAddress).append("/")
                    .append(dbname)
                    .append("?useTimezone=true&serverTimezone=UTC");
            
            String connUrl = sb.toString();
            
            try {
                conn = DriverManager.getConnection(connUrl,user,password);
            } catch (Exception e) {
                System.out.println("FALHA ao tentar conectar!");
                throw new RuntimeException();
            }
            
        } catch (IOException e) {
            System.out.println("FALHA ao carregar arquivo de propriedades!");
            e.printStackTrace();
        }
        return conn;
    }
}
