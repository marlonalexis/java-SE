/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadatos;

import java.util.Scanner;

/**
 *
 * @author mpluas
 */
public class EntradaDeDatos {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in); //Guarda la variable en la memoria
        System.out.println("Cual es tu nombre ");
        String nombre = imput.next(); //Retorna en un String lo que ingresamos por consola
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Cual es tu edad ");
        int edad = imput.nextInt();
        System.out.println("Mi edad es " + edad);
    }
    
}
