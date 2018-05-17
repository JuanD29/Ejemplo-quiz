/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author Estudiante
 */
public class Bank{
   
     public static Account cuenta;
     public static int saldo;
     public static int ID;
     
     public static void main(String[] args) {
         
         Account cuenta = new Account(ID);
         cuenta.setCredit();
    }
}
