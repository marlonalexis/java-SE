/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mplua
 */
public class HashSets {
    public static void main(String[] args) {
        //Set<String> lista = new HashSet<String>();
        Set<String> lista = new HashSet<String>(); //Muestra en orden si esta lista estubiera en desorden ademas no repite el mismo valor
        lista.add("a");
        lista.add("a");
        lista.add("d");
        lista.add("b");
        lista.add("e");
        
        for (String strings : lista) {
            System.out.println(strings);
        }
    }
}
