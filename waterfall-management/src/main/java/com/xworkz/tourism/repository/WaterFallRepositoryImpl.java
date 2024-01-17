package com.xworkz.tourism.repository;

import com.xworkz.tourism.dto.WaterFalldto;

import java.sql.*;
import java.util.List;

public class WaterFallRepositoryImpl implements WaterFallRepository {

    @Override
    public void saveWater(WaterFalldto waterFall) {
        //database logic - jdbc steps

        System.out.println("Calling waterfall repository impl");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/tourism";
        String userName = "root";
        String password = "@Prasanna1525";
        String insertQuarry = "INSERT INTO waterfall(name,place,rivername,state) VALUES(?,?,?,?)";

        Connection con=null;
        PreparedStatement state = null;
        try {
             con = DriverManager.getConnection(jdbcUrl,userName,password);
            state = con.prepareStatement(insertQuarry);
            state.setString(1,waterFall.getName());
            state.setString(2,waterFall.getPlace());
            state.setString(3,waterFall.getRiverName());
            state.setString(4,waterFall.getState());
            state.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveWater(List<WaterFalldto> waterFalldtos) {
        //database logic - jdbc steps

        System.out.println("Calling waterfall repository impl");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/tourism";
        String userName = "root";
        String password = "@Prasanna1525";
        String insertQuarry = "INSERT INTO waterfall(name,place,rivername,state) VALUES(?,?,?,?)";

        Connection con=null;
        PreparedStatement state = null;
        try {
            con = DriverManager.getConnection(jdbcUrl,userName,password);
            state = con.prepareStatement(insertQuarry);
            for (WaterFalldto waterFalldto : waterFalldtos){
                state.setString(1, waterFalldto.getName());
                state.setString(2, waterFalldto.getPlace());
                state.setString(3, waterFalldto.getRiverName());
                state.setString(4, waterFalldto.getState());
                state.execute();
                System.out.println("inserted values");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public WaterFalldto getWaterFalldtoByName(String waterfalldtoName) {

        System.out.println("Calling waterfall repository impl");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/tourism";
        String userName = "root";
        String password = "@Prasanna1525";
        String fetchtQuarry = "SELECT * FROM waterfall where name=?";

        Connection con=null;
        PreparedStatement state = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection(jdbcUrl,userName,password);
            state = con.prepareStatement(fetchtQuarry);
           state.setString(1,waterfalldtoName);
            rs=state.executeQuery();
            WaterFalldto waterFalldto =new WaterFalldto();
            while (rs.next()){
//                rs.getString("name");
//                rs.getString("place");
//                rs.getString(4);
//                rs.getString("state");
                waterFalldto.setName(rs.getString("name"));
                waterFalldto.setPlace(rs.getString("place"));
                waterFalldto.setRiverName(rs.getString(4));
                waterFalldto.setState(rs.getString("state"));
            }
            return waterFalldto;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
