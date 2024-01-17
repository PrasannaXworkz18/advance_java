package com.xworkz.playstore;

import java.sql.*;

public class ApplicationFetch {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Loading the class");

        String url="jdbc:mysql://localhost:3306/playstore";
        String userName="root";
        String password="@Prasanna1525";

        String fetchQuarry="Select * from application";
        Connection con=null;
        Statement state=null;
        try {
            con = DriverManager.getConnection(url,userName,password);
            System.out.println("get connection from database");
            state = con.createStatement();
            ResultSet rs = state.executeQuery(fetchQuarry);
            while (rs.next()) {
                System.out.println("record exist!!!");
                String name=rs.getString(3);// OR
                String name2=rs.getString("ApplicationName");
                System.out.println(name2);
                System.out.println(name);
                System.out.println("fetch a data ");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        finally {
            if(con!=null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(state!=null) {
                try {
                    state.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            ;
        }

    }
}
