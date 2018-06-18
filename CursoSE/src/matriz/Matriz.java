/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author mpluas
 */
public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3]; //Fila/Columna
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Imgrese elemento para posicion Fila: " + i + " Columna: " + j);
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("---------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t"); //Tabulamos
            }
            System.out.print("\n"); //Salto de linea
        }
    }
}
