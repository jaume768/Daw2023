package org.example;

public class Ciclista extends Atleta implements Federacio{

    private String bici;
    @Override
    public int numLlicencia() {
        return 0;
    }
}
