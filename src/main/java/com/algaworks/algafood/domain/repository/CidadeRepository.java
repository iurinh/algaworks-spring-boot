package com.algaworks.algafood.domain.repository;

import java.util.List;

import com.algaworks.algafood.domain.model.Cidade;

public interface CidadeRepository {

	List<Cidade> todos();
	Cidade porId(Long id);
	Cidade salvar(Cidade Cidade);
	void remover(Cidade Cidade);
	
}
