package br.com.farmacia.atividade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.farmacia.atividade.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}
