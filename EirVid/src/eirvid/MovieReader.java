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
 * @author Leisly Pino 2020303
 */
public class MovieReader {
    public List<String> InputData(String file) throws FileNotFoundException, IOException{
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List <String> lines = new ArrayList<>();
        String line;
        
        while((line = reader.readLine()) != null){
            lines.add(line);
        }
        return lines;
    }
}
