/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.DAOController;
import java.sql.*;
/**
 *
 * @author cuong
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        DAOController DAO = new DAOController();
        String query = "select * from movie";
        ResultSet rs = DAO.resultSet(query);
        while(rs.next()){
            System.out.println(rs.getInt(1));
        }
    }
}
