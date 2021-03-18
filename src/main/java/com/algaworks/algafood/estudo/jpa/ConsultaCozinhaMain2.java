package com.algaworks.algafood.estudo.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

public class ConsultaCozinhaMain2 {

	public static void main(String[] args) {
		ApplicationContext context = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cadastroCozinha = context.getBean(CozinhaRepository.class);
		List<Cozinha> lista = cadastroCozinha.todos();
		
		for (Cozinha cozinha : lista) {
			System.out.println(cozinha);
		}
		
		Cozinha buscada = cadastroCozinha.porId(1l);
		System.out.println(buscada.getNome());
		
		cadastroCozinha.remover(buscada);
	}
}
