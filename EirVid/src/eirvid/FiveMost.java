
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Yuri Ribeiro 2020347 and Thiago 2020327
 */
public class FiveMost {
 public static void  fiveMost() throws IOException{
        
       BufferedReader myReader = new BufferedReader(new FileReader("src/MostRented.txt"));
       
       System.out.println("----------LIST OF THE MOST RENTED MOVIES-----------");
       
       String line = myReader.readLine();
       String [] lineArr;

        
       System.out.println(line);
       
      

        
     while ((line = myReader.readLine()) != null){
             lineArr = line.split(",,");       
            System.out.println(lineArr[0]);
            System.out.println("----------------------------------------------------");
    
         }
 
   }
}
   
