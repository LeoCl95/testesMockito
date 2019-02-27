package br.ce.wcaquino.servicos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;

public class CalculadoraTest {

	private Calculadora calc;

	@Before
	public void setup() {
		calc = new Calculadora();
	}

	@Test
	public void deveSomarDoisValores() {
		// Cen�rio
		int valorA = 5;
		int valorB = 3;

		// A��o
		int resultado = calc.somar(valorA, valorB);

		// Verifica��o
		assertEquals(8, resultado);
	}

	@Test
	public void deveSubtrairDoisValores() {
		// Cen�rio
		int valorA = 8;
		int valorB = 5;

		// A��o
		int resultado = calc.subtrair(valorA, valorB);

		// Verifica��o
		assertEquals(3, resultado);
	}

	@Test
	public void deveDividirDoisValores() throws NaoPodeDividirPorZeroException {
		// Cen�rio
		int valorA = 6;
		int valorB = 3;

		// A��o
		int resultado = calc.dividir(valorA, valorB);

		// Verifica��o
		assertEquals(2, resultado);
	}

	@Test(expected = NaoPodeDividirPorZeroException.class)
	public void deveLancarExcecaoAoDividirPorZero() throws NaoPodeDividirPorZeroException {
		// Cen�rio
		int valorA = 10;
		int valorB = 0;

		// A��o
		calc.dividir(valorA, valorB);
	}
}
