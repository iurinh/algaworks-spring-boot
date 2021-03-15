package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

//@Primary
@Qualifier("normal")
@Component
public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
//	private String hostServidorSmtp;
	
	public NotificadorEmail() {
//		this.hostServidorSmtp = hostServidorSmtp;
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta)
			mensagem = mensagem.toUpperCase();
		
		System.out.printf(
				"Notificando %s através do e-mail %s: %s\n",
				cliente.getNome(),
				cliente.getEmail(),
//				this.hostServidorSmtp,
				mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
	
}
