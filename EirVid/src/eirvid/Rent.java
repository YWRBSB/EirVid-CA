/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import static com.sun.tools.attach.VirtualMachine.list;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.nio.file.Files.list;
import java.sql.SQLException;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Yuri Ribeiro 2020347
 */
public class Rent {

    static Thread tr = new Thread();

    public Rent() throws IOException, SQLException, FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        // read the csv file
        String filecsv = "src/Movie_Metadata_Edited.csv";
        MovieReader movieReader = new MovieReader();
        DataParser dataParser = new DataParser();
        MovieList movieList = new MovieList();
       
        // create the file writer for the most rented movies
       
         File file = new File("src/MostRented.txt");
         FileWriter fw = new FileWriter (file, true);
         PrintWriter pw = new PrintWriter(fw);
         
        List<String> lines = movieReader.InputData(filecsv);
        List<MovieMap> movie = dataParser.ParseData(lines);

        Scanner userInput = new Scanner(System.in);

        Boolean choice = true;

        // movie selection from the movies available
        int idSelected;

        do {
            System.out.println("");
            System.out.println("PLEASE, SELECT THE ID TO RENT THE MOVIE OR 0 TO EXIT:");
            idSelected = userInput.nextInt();
            System.out.println("");

            if (idSelected < 0 || idSelected > 26) {
                System.out.println("PLEASE SELECT THE MOVIES FROM 1 TO 26");
                System.out.println("");

                choice = false;
            } else if (idSelected == 0) {

                System.out.println("See you next time!");
                choice = true;
                Menu menu = new Menu();
                menu.showMainMenu();

            } else {
                choice = true;
              pw.println(movie.get(idSelected).nameMovie);
              pw.close();                 
                System.out.println("Congratulations! You have rented the movie: " + movie.get(idSelected).nameMovie + "\nPrice:€ " + movie.get(idSelected).price + "\nThe duration of the rent is: 1 minute "
                        + "\n--------ENJOY!-------");

            }
        } while (!choice);

        // set the rent duration timer      
        try {

            tr.sleep(60000);

        } catch (Exception e) {

            e.printStackTrace();
        }

        System.out.println("Your rent is over!");
        Rent movieRent = new Rent();
        
       
        
         
         
    }

}
