package br.ce.wcaquino.builders;

import java.util.Locale;

import com.github.javafaker.Faker;

import br.ce.wcaquino.entidades.Usuario;

public class UsuarioBuilder {

	private Usuario usuario;

	private UsuarioBuilder() {
	}

	public static UsuarioBuilder umUsuario() {
		Faker faker = new Faker(new Locale("pt-BR"));

		String nome = faker.name().fullName();

		UsuarioBuilder builder = new UsuarioBuilder();
		builder.usuario = new Usuario();
		builder.usuario.setNome(nome);

		return builder;
	}

	public UsuarioBuilder comNome(String nome) {
		usuario.setNome(nome);
		return this;
	}

	public Usuario agora() {
		return usuario;
	}
}
