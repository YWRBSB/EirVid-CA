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

    public MoviesAvailable() throws FileNotFoundException, IOException {

        String file = "..//Movie_Metadata_Edited.csv";
        BufferedReader reader = null;
        String line = " ";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {

                String[] row = line.split(",");

                for (String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }

    public List<String> getMovies(String line) {
        List<String> movies = new ArrayList<String>();
        try ( Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {
                movies.add(rowScanner.next());
            }
        }
        return movies;
    }
}
