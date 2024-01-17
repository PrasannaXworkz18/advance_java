package com.xworkz.playstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ApplicationUpdate {


        public static void main(String[] args) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Loading driver class");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            String JdbsUrl="jdbc:mysql://localhost:3306/playstore";
            String userName="root";
            String password="@Prasanna1525";

            String updateQuery = "UPDATE application set size=70," + " Companyname='zomo' where ApplicationName = 'Zomato'";
            String updateQuery2 = "UPDATE application set size=30," + " Companyname='meta' where ApplicationName = 'WhatsApp'";

            Connection con=null;
            Statement state = null;
            try{
                con = DriverManager.getConnection(JdbsUrl,userName,password);
                System.out.println("get connection from database");
                state = con.createStatement();
                boolean result = state.execute(updateQuery);
                boolean result2 = state.execute(updateQuery2);
                System.out.println("Execute return type "+result);
                System.out.println("update data into database!!!!");
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
            }
        }
    }

