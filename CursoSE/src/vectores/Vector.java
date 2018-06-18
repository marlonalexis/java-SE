/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author mpluas
 */
public class Vector {
    public static void main(String[] args) {
        String[] array = new String[2];
        array[0] = "Marlon";
        array[1] = "Pluas";
        //Nota: Un arreglo es inmutable quiere decir que no puede ser modifcado, hay que definir un tamano
        
        for (String string : array) {
            System.out.println(string);
        }
        
        Scanner imput = new Scanner(System.in);
        System.out.println("Ingrese el numero de arreglos");
        int n = imput.nextInt();
        String[] arreglo = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese nombre");
            String nombre = imput.next();
            arreglo[i] = nombre;
        }
        System.out.println("Lista de nombres");
        for (String string : arreglo) {
            System.out.println(string);
        }
    }
}
