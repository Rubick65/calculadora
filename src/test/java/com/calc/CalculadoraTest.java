package com.calc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculadoraTest {
	
	@Test
	public void testSuma() {
		Calculadora calculadora = new Calculadora(6,2);
		int resultado = calculadora.suma();
		assertEquals(resultado, 8);
	}

	@Test
	public void testResta() {
		Calculadora calculadora = new Calculadora(6,2);
		int resultado = calculadora.resta();
		assertEquals(resultado, 4);
	}

	@Test
	public void testProducto() {
		Calculadora calculadora = new Calculadora(6,2);
		int resultado = calculadora.producto();
		assertEquals(resultado, 12);
	}

	@Test
	public void testDivision() {
		Calculadora calculadora = new Calculadora(6,2);
		int resultado = calculadora.division();
		assertEquals(resultado, 3);
	}

}
