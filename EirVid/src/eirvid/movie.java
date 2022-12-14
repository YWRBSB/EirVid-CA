/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eirvid;

/**
 *
 * @author xiaoh
 */

import java.util.List;
import java.util.ArrayList;

// CSV parser library

// Movie class
//class Movie {
//    private String title;
//    private int rentalRate;
//
//    public Movie(String title, int rentalRate

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class movie {
    public static void main(String[] args) {
        // read the CSV file with the list of movies
        List<movie> movies = readMoviesFromCSV("movies.csv");

        // print the list of movies
        for (movie movie : movies) {
            System.out.println(movie.gettitle() + " (" + movie.getprice() + ")");
        }

        // rent a movie
        movie selectedMovie = selectMovie(movies);
        if (selectedMovie != null) {
            System.out.println("You have rented the movie: " + selectedMovie.gettitle());
        } else {
            System.out.println("No movie was selected.");
        }
    }

    // reads the list of movies from the given CSV file
    private static List<movie> readMoviesFromCSV(String fileName) {
        List<movie> movies = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                // create a new movie object
                movie movie = new movie();
                movie.settitle(values[0]);
                movie.setprice(Integer.parseInt(values[1]));

                // add the movie to the list
                movies.add(movie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return movies;
    }

    private static movie selectMovie(List<movie> movies) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String gettitle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getprice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void settitle(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setprice(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    // prompts the user to select a movie from the given list of movies
    // private static Movie selectMovie(List<Movie> movies) {
        // TODO: prompt the user to select a movie