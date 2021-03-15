package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
//	@Autowired private Notificador notificador;
	@Qualifier("normal") @Autowired private Notificador notificador;
//	@Qualifier("urgente") @Autowired private Notificador notificador;
//	@Autowired(required = false) private Notificador notificador;
//	@Autowired(required = false) private List<Notificador> notificadores;
	
//	@Autowired
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
//	public AtivacaoClienteService(String q) {
//		
//	}
	
//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}	
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
//		for(Notificador notificador : notificadores)
//		if(notificador != null)
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
//		else
//			System.out.println("Não existe notificador");
	}

}
