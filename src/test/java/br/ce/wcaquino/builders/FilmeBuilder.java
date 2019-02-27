package br.ce.wcaquino.builders;

import br.ce.wcaquino.entidades.Filme;

public class FilmeBuilder {

	private Filme filme;

	private FilmeBuilder() {
	}

	public static FilmeBuilder umFilme() {
		FilmeBuilder builder = new FilmeBuilder();
		builder.filme = new Filme();
		builder.filme.setEstoque(2);
		builder.filme.setNome("The Avengers: Infinity War");
		builder.filme.setPrecoLocacao(4.0);

		return builder;
	}
	
	public static FilmeBuilder umFilmeSemEstoque() {
		FilmeBuilder builder = new FilmeBuilder();
		builder.filme = new Filme();
		builder.filme.setEstoque(0);
		builder.filme.setNome("Star Wars: The last Jadi");
		builder.filme.setPrecoLocacao(4.0);

		return builder;
	}

	public FilmeBuilder comValor(Double valor) {
		filme.setPrecoLocacao(valor);
		return this;
	}

	public Filme agora() {
		return filme;
	}
}
