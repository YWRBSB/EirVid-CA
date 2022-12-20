/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Yuri
 */
public class MoviesAvailable {

    public MoviesAvailable() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        String file = "src/Movie_Metadata_Edited.csv";
        MovieReader movieReader = new MovieReader();
        DataParser dataParser = new DataParser();
        MovieList movieList = new MovieList();

        List<String> lines = movieReader.InputData(file);
        List<MovieMap> movie = dataParser.ParseData(lines);

        movieList.movieList(movie);
        Rent movieRent = new Rent();
    }
}
class MovieMap {
    String id;
    String nameMovie;
    String price;
    String available;

    public MovieMap(String id, String nameMovie, String price, String available) {
        this.id = id;
        this.nameMovie = nameMovie;
        this.price = price;
        this.available = available;
    }
}