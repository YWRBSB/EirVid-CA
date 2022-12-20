/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import static com.sun.tools.attach.VirtualMachine.list;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import static java.nio.file.Files.list;
import static java.util.Collections.list;
import java.util.Scanner;

/**
 *
 * @author Yuri
 */
public class Rent {
    static Thread tr = new Thread();
    public Rent(){
    
    Scanner userInput = new Scanner(System.in); 
         
         Boolean choice = true;
   
         // movie selection from the movies available
         int idSelected;
         
      do{
         System.out.println("PLEASE, SELECT THE ID TO RENT THE MOVIE:");
          idSelected = userInput.nextInt();
                      System.out.println("");

      if (  idSelected < 0 || idSelected > 25){             
            System.out.println("PLEASE SELECT THE MOVIES FROM 1 TO 25");
            System.out.println("");

            choice = false;
     }
           

         else{
          choice = true;
          System.out.println("Congrats! You have rented the movie: " +idSelected +" for 1 minute.");
             }
      }  while (!choice); 
     
        // set the rent duration timer      
      try {
          for  (int t = 60 ; t > 0; t--){
            tr.sleep(1000);
            System.out.println(t);
            
        }
        }catch(Exception e){
            
            e.printStackTrace();
        }
         
        System.out.println("Your rent is over!");
      
      }
    
}
        
     
      