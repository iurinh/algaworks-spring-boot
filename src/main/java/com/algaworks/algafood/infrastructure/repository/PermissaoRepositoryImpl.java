package com.algaworks.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;

@Component
public class PermissaoRepositoryImpl implements PermissaoRepository{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Permissao> todos() {
		return this.manager.createQuery("from Permissao", Permissao.class).getResultList();
	}
	
	@Override
	public Permissao porId(Long id) {
		return manager.find(Permissao.class, id);
	}
	
	@Override
	@Transactional
	public Permissao salvar(Permissao Permissao) {
		return manager.merge(Permissao);
	}
	
	@Override
	@Transactional
	public void remover(Permissao Permissao) {
		Permissao = porId(Permissao.getId());
		manager.remove(Permissao);
	}

}
