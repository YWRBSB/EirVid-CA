/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.util.Timer;

/**
 *
 * @author Yuri
 */
public class RentalDuration {
    public static void main(String[] args) {
        Timer timer = new Timer();
        movieDuration task = new movieDuration();
        
        
        timer.schedule(task, 0 , 60000);
    }
}
