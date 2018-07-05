/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

import java.util.Scanner;

/**
 *
 * @author mpluas
 */
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resultado = sc.next();
        switch(resultado){
            case "Marlon":
                System.out.println("Hola Marlon");
                break;
            case "Arnold":
                System.out.println("Hola Arnold");
                break;
            default:
                System.out.println("Hola mundo");
                break;
        }
        System.out.println("FIN");
    }
}
