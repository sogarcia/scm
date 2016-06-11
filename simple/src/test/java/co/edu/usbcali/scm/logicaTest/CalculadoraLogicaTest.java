package co.edu.usbcali.scm.logicaTest;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.usbcali.scm.logica.Calculadora;

public class CalculadoraLogicaTest {
	
	private int numero1 = 20;
	
	private int numero2 = 5;

	@Test
	public void test() {		
		Calculadora c = new Calculadora("Suma");
		c.sumar(numero1, numero2);
		assertTrue(c.getResult() == 25);
		c.imprimir();
	}
	
	@Test
	public void btest() {		
		Calculadora c = new Calculadora("Resta");
		c.restar(numero1, numero2);
		c.imprimir();		
	}
	
	@Test
	public void ctest() {		
		Calculadora c = new Calculadora("division");
		c.dividir(numero1, numero2);
		c.imprimir();		
	}
	
	@Test
	public void dtest() {		
		Calculadora c = new Calculadora("Multiplicacion");
		c.multiplicar(numero1, numero2);
		c.imprimir();		
	}
	
	

}
