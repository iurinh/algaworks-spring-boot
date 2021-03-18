package com.algaworks.algafood.estudo.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

public class ConsultaCozinhaMainAlteracao2 {

	public static void main(String[] args) {
		ApplicationContext context = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cadastroCozinha = context.getBean(CozinhaRepository.class);
		
		Cozinha c1 = new Cozinha();
		c1.setId(1l);
		c1.setNome("Brasileira");
		
		cadastroCozinha.salvar(c1);
	}
}
