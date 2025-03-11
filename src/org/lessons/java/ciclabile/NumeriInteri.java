package org.lessons.java.ciclabile;

public class NumeriInteri {
    protected int[] arrayInteri;
    private int indiceValoreAttuale = 0;

    // costruttori
    public NumeriInteri(int[] arrayInteri){
        this.arrayInteri = arrayInteri;
    }
    // se non viene passato un array di numeri interi viene creato un array vuoto
    public NumeriInteri(){
        this.arrayInteri = new int[] {};
    }

    // setter
    public void setNumeriInteri(int[] arrayInteri){
        this.arrayInteri = arrayInteri;
    }

    // metodo per prendere l'elemento successivo ad ogni invocazione
    public int getElementoSuccessivo(){
        if (indiceValoreAttuale == arrayInteri.length) {
            indiceValoreAttuale = 0;
        }
        // indiceValoreAttuale++;
        return arrayInteri[indiceValoreAttuale++];
    }

    // metodo per sapere se l'array ha ancora elementi
    public boolean hasAncoraElementi(){
            return indiceValoreAttuale < arrayInteri.length;
        }

    // metodo per aggiungere un alemento
    public void addElemento(int numeroDaAggiungere){
        int[] nuovoArray= new int[arrayInteri.length + 1];
        for (int i = 0; i < arrayInteri.length; i++){
            nuovoArray[i] = arrayInteri[i];
        }
        nuovoArray[nuovoArray.length - 1] = numeroDaAggiungere;
        this.arrayInteri = nuovoArray;    
    }
}

