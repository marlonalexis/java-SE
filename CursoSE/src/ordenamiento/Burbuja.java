/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.Scanner;

/**
 *
 * @author mpluas
 */
public class Burbuja {
    //Metodo burbuja - Este algoritmo consiste en revisar cada elemento de la lista que va hacer ordenada
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamano del vector");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese numero " + i);
            num = sc.nextInt();
            numeros[i] = num;
        }
        System.out.println("------------------------------");
        //Ordenar de menor a mayor
        int aux; //varianle auxiliar
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) { //A medida de ordenamiento va a la parte inferior
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        System.out.println("-------------------------");
        
        String[] nombres = new String[n];
        String nomb;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese Nombre " + i);
            nomb = sc.next();
            nombres[i] = nomb;
        }
        System.out.println("-------------------------");
        String aux2; //varianle auxiliar
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) { //A medida de ordenamiento va a la parte inferior
                if (nombres[j].compareTo(nombres[j + 1]) > 0) {
                    aux2 = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = aux2;
                }
            }
        }
        
        for (String valor : nombres) {
            System.out.println(valor);
        }
    }
}
