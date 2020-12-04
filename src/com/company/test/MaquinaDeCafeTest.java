package com.company.test;

import com.company.Azucarero;
import com.company.Cafetera;
import com.company.MaquinaDeCafe;
import com.company.Vaso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaquinaDeCafeTest {
    Cafetera cafetera;
    Vaso vasosPequeno;
    Vaso vasosMediano;
    Vaso vasosGrande;
    Azucarero azucarero;
    MaquinaDeCafe maquinaDeCafe;

    @BeforeEach
    void setUp() {
        cafetera=new Cafetera(50);
        vasosPequeno=new Vaso(5,10);
        vasosMediano=new Vaso(5,20);
        vasosGrande=new Vaso(5,30);
        azucarero=new Azucarero(20);

        maquinaDeCafe= new MaquinaDeCafe();
        maquinaDeCafe.setCafetera(cafetera);
        maquinaDeCafe.setVasosPequeños(vasosPequeno);
        maquinaDeCafe.setVasosMedianos(vasosMediano);
        maquinaDeCafe.setVasosGrandes(vasosGrande);
        maquinaDeCafe.setAzucar(azucarero);
    }

    @Test
    public void deberiaDevolverUnVasoPequeno() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
        assertEquals(maquinaDeCafe.vasosPequeños, vaso);
    }

    @Test
    public void deberiaDevolverUnVasoMediano() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("mediano");
        assertEquals(maquinaDeCafe.vasosMedianos, vaso);
    }

    @Test
    public void deberiaDevolverUnVasoGrande() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("grande");
        assertEquals(maquinaDeCafe.vasosGrandes, vaso);
    }

    @Test
    public void deberiaDevolverNoHayVasos(){
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso,10,2);

        assertEquals("No hay Vasos",resultado);


    }

    @Test
    public void deberiaDevolverNoHayCafe(){
        cafetera = new Cafetera(5);
        maquinaDeCafe.setCafetera(cafetera);

        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso,1,2);

        assertEquals("No hay Cafe",resultado);


    }

    @Test
    public void deberiaDevolverNoHayAzucar(){
        azucarero = new Azucarero(2);
        maquinaDeCafe.setAzucar(azucarero);

        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso,1,3);

        assertEquals("No hay Azucar",resultado);


    }

    @Test
    public void deberiaRestarCafe(){

        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        maquinaDeCafe.getVasoDeCafe(vaso,1,3);
        int resultado = maquinaDeCafe.getCafetera().getcantidadCafe();

        assertEquals(40, resultado);


    }

    @Test
    public void deberiaRestarVaso(){

        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        maquinaDeCafe.getVasoDeCafe(vaso,1,3);
        int resultado = maquinaDeCafe.getvasosPequeños().getcantidadVasos();

        assertEquals(4, resultado);


    }

    @Test
    public void deberiaRestarAzucar(){

        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        maquinaDeCafe.getVasoDeCafe(vaso,1,3);
        int resultado = maquinaDeCafe.getAzucarero().getcantidadAzucar();

        assertEquals(17, resultado);

    }

    @Test
    public void devolveriaDevolverFelicitaciones(){

        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso,1,3);

        assertEquals("Felicitaciones", resultado);

    }



}