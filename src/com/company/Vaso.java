package com.company;

public class Vaso {

    private int cantidadVasos;
    private int contenido;

    public Vaso(int a, int b){

        cantidadVasos = a;
        contenido = b;

    }

    public int getcantidadVasos() {
        return cantidadVasos;
    }

    public void setcantidadVasos(int cantidadVasos) {
        this.cantidadVasos = cantidadVasos;
    }

    public int getcontenido() {
        return contenido;
    }

    public void setcontenido(int contenido) {
        this.contenido = contenido;
    }

    public boolean hasVasos(int cantidadVasos) {
        if(this.cantidadVasos > cantidadVasos){
            return true;
        }
        else{
            return false;
        }
    }

    public void giveVasos(int cantidadVasos){
        this.cantidadVasos = this.cantidadVasos - cantidadVasos;
    }

}