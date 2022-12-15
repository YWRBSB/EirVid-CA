/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eirvid;

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
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        createDatabase.Database();
        Menu.showMainMenu();
    }
    
}
