package com.algaworks.algafood.estudo.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;

public class ConsultaCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext context = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = context.getBean(CadastroCozinha.class);
		List<Cozinha> lista = cadastroCozinha.listar();
		
		for (Cozinha cozinha : lista) {
			System.out.println(cozinha);
		}
		
		Cozinha buscada = cadastroCozinha.buscar(1l);
		System.out.println(buscada.getNome());
		
		cadastroCozinha.remover(buscada);
	}
}
