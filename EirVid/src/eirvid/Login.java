/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author Xiaohui Weng
 */
public class Login extends createDatabase{
    public Login(){}
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void loginAuth() throws SQLException{
        
//        String user;
//        String databasePassword;

        // Check Username and Password
        System.out.print("Enter Username or Email Address: ");
        String email = sc.next();
        System.out.print("Enter Password: ");
        String password = sc.next();

        //connect java to mysql database
       try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/",user,databasePassword); 
             Statement stmt = conn.createStatement()) {
        
        // Create SQL Query
        sql = "SELECT * FROM userAccount.useInfo WHERE email='" + email + "' && password='" + password+ "'";

        ResultSet rs = stmt.executeQuery(sql);

        // Check Username and Password
        while (rs.next()) {
            user = rs.getString("email");
            databasePassword = rs.getString("password");
        }

        if (email.equals(user) && password.equals(databasePassword)) {
            System.out.println("Successful Login!\n----");
        } else {
            System.out.println("Incorrect Password\n----");
        }
    
    }
}
}
