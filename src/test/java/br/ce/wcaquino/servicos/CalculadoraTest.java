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
		// Cenário
		int valorA = 5;
		int valorB = 3;

		// Ação
		int resultado = calc.somar(valorA, valorB);

		// Verificação
		assertEquals(8, resultado);
	}

	@Test
	public void deveSubtrairDoisValores() {
		// Cenário
		int valorA = 8;
		int valorB = 5;

		// Ação
		int resultado = calc.subtrair(valorA, valorB);

		// Verificação
		assertEquals(3, resultado);
	}

	@Test
	public void deveDividirDoisValores() throws NaoPodeDividirPorZeroException {
		// Cenário
		int valorA = 6;
		int valorB = 3;

		// Ação
		int resultado = calc.dividir(valorA, valorB);

		// Verificação
		assertEquals(2, resultado);
	}

	@Test(expected = NaoPodeDividirPorZeroException.class)
	public void deveLancarExcecaoAoDividirPorZero() throws NaoPodeDividirPorZeroException {
		// Cenário
		int valorA = 10;
		int valorB = 0;

		// Ação
		calc.dividir(valorA, valorB);
	}
}
