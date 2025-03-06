package org.lessons.java.ciclabile;

import java.util.Arrays;

public class NumeriInteri {
    protected int[] NumeriInteri;

    // costruttori
    public NumeriInteri(int[] NumeriInteri){
        this.NumeriInteri = NumeriInteri;
    }
    public NumeriInteri(){
        this.NumeriInteri = new int[] {0};
    }
    
    // metodo per prendere l'elemento successivo ad ogni invocazione
    int indiceValoreAttuale = 0;
    public int getElementoSuccessivo(){
        if (indiceValoreAttuale < NumeriInteri.length) {
            int indiceValoreDaRitornare = indiceValoreAttuale; 
            indiceValoreAttuale++;
            return NumeriInteri[indiceValoreDaRitornare];
        } else {
            return 0;
        }
    }
    // metodo per sapere se l'array ha ancora elementi
    public boolean hasAncoraElementi(){
            return indiceValoreAttuale < NumeriInteri.length;
        }

    // metodo per aggiungere un alemento
    public void addElemento(int numeroDaAggiungere){
        int[] nuovoArray= new int[NumeriInteri.length + 1];
        for (int i = 0; i < NumeriInteri.length; i++){
            nuovoArray[i] = NumeriInteri[i];
        }
        nuovoArray[NumeriInteri.length] = numeroDaAggiungere;
        this.NumeriInteri = nuovoArray;

        
    }

    
    }

