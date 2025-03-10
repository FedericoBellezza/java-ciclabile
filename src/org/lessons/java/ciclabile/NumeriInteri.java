package org.lessons.java.ciclabile;

public class NumeriInteri {
    protected int[] NumeriInteri;

    // costruttori
    public NumeriInteri(int[] NumeriInteri){
        this.NumeriInteri = NumeriInteri;
    }
    // se non viene passato un array di numeri interi viene creato un array vuoto
    public NumeriInteri(){
        this.NumeriInteri = new int[] {};
    }

    // setter
    public void setNumeriInteri(int[] NumeriInteri){
        this.NumeriInteri = NumeriInteri;
    }

    // metodo per prendere l'elemento successivo ad ogni invocazione
    int indiceValoreAttuale = -1;
    public int getElementoSuccessivo(){
        if (indiceValoreAttuale == NumeriInteri.length - 1) {
            indiceValoreAttuale = -1;
        }
        indiceValoreAttuale++;    
        return NumeriInteri[indiceValoreAttuale];
    }

    // metodo per sapere se l'array ha ancora elementi
    public boolean hasAncoraElementi(){
            return indiceValoreAttuale < NumeriInteri.length - 1;
        }

    // metodo per aggiungere un alemento
    public void addElemento(int numeroDaAggiungere){
        int[] nuovoArray= new int[NumeriInteri.length + 1];
        for (int i = 0; i < NumeriInteri.length; i++){
            nuovoArray[i] = NumeriInteri[i];
        }
        nuovoArray[nuovoArray.length - 1] = numeroDaAggiungere;
        this.NumeriInteri = nuovoArray;       
    }
}

