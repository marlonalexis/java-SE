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
public class VectoresMasoMenos {
    public static void main(String[] args) {
        String[] nombres = new String[3];
        int[] edades = new int[3];
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese nombre: ");
            nombres[i] = sc.next();
            System.out.println("Ingrese edad: ");
            edades[i] = sc.nextInt();
        }
        
        System.out.println("-------------------------");
        //Encontrar el mayor vector
        int mayor = edades[0];
        int menor = edades[0];
        int posicion = 0;
        int posicion2 = 0;
        for (int i = 0; i < 3; i++) {
            if (edades[i] > mayor) {
                mayor = edades[i];
                posicion = i;
            }
        }
        System.out.println("El mayor es " + mayor);
        System.out.println("Su nombre es " + nombres[posicion]);
        for (int i = 0; i < 3; i++) {
            if (edades[i] < menor) {
                menor = edades[i];
                posicion2 = i;
            }
        }
        System.out.println("El menor es " + menor);
        System.out.println("Su nombre es " + nombres[posicion2]);

    }
}
