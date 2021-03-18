package com.algaworks.algafood.estudo.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

public class ConsultaRestauranteMain {

	public static void main(String[] args) {
		ApplicationContext context = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository cadastroRestaurante = context.getBean(RestauranteRepository.class);
		List<Restaurante> lista = cadastroRestaurante.todos();
		
		for (Restaurante restaurante : lista) {
			System.out.printf(
					"\n%s - %f - %s\n\n", 
					restaurante.getNome(), 
					restaurante.getTaxaFrete(), 
					restaurante.getCozinha().getNome());
		}
		
	}
}
