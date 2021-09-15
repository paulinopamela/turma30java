package br.com.farmacia.atividade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.farmacia.atividade.model.Produto;
import br.com.farmacia.atividade.repository.ProdutoRepository;

@RequestMapping("/produto")
@RestController 
@CrossOrigin(origins="*", allowedHeaders="*")
public class ProdutoController {
	
		@Autowired
		private ProdutoRepository repository;
		
		@GetMapping
		public ResponseEntity <List<Produto>> GetAll(){
			return ResponseEntity.ok(repository.findAll());
		}
		@GetMapping("/(id)")
		public ResponseEntity<Produto> getById(@PathVariable long id){
			return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
		}
		@GetMapping("/descricao/{descricao}") // BUSCA UM REGISTRO PELO NOME ATRAVÉS DE UM SUBTITULO
		public ResponseEntity<List<Produto>> getByDescricao(@PathVariable String produto){
			return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(produto));
		}
		
		@PostMapping // INSERE REGISTRO NA TABELA
		public ResponseEntity<Produto> post (@RequestBody Produto produto){
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
		}
		
		@PutMapping // ALTERA REGISTRO DA TABELA
		public ResponseEntity<Produto> put (@RequestBody Produto produto){
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
		}
		
		@DeleteMapping("/id") // LOCALIZA UM REGISTRO NA TABELA PELO ID E DELETA
		public void delete(@PathVariable long id) {
			repository.deleteById(id);
		}
		
}
