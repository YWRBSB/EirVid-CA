/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Yuri
 */
public class Rent {
  
    static Thread tr = new Thread();

    public Rent() throws IOException {
       
        String file = "src/Movie_Metadata_Edited.csv";
        MovieReader movieReader = new MovieReader();
        DataParser dataParser = new DataParser();
        MovieList movieList = new MovieList();

        List<String> lines = movieReader.InputData(file);
        List<MovieMap> movie = dataParser.ParseData(lines);


        
        Scanner userInput = new Scanner(System.in);

        Boolean choice = true;

        // movie selection from the movies available
        int idSelected;
        
        do {
            System.out.println("PLEASE, SELECT THE ID TO RENT THE MOVIE:");
            idSelected = userInput.nextInt();
            System.out.println("");
            

            if (idSelected < 0 || idSelected > 26) {
                System.out.println("PLEASE SELECT THE MOVIES FROM 1 TO 26");
                System.out.println("");

                choice = false;
            } else {
                choice = true;
                
                System.out.println("Congratulations! You have rented the movie: " + movie.get(idSelected).nameMovie + "\nPrice:€ "+ movie.get(idSelected).price +"\nThe duration of the rent is: 1 minute");
            }
        } while (!choice);

        // set the rent duration timer      
        try {
           
                tr.sleep(60000);
               

         } catch (Exception e) {

            e.printStackTrace();
        }

        System.out.println("Your rent is over!");

    }

}
