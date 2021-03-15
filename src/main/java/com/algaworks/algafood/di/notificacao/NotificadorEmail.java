package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

//@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {
	
	@Autowired private NotificadorProperties properties;
	
	private boolean caixaAlta;
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println(properties.getHostServidor());
		System.out.println(properties.getPortServidor());
		
		if(this.caixaAlta)
			mensagem = mensagem.toUpperCase();
		
		System.out.printf(
				"Notificando %s através do e-mail %s: %s\n",
				cliente.getNome(),
				cliente.getEmail(),
				mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
	
}
