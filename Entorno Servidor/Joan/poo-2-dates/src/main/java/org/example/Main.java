package org.example;

public class Main {
    public static void main(String[] args) {

        Data data1 = new DataStrings(1,12,2016);

        System.out.println(data1.getDia() + "-" + data1.getMes() + "-" + data1.getMes());

        String any = data1.isAnyBixest() ? "es un any bixest" : "no es un any bixest";
        System.out.println(any);
    }
}