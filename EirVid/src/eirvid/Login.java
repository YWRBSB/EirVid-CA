/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.sql.*;

/**
 *
 * @author Xiaohui Weng
 */
public class Login {
    String user = "";
    String databasePassword = "";

    // Check Username and Password
    System.out.print("Enter Username: ");
    String name = sc.next();
    System.out.print("Enter Password: ");
    String password = sc.next();

            // Create SQL Query
            Statement stmt = connection.createStatement();
    String SQL = "SELECT * FROM users WHERE users_name='" + name + "' && users_password='" + password+ "'";

    ResultSet rs = stmt.executeQuery(SQL);

            // Check Username and Password
    while (rs.next()) {
        user = rs.getString("users_name");
        databasePassword = rs.getString("users_password");
    }

    if (name.equals(user) && password.equals(databasePassword)) {
        System.out.println("Successful Login!\n----");
    } else {
        System.out.println("Incorrect Password\n----");
    }
    
    
    
}
