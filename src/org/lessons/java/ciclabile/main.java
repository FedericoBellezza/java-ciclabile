package org.lessons.java.ciclabile;

// imports
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        System.out.println("-------------------------------------");

        // creo un array
        NumeriInteri array = new NumeriInteri(new int[] {1, 2, 3, 4, 5});

        // for
        System.out.println("------ ciclo for ------");
        for (int i = 0; i < array.arrayInteri.length; i++){
            System.out.println(array.arrayInteri[i]);
        }

        // for each
        System.out.println("------ ciclo for-each ------");
        for (int element : array.arrayInteri){
            System.out.println(element);
        }

        // metodi getElementoSuccessivo e hasAncoraElementi
        System.out.println("------ ciclo con il metodo (getElementoSuccessivo) e (hasAncoraElementi) ------");

        System.out.println("Valore: " + (array.getElementoSuccessivo()) + ", ci sono ancora elementi? : " + array.hasAncoraElementi());
        System.out.println("Valore: " + (array.getElementoSuccessivo()) + ", ci sono ancora elementi? : " + array.hasAncoraElementi());
        System.out.println("Valore: " + (array.getElementoSuccessivo()) + ", ci sono ancora elementi? : " + array.hasAncoraElementi());
        System.out.println("Valore: " + (array.getElementoSuccessivo()) + ", ci sono ancora elementi? : " + array.hasAncoraElementi());
        System.out.println("Valore: " + (array.getElementoSuccessivo()) + ", ci sono ancora elementi? : " + array.hasAncoraElementi());

        // aggiungo un elemento e stampo il nuovo array
        System.out.println("------ aggiungo un elemento all'array con il metodo addElemento ------");
        array.addElemento(6);
        System.out.println(Arrays.toString(array.arrayInteri));

        System.out.println("-------------------------------------");
    }
}
