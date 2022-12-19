/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.io.IOException;
import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author Yuri
 */
public class Menu   {

    public static Scanner scanner = new Scanner(System.in);

    public static void showMainMenu() throws IOException, SQLException {
        

        do {
            System.out.println("Welcome to EirVId");
            System.out.println("1 - Create new account");
            System.out.println("2 - Login");
            System.out.println("3 - Movies available to rent");
            System.out.println("5 - Five most rented movies");
            System.out.println("0 - Exit");
            System.out.print("Choice -> ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                //Create new account and store the information into mysql database
                SignUp.CreateAccount();
                    break;
                case "2":
                    // call Login function
                    Login.loginAuth();
                    break;
                case "3":
                    // call the class
                    MoviesAvailable movies = new MoviesAvailable();
                     break;
                case "4":
                    // call the class
                    break;
                case "0":
                    scanner.close();
                    return;
            }
        } while (true);

    }
}
