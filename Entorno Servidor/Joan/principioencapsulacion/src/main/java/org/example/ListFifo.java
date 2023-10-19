package org.example;

import lombok.Data;

public @Data class ListFifo implements FifoInterfaz {

    Persona[] llista = new Persona[0];

    public void add(Persona persona) {

        Persona[] llistaMod = new Persona[llista.length + 1];

        for (int i = 0; i < llista.length; i++) {
            llistaMod[i] = llista[i];
        }

        llistaMod[llistaMod.length - 1] = persona;
        llista = llistaMod;
    }

    public void del() {

        if (llista.length == 0) {
            throw new IllegalStateException("La cola está vacía");
        }
        Persona[] llistaMod = new Persona[llista.length - 1];
        for (int i = 1; i < llista.length; i++) {
            llistaMod[i - 1] = llista[i];
        }
        llista = llistaMod;
    }

    public int size(){
        return llista.length;
    }

}
