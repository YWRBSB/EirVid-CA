/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Yuri
 */
public class MoviesAvailable {

    public MoviesAvailable() throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("..//test.csv"));

        sc.useDelimiter(",");

        while (sc.hasNext()) {
            System.out.print(sc.next());
        }
        sc.close();

    }
public List<String> getMovies (String line) {
    List<String> movies = new ArrayList<String>();
    try (Scanner rowScanner = new Scanner(line)) {
        rowScanner.useDelimiter(",");
        while (rowScanner.hasNext()) {
            movies.add(rowScanner.next());
        }
    }
    return movies;
}
}
