/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eirvid;

import java.util.Scanner;

/**
 *
 * @author thsan
 */
public class NewAccount {
    
    public static void registration(String[] args) {
        // TODO code application logic here
    
    Scanner myKB = new Scanner(System.in);
        System.out.println("Please, enter an email:");
        String email = myKB.nextLine();
        System.out.println("Please, enter a password:");
        String password = myKB.nextLine();
        
       if(email.isEmpty() || password.isEmpty()){
            System.out.println("please fill all the information!");
        }else{
           System.out.println("Success!");
       }
       
    }
    
}
