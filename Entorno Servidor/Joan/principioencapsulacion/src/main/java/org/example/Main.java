package org.example;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();

        ListFifo fifo = new ListFifo();

        System.out.println(fifo.size());
        fifo.add(persona1);

        System.out.println(fifo.size());

        fifo.del();

        System.out.println(fifo.size());


    }
}