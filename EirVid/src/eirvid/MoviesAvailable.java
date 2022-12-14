/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Yuri
 */
public class MoviesAvailable {

    public MoviesAvailable() throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("..//Movie_Metadata_Edited.csv"));

        sc.useDelimiter(",");

        while (sc.hasNext()) {
            System.out.print(sc.next());
        }
        sc.close();

    }

}
