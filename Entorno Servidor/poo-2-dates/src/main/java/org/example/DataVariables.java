package org.example;

public class DataVariables implements Data {

    private int dia;
    private int mes;
    private int any;

    public DataVariables(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    @Override
    public int getDia() {
        return this.dia;
    }

    @Override
    public int getMes() {
        return this.mes;
    }

    @Override
    public int getAny() {
        return this.any;
    }

    @Override
    public boolean isAnyBixest() {
        return true;
    }
}
