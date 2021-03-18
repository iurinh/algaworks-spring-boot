package com.algaworks.algafood.domain.repository;

import java.util.List;

import com.algaworks.algafood.domain.model.FormaPagamento;

public interface FormaPagamentoRepository {

	List<FormaPagamento> todos();
	FormaPagamento porId(Long id);
	FormaPagamento salvar(FormaPagamento FormaPagamento);
	void remover(FormaPagamento FormaPagamento);
	
}
