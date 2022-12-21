/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Yuri Ribeiro 2020347 and Leisly Pino 2020303
 */
public class MoviesAvailable {

    public MoviesAvailable() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

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

    public String getId() {
        return id;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public String getPrice() {
        return price;
    }

    public String getAvailable() {
        return available;
    }
}