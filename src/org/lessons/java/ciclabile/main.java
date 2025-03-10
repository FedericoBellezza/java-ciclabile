package org.lessons.java.ciclabile;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        System.out.println("-------------------------------------");

        // creo un array
        NumeriInteri array = new NumeriInteri(new int[] {1,2,3});

        // for
        System.out.println("------ ciclo for ------");
        for (int i = 0; i < array.NumeriInteri.length; i++){
            System.out.println(array.NumeriInteri[i]);
        }

        // for each
        System.out.println("------ ciclo for-each ------");
        for (int element : array.NumeriInteri){
            System.out.println(element);
        }

        // metodi getElementoSuccessivo e hasAncoraElementi
        System.out.println("------ ciclo con il metodo (getElementoSuccessivo) e (hasAncoraElementi) ------");
        // invoco la prima volta
        System.out.println("Valore: " + (array.getElementoSuccessivo()));
        System.out.println("Ci sono ancora elementi? : " + array.hasAncoraElementi());
        // invoco la seconda volta
        System.out.println("Valore: " + (array.getElementoSuccessivo()));
        System.out.println("Ci sono ancora elementi? : " + array.hasAncoraElementi());
        // invoco la terza volta
        System.out.println("Valore: " + (array.getElementoSuccessivo()));
        System.out.println("Ci sono ancora elementi? : " + array.hasAncoraElementi());
        // invoco la quarta volta
        System.out.println("Valore: " + (array.getElementoSuccessivo()));
        System.out.println("Ci sono ancora elementi? : " + array.hasAncoraElementi());
        // invoco la quinta volta
        System.out.println("Valore: " + (array.getElementoSuccessivo()));
        System.out.println("Ci sono ancora elementi? : " + array.hasAncoraElementi());

        // aggiungo un elemento e stampo il nuovo array
        System.out.println("------ aggiungo un elemento all'array con il metodo addElemento ------");
        array.addElemento(6);
        System.out.println(Arrays.toString(array.NumeriInteri));

        System.out.println("-------------------------------------");
    }
}
