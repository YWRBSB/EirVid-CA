
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Thiago 2020327
 */
public class FiveMost {
    
    public FiveMost() throws FileNotFoundException, IOException {
    //track all the informatio that users have rented
    //something that can track users history
  
    //Trying to work on the code below to find the most repeated movies rented by users//
    //Array to store movie titles selected by users//
    //Titles written in array below are just examples. They should be inputs by the user from the class Rent//
    String[] rented = {"Heat", "Balto", "Nixon", "Heat", "Heat", "Balto", "Nixon", "Heat", "Heat", "Nixon", "Heat"};
         Arrays.sort(rented);
         int counter = 0;
         String aux=rented[0];
    
    for(int i=0; i<rented.length; i++){
        if(aux==rented[i])
        {
          counter++;  
        }
        else{
            System.out.println("The movie " + aux + " was rented " + counter + " times");
            counter=1;
            aux=rented[i];
        }
    }
            System.out.println("The movie " + aux + " was rented " + counter + " times");
    
    
    }  
}