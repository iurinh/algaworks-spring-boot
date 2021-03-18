package com.algaworks.algafood.domain.repository;

import java.util.List;

import com.algaworks.algafood.domain.model.Permissao;

public interface PermissaoRepository {

	List<Permissao> todos();
	Permissao porId(Long id);
	Permissao salvar(Permissao Permissao);
	void remover(Permissao Permissao);
	
}
