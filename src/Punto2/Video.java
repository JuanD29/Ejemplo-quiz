/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.io.PrintWriter;

/**
 *
 * @author Estudiante
 */
public abstract class Video {
    private String titulo;
    private String director;
    private int year;

    public Video() {
       
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    

    
    
}
