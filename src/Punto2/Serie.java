/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Serie extends Video {
    
    private int capitulos;
    private int temporadas;
    
    public Serie() {
        
    }
    
   
   
    public void subirSerie(){
        Scanner sc = new Scanner(System.in);
        FileWriter pw = null;
        try {
            File vid = new File("videos.txt");
            pw = new FileWriter(vid,true);
            System.out.println("Ingrese el tiulo de la serie: ");
            String titulo = sc.nextLine();
            System.out.println("Ingrese el director de la serie: ");
            String director = sc.nextLine();
            System.out.println("Ingrese el año en el cual fue grabada la serie: ");
            int year = sc.nextInt();
            System.out.println("Ingrese el numero de capitulos: ");
            capitulos = sc.nextInt();
            System.out.println("Ingrese el numero de temporadas: ");
            temporadas = sc.nextInt();
            
            pw.write("S, "+titulo +", "+ director +", "+year+", "+capitulos+", "+temporadas );
            pw.close();
            
            
            
        } catch (IOException ex) {
            System.out.println("Error");
        } 
        
    }

    
}
