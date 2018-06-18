/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

/**
 *
 * @author mpluas
 */
public class For {
    public static void main(String[] args) {
        //Sirve para recorrer arreglos o listas
        String[] redes = {"Facebook", "Youtube", "Twitter"};
        // Hay varias formas de ejecutar un for
        //1
        for (int i = 0; i < 5; i++) { // i = 0 - Contador | i < 5 - Condicion | i++ - Sumador
            if (i == 2) {
                //break; //Para la ejecucion
                continue; //Salta la ejecucion
            }
            System.out.println("Numero " + i);
        }
        //2
        for (int r = 0; r < redes.length; r++) {
            System.out.println(redes[r]);
        }
        //3 Es utilizado para recorrer vectores | es conocido como foreach
        for (String rede : redes) {
            System.out.println("Red " + rede);
        }
    }
}
