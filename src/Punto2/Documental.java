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
public class Documental extends Video {

    public Documental() {
    }
    
    
    public void subirDocumental(){
        Scanner sc = new Scanner(System.in);
        FileWriter pw = null;
        try {
            File vid = new File("videos.txt");
            pw = new FileWriter(vid,true);
            System.out.println("Ingrese el tiulo del documental: ");
            String titulo = sc.nextLine();
            System.out.println("Ingrese el director del documental: ");
            String director = sc.nextLine();
            System.out.println("Ingrese el año en el cual fue grabado el documental: ");
            int year = sc.nextInt();
           
            pw.write("D, "+titulo +", "+ director +", "+year);
            pw.close();
            
            
            
        } catch (IOException ex) {
            System.out.println("Error");
        } 
        
    }
}
