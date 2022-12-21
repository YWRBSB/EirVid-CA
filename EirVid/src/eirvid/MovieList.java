/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Leisly Pino 2020303, Yuri Ribeiro 2020347
 */
class MovieList {
    
    public void movieList (List<MovieMap> movie) throws IOException{
        for (MovieMap movies: movie){
            System.out.println(returnId(movies.id) + "        "+ movies.nameMovie + "        "+movies.price + "        "+ movies.available);
        }
    }
    
    // return the movie ID from the csv on integer 1.
    public String returnId(String id){
        
      
      try {
          return Integer.toString(Integer.valueOf(id)+1);
        }catch (Exception e) {
            return id;
      }
}

}

