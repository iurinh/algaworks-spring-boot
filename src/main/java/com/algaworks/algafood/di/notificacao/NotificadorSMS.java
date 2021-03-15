package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Qualifier("urgente")
@Component
public class NotificadorSMS implements Notificador {
	
	private boolean caixaAlta;
//	private String hostServidorSmtp;
	
	public NotificadorSMS() {
//		this.hostServidorSmtp = hostServidorSmtp;
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta)
			mensagem = mensagem.toUpperCase();
		
		System.out.printf(
				"Notificando %s através do SMS pelo telefone %s: %s\n",
				cliente.getNome(),
				cliente.getTelefone(),
//				this.hostServidorSmtp,
				mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
	
}
