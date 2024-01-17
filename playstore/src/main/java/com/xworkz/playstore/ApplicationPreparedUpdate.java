package com.xworkz.playstore;

import java.sql.*;

public class ApplicationPreparedUpdate {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String jdbcUrl= "jdbc:mysql://localhost:3306/playstore";
        String userName = "root";
        String password = "@Prasanna1525";
        String updateQuarry = "update application set size=? where ApplicationId=?";

        Connection con=null;
        PreparedStatement stmt=null;
        try {
           con =  DriverManager.getConnection(jdbcUrl,userName,password);
            stmt = con.prepareStatement(updateQuarry);
            stmt.setDouble(1,30.3);
            stmt.setInt(2,3);
            System.out.println("updated");
            stmt.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            ;
        }
    }
}
