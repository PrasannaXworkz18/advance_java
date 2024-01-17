package com.xworkz.playstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcPlayerDetailsDelete {
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

       String deleteQuarry="DELETE from playerdetails where name='ROHITH'";
        Connection con=null;
        Statement state=null;
        try {
             con =DriverManager.getConnection(url,userName,password);
            System.out.println("get connection from database");
             state = con.createStatement();
           boolean result= state.execute(deleteQuarry);
            System.out.println("execute return type as " + result);
            System.out.println("data deleted");
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
