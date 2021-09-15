package br.com.farmacia.atividade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.farmacia.atividade.model.Produto;

	public interface ProdutoRepository extends JpaRepository<Produto, Long>{

		public List<Produto> findAllByDescricaoContainingIgnoreCase(String nome);
	}
