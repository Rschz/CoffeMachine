package com.company;

import com.sun.tools.javac.Main;

public class MaquinaDeCafe {
    public Cafetera cafe;
    public Vaso vasosPequeños;
    public Vaso vasosMedianos;
    public Vaso vasosGrandes;
    public Azucarero azucar;

    public void setCafetera(Cafetera cafetera){ this.cafe = cafetera; }
    public void setVasosPequeños(Vaso vasosPequeños){ this.vasosPequeños = vasosPequeños; }
    public void setVasosMedianos(Vaso vasosMedianos){ this.vasosMedianos = vasosMedianos; }
    public void setVasosGrandes(Vaso vasosGrandes){ this.vasosGrandes = vasosGrandes; }
    public void setAzucar(Azucarero azucar){this.azucar = azucar;}

    public Cafetera getCafetera(){return this.cafe;}
    public Vaso getvasosPequeños(){return this.vasosPequeños;}
    public Azucarero getAzucarero(){return this.azucar;}
    
     

    public Vaso getTipoVaso(String tipoDeVaso){
       switch (tipoDeVaso){
           case "pequeno":
               return this.vasosPequeños;
           case "mediano":
               return this.vasosMedianos;
           case "grande":
               return this.vasosGrandes;
           default:
               return null;
       }
    }
    public String getVasoDeCafe(Vaso tipoDeVaso, int cantidadDeVasos, int cantidadDeAzucar){

        if (!tipoDeVaso.hasVasos(cantidadDeVasos)){
            return "No hay Vasos";
        }else if(!cafe.hasCafe(tipoDeVaso.getcontenido())) {
            return "No hay Cafe";
        }else if(!azucar.hasAzucar(cantidadDeAzucar)){
            return "No hay Azucar";
        }else{
            cafe.giveCafe(tipoDeVaso.getcontenido());
            tipoDeVaso.giveVasos(cantidadDeVasos);
            azucar.giveAzucar(cantidadDeAzucar);

            return "Felicitaciones";
        }
    }

}
