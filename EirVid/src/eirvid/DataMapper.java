/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

/**
 *
 * @author Leisly Pino 2020303
 */
public class DataMapper {
    public MovieMap Map (String [] movie){
        String id = movie[0];
        String nameMovie = movie[1];
        String price = movie[2];
        String available = movie[3];
        
        return new MovieMap(id, nameMovie, price, available);
    }
}
