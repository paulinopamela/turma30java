package com.minhaLojadeGames.LojaGames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaLojadeGames.LojaGames.model.Usuario;

	public interface UserRepository extends JpaRepository <Usuario, Long>{
		public Optional<Usuario> findByUsuario (String usuario);
}
