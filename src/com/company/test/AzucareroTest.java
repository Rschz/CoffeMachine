package com.company.test;

import org.junit.jupiter.api.Test;
import com.company.Azucarero;
import static org.junit.jupiter.api.Assertions.*;


class AzucareroTest {
    private Azucarero azucarero = new Azucarero(10);

   @Test
    public void deberiaDevolverVerdaderoSiHaySuficienteAzucarEnElAzucarero() {

        boolean resultado = this.azucarero.hasAzucar(5);

        assertEquals(true, resultado);

    }
    @Test
    public void deberiaDevolverFalsoPorqueNoHaySuficienteAzucarEnElAzucarero() {

        boolean resultado = this.azucarero.hasAzucar(11);

        assertEquals(false, resultado);

    }
}