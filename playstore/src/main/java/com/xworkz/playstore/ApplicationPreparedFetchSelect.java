package com.xworkz.playstore;

import java.sql.*;

public class ApplicationPreparedFetchSelect {

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
            PreparedStatement state=null;
            try {
                con = DriverManager.getConnection(url,userName,password);
                System.out.println("get connection from database");
                state = con.prepareStatement(fetchQuarry);
                ResultSet rs = state.executeQuery();
                while (rs.next()) {
                    System.out.println("record exist!!!");
                    String name1=rs.getString(1);
                    String name2=rs.getString(2);
                    String name3=rs.getString(3);
                    String name4=rs.getString(4);
                    String name5=rs.getString(5);
                    System.out.println(name1);
                    System.out.println(name2);
                    System.out.println(name3);
                    System.out.println(name4);
                    System.out.println(name5);
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
