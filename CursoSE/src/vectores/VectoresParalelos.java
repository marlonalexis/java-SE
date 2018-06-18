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
public class VectoresParalelos {
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
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Nombre: " + nombres[i] + " Edad: " + edades[i]);
        }
    }
}
