package com.xworkz.playstore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApplicationInsert {

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

        String insertQuery = "INSERT INTO application(ApplicationId,ApplicationName,size,CompanyName,ApplicationType)"+
                "Values(10,'YouTube',47.5,'Google','Entertainment')";

        Connection con=null;
        Statement state = null;
        try{
            con = DriverManager.getConnection(JdbsUrl,userName,password);
            System.out.println("get connection from database");
            state = con.createStatement();
            boolean result = state.execute(insertQuery);
            System.out.println("Execute return type "+result);
            System.out.println("insert data into database!!!!");
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
