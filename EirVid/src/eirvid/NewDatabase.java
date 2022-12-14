/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Yuri
 */

import javax.print.DocFlavor.STRING;

    //create a database to to store the username and password
    public class NewDatabase {

        static final String DB_URL = "jdbc:mysql://localhost/Account";
        static final String USER = "root";
        static final String PASS = "root";  
        
        //open a connection 
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)
        Statement stmt = conn.createStatement();){

            String sql = "CREATE DATABASE Account" + "CREATE TABLE REGISTRATION " +
                        "(id INTEGER not NULL AUTO_INCREMENT, " +
                        " Username VARCHAR(45), " + 
                        " Password VARCHAR(45), " + 
                        " PRIMARY KEY ( id ))"; 
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");


                  
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


}

    

