package com.company;

public class Cafetera {

    private int cantidadCafe;

    public Cafetera(int a){

        cantidadCafe = a;

    }

    public int getcantidadCafe() {
        return cantidadCafe;
    }

    public void setcantidadCafe(int param1) {
        this.cantidadCafe = param1;
    }

    public boolean hasCafe(int cantidadCafe) {
        if(this.cantidadCafe > cantidadCafe){
            return true;
        }
        else{
            return false;
        }
    }

    public void giveCafe(int cantidadCafe){
        this.cantidadCafe = this.cantidadCafe - cantidadCafe;
    }

}