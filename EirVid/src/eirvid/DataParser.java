/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leisly Pino 2020303
 */
public class DataParser {
    public List<MovieMap> ParseData(List<String> lines) {
        List<MovieMap> movie = new ArrayList<>();
        DataSeparator dataSeparator = new DataSeparator();
        DataMapper dataMapper = new DataMapper();
        
        lines.forEach(line -> {
            // Splitting
            String[] movies = dataSeparator.Separate(line);
            
                movie.add(dataMapper.Map(movies));
            
        });   
        return movie;
    }
}
