package org.example;

public class DataStrings implements Data{

    private String data;

    public DataStrings(int dia, int mes, int any){
        this.data = dia + "-" + mes + "-" + any;
    }

    @Override
    public int getDia() {
        String[] dataparts = this.data.split("-");
        return Integer.parseInt(dataparts[0]);
    }

    @Override
    public int getMes() {
        String[] dataparts = this.data.split("-");
        return Integer.parseInt(dataparts[1]);
    }

    @Override
    public int getAny() {
        String[] dataparts = this.data.split("-");
        return Integer.parseInt(dataparts[2]);
    }

    @Override
    public boolean isAnyBixest() {
        return false;
    }
}
