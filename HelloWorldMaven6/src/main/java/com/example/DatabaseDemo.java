package com.example;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;

/**
 * Created by albert on 07/03/2017.
 */
public class DatabaseDemo {

    public void preparedStmt(){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("830270");
        dataSource.setServerName("localhost");
        dataSource.setDatabaseName("test");

        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update users SET address=? where name=?");
            preparedStatement.setString(1, "chongqin");
            preparedStatement.setString(2, "albert");
            int result = preparedStatement.executeUpdate();

            System.out.println("affected rows: " + result);

//            this.query();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void modify(){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("830270");
        dataSource.setServerName("localhost");
        dataSource.setDatabaseName("test");

        try {
            Connection connection = dataSource.getConnection();
            Statement stmt = connection.createStatement();
            int result = stmt.executeUpdate("insert into users values(null, 'albert', 13012345678, 'albert@gmail.com', 'shanghai');");

            System.out.println("affected rows: " + result);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void query(){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("albert");
        dataSource.setPassword("56474587");
        dataSource.setServerName("cxmj.ctv3njakg56i.ap-northeast-2.rds.amazonaws.com");
        dataSource.setDatabaseName("tea_renaissance");

        try {
            Connection connection = dataSource.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user");

            // print all column names
            ResultSetMetaData metaData = rs.getMetaData();
            int colCount = metaData.getColumnCount();
            for (int i = 1; i <= colCount; i++) {
                String name = metaData.getColumnName(i);
                System.out.println(name);
            }

            // print all column values
            while(rs.next()){
                for (int i = 1; i <= colCount; i++) {
                    System.out.print(rs.getString(i) + ",\t\t");
                }
                System.out.println();
            }

            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
