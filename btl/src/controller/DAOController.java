/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author cuong
 */
public class DAOController {
    private Connection con = null;
    public static Connection connection() {
        final String url = "jdbc:mysql://localhost:3306/btl";
        final String user = "root";
        final String password = "admin";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
     return null;   
    }
    
    public static ResultSet resultSet(String query) throws SQLException{
        Connection con = connection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        return rs;
    }
   
    public static void insertRecord(String sql) 
    {
        Connection con = connection();
        try {
          Statement stmt = con.createStatement();
          stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
    }
    
}
