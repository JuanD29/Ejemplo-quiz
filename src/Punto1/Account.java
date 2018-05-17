/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

import java.util.Scanner;
import static Punto1.Bank.ID;
/**
 *
 * @author Estudiante
 */
public class Account {
    
    private int id;
    private double credit = 0.0;

    public Account(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = ID;
    }
    
    public int getId() {
        return id;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuanto dinero desea consignar: ");
        double credito = sc.nextDouble();
        this.credit = credito;
    }
    
    
}
