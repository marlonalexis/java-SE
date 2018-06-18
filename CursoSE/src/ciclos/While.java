/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author mpluas
 */
public class While {
    public static void main(String[] args) {
        boolean condicion = false;
        int i = 0;
        while (condicion) { //Condicion, se ejecutara siempre hasta que la condicion sea falsa            
            System.out.println("Hola");
        }
        while (i < 10) {            
            System.out.println("Numero " + i);
            i++; //Contador - Sumar
            //i--; //Contador - Restar
        }
        Scanner imput = new Scanner(System.in);
        System.out.println("Ingrese nombre del admin");
        String adm = imput.next();
        while (!adm.equalsIgnoreCase("marlon")) {            
            System.out.println("No eres el admin");
            adm = imput.next();
        }
        System.out.println("Hola Admin Marlon");
    }
}
