/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eirvid;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;


/**
 *
 * @author Yuri, Xiaohui Weng, Leisly, Thiago
 */
public class EirVid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException, FileNotFoundException, InstantiationException, ClassNotFoundException, IllegalAccessException {
        // TODO code application logic here
        // call the Database function, when the first user starts to run the project
        //which will create the database for uses automatically 
        createDatabase.Database();
        Menu.showMainMenu();
           }
    
}
