//Lucas
package Punto2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Main {

    public static Serie serie;
    public static Documental documental;
    public static Pelicula pelicula;

    public static void main(String[] args) {
        int tipo;
        serie =  new Serie();
        documental = new Documental();
        pelicula = new Pelicula();
        System.out.println("Si desea subir una serie presione 1.");
        System.out.println("Si desea subir un documental presione 2.");
        System.out.println("Si desea subir una pelicula presione 3.");
        
        Scanner sc = new Scanner(System.in);
        tipo = sc.nextInt();
        switch (tipo) {
            case 1:
                newLine();
                serie.subirSerie();
                break;
            case 2:
                newLine();
                documental.subirDocumental();
                break;
            case 3:
                newLine();
                pelicula.subirPelicula();
        }

    }

    public static void newLine() {
        try {
            FileWriter line = new FileWriter("videos.txt", true);
            line.write("\n");
            line.close();
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
    
    public static void tipoVideo(){
        Scanner sc = new Scanner(System.in);
        //Buscar las lineas que comienzan con S,P o D y mostrarlas en panatalla.
    }
}
