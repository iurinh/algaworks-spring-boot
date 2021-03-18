package com.algaworks.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.repository.CidadeRepository;

@Component
public class CidadeRepositoryImpl implements CidadeRepository{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Cidade> todos() {
		return this.manager.createQuery("from Cidade", Cidade.class).getResultList();
	}
	
	@Override
	public Cidade porId(Long id) {
		return manager.find(Cidade.class, id);
	}
	
	@Override
	@Transactional
	public Cidade salvar(Cidade Cidade) {
		return manager.merge(Cidade);
	}
	
	@Override
	@Transactional
	public void remover(Cidade Cidade) {
		Cidade = porId(Cidade.getId());
		manager.remove(Cidade);
	}

}
