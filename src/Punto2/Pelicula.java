/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Pelicula extends Video {

    public Pelicula() {
    }
    
     public void subirPelicula(){
        Scanner sc = new Scanner(System.in);
        FileWriter pw = null;
        try {
            File vid = new File("videos.txt");
            pw = new FileWriter(vid,true);
            System.out.println("Ingrese el tiulo de la pelicula: ");
            String titulo = sc.nextLine();
            System.out.println("Ingrese el director de la pelicula: ");
            String director = sc.nextLine();
            System.out.println("Ingrese el año en el cual fue grabada la pelicula: ");
            int year = sc.nextInt();
           
            pw.write("P, "+ titulo +", "+ director +", "+year);
            pw.close();
            
            
            
        } catch (IOException ex) {
            System.out.println("Error");
        } 
        
    }
}
