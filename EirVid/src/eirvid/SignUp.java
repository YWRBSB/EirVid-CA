/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eirvid;

import java.util.Scanner;
import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author thsan
 */
public class SignUp extends createDatabase {
    
    private static final Scanner myKB = new Scanner(System.in);
    private static final String emailRegex="^[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_'{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}";
    private static boolean result;
    
    public static void CreateAccount() throws SQLException{
        try{
            //Use while loop until user put right email address
            while(!result == true){
                System.out.println("Please, enter an email:");
                email = myKB.nextLine();
                System.out.println("Please, enter a password:");
                password = myKB.nextLine();
                result = email.matches(emailRegex);
                
                if(email.isEmpty() || password.isEmpty()){
                    System.out.println("Please fill all the information");
                }else if(result != true){
                    System.out.println("Please enter a valid email");
                }
                else{
                    //Connect to database
                    Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/useraccount",user,databasePassword);
                    Statement stmt = conn1.createStatement();
                    //mysql statement to insert user sig up record to database
                    sql = "INSERT INTO userinfo (email, password)" + "VALUES ('" + email + "','" + password + "')";
                
                    stmt.executeUpdate(sql);
                    System.out.println("Success!");  
                }myKB.nextLine();
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}
