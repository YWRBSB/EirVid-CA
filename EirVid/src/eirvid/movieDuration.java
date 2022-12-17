/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.util.TimerTask;

/**
 *
 * @author mauro
 */
public class movieDuration extends TimerTask {

    movie movie = new movie();
    @Override
    public void run() {
        movieRented();
    }
    
    public void movieRented(){
       
        System.out.println("movie rented" + movie.toString());
    }
}
