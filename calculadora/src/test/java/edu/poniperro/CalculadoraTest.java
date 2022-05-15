package edu.poniperro;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class CalculadoraTest {

    ICalculadora calculadora = null;
    private static final double DELTA = 1e-15;

    @Before
    public void setup() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSuma() {
        assertEquals(7, calculadora.sumar(5, 2), DELTA);
        assertEquals(-3, calculadora.sumar(-1, -2), DELTA);
        assertEquals(3, calculadora.sumar(5, -2), DELTA);
    }

    @Test
    public void testResta() {
        assertEquals(0, calculadora.restar(2, 2), DELTA);
        assertEquals(-44, calculadora.restar(-50, -6), DELTA);
    }

    @Test
    public void testMultiplicacion() {
        assertEquals((long)27, (long)calculadora.multiplicar(9, 3));
        assertEquals((long)-27, (long)calculadora.multiplicar(9, -3));
    }

    @Test
    public void testDivisio() {
        assertEquals((long)4, (long)calculadora.dividir(40, 10));
        assertEquals((long)-5, (long)calculadora.dividir(-10, 2));
    }
    
}