package com.xworkz.playstore;

import java.sql.*;

public class ApplicationPreparedDelete {

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

            String deleteQuarry="Delete from application where ApplicationName=?";
            Connection con=null;
            PreparedStatement state=null;
            try {
                con = DriverManager.getConnection(url,userName,password);
                System.out.println("get connection from database");
                state = con.prepareStatement(deleteQuarry);
                state.setString(1,"YouTube");
                state.execute();
                System.out.println("Record deleted");

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
