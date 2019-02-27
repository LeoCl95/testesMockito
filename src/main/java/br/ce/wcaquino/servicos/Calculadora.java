package br.ce.wcaquino.servicos;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;

public class Calculadora {

	public int somar(int valorA, int valorB) {
		return valorA + valorB;
	}

	public int subtrair(int valorA, int valorB) {
		return valorA - valorB;
	}

	public int dividir(int valorA, int valorB) throws NaoPodeDividirPorZeroException {
		if (valorB == 0) {
			throw new NaoPodeDividirPorZeroException();
		}

		return valorA / valorB;
	}

}
