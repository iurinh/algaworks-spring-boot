package com.algaworks.algafood.estudo.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;

public class ConsultaCozinhaMainInclusao {

	public static void main(String[] args) {
		ApplicationContext context = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = context.getBean(CadastroCozinha.class);
		
		Cozinha c1 = new Cozinha();
		c1.setNome("Brasileira");
		
		Cozinha c2 = new Cozinha();
		c2.setNome("Japonesa");
		
		c1 = cadastroCozinha.salvar(c1);
		c2 = cadastroCozinha.salvar(c2);
		
		System.out.printf("%d - %s\n", c1.getId(), c1.getNome());
		System.out.printf("%d - %s\n", c2.getId(), c2.getNome());
	}
}
