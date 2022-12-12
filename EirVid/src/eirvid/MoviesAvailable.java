/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yuri
 */
public class  MoviesAvailable  {
     BufferedReader myReader;
     public MoviesAvailable() throws FileNotFoundException, IOException {
        this.myReader = new BufferedReader(new FileReader("../Movie_Metadata_Edited.csv"));
    }
     
    public List<String> ReadMoviesData() throws FileNotFoundException, IOException {
        List<String> movies = new ArrayList<>();
        String inputLine = myReader.readLine();
        while ((inputLine = myReader.readLine()) != null) {
            movies.add(inputLine);
        }
        return movies;
    }
}
