package eirvid;

import java.sql.SQLException;
import java.sql.*;

public class createDatabase {

    /**
     * author: xiaohui weng
     */
    public static void Database() throws SQLException{
            //create a database and table for user email address and password
            // when the project start
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
            }
        try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root"); Statement stmt = conn.createStatement()) {
            
            String sql = "CREATE DATABASE userAccount";

            stmt.executeUpdate(sql);
            sql = "USE userAccount";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE useInfo (id INT NOT NULL AUTO_INCREMENT, email VARCHAR(45),password VARCHAR(45), PRIMARY KEY (id))";
            stmt.executeUpdate(sql);
        } 



    }
    
}
