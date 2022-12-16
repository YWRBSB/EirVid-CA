package eirvid;

import java.sql.SQLException;
import java.sql.*;

public class createDatabase {

    /**
     * author: xiaohui weng
     */


     protected static String sql;
     protected static String user ="root";
     protected static String databasePassword ="root";
     protected static String email;
     protected static String password;

    public static void Database() throws SQLException{
            //create a database and table for user email address and password
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
            }
        try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/",user,databasePassword); Statement stmt = conn.createStatement()) {
            //create a database, and also check if database exists or not
            sql = "CREATE DATABASE IF NOT EXISTS userAccount";
            stmt.executeUpdate(sql);

            //use mysql query to use the userAccount database
            sql = "USE userAccount";
            stmt.executeUpdate(sql);

            //create the table of useInfo inside of userAccount database
            sql = "CREATE TABLE IF NOT EXISTS useInfo (id INT NOT NULL AUTO_INCREMENT, email VARCHAR(45),password VARCHAR(45), PRIMARY KEY (id))";
            stmt.executeUpdate(sql);
        } 



    }
    
}
