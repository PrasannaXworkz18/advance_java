package com.xworkz.playstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ApplicationPreparedInsert {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/playstore";
        String userName = "root";
        String password = "@Prasanna1525";
        String insertQuarry = "INSERT INTO application(ApplicationId,ApplicationName,size,Companyname,ApplicationType)"+"VALUES(?,?,?,?,?)";

        Connection con=null;
        PreparedStatement stmt=null;
        try {
           con = DriverManager.getConnection(jdbcUrl,userName,password);
            System.out.println("get connection from database");
           stmt = con.prepareStatement(insertQuarry);
//          stmt.setInt(1,11);
//          stmt.setString(2,"Canva");
//          stmt.setDouble(3,59.6);
//          stmt.setString(4,"Canva");
//          stmt.setString(5,"Editing");
//            System.out.println("values inserted");
//          stmt.execute();

            stmt.setInt(1,12);
            stmt.setString(2,"Remini");
            stmt.setDouble(3,45.6);
            stmt.setString(4,"Canva");
            stmt.setString(5,"Editing");
            System.out.println("values inserted");
            stmt.execute();
            System.out.println("value executed");
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
        }


    }
}
