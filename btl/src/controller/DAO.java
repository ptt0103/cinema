
package controller;

import java.sql.*;
public class DAO {
    public Connection connection(){
        String url = "jdbc:mysql://localhost:3306/btl";
        String user = "root";
        String pass = "admin";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, pass);
        }catch(ClassNotFoundException | SQLException e){}
        return null;
    }
    
    public ResultSet getResultSet(String query) throws SQLException{
        Connection con = connection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        return rs;
    }
    
    public void insertRecord(String query) throws SQLException{
        Connection conn = connection();
        Statement stm = conn.createStatement();
        stm.executeUpdate(query);
    }
    public static String changeDate1(String date){
        String []w = date.split("-");
        String tmp = "";
        for(int i = 2; i>0; ++i){
            tmp += w[i] + "/";
        }
        tmp += w[0];
        return tmp;
    }
    public static String changeDate2(String date){
        String []w = date.split("-");
        String tmp = "";
        for(int i = 2; i>0; ++i){
            tmp += w[i] + "-";
        }
        tmp += w[0];
        return tmp;
    }
    
}