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
public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {            
            System.out.println(i); //Sentencia
            i++;
        } while (i < 5); //Condicion | Dara vuelta hasta que la condicion sea falsa
        
        Scanner imput = new Scanner(System.in);
        int opcion = 0;
        do {
        System.out.println("Ingrese opcion: Cual es mi nombre");
        System.out.println("1 - Arnold ");
        System.out.println("2 - Marlon ");
        System.out.println("3 - Salir ");
        opcion = imput.nextInt();
            if (opcion == 3) {
                break;
            }
        } while (opcion != 2);
        System.out.println("Hola Marlon");
    }
}
