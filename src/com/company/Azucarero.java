package com.company;

public class Azucarero {

    private int cantidadDeAzucar;

    public Azucarero(int a){
        cantidadDeAzucar = a;
    }

    public int getcantidadAzucar() {
        return cantidadDeAzucar;
    }

    public void setcantidadAzucar(int param1) {
        this.cantidadDeAzucar = param1;
    }

    public boolean hasAzucar(int cantidadDeAzucar) {
        return this.cantidadDeAzucar >= cantidadDeAzucar;
    }

    public void giveAzucar(int cantidadDeAzucar){
        this.cantidadDeAzucar = this.cantidadDeAzucar - cantidadDeAzucar;
    }

}