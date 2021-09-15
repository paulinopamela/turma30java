package com.minhaLojadeGames.LojaGames.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.minhaLojadeGames.LojaGames.model.UserLogin;
import com.minhaLojadeGames.LojaGames.model.Usuario;
import com.minhaLojadeGames.LojaGames.repository.UserRepository;



@Service
public class UsuarioService {

		@Autowired
	    private UserRepository repository;

	    public Optional<Usuario> Cadastrar(Usuario usuario) {

	        Optional<Usuario> user = repository.findByUsuario(usuario.getEmail());
	        if (user.isPresent()) {
	            return Optional.ofNullable(null);
	        }

	        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	        String senhaEncoder = encoder.encode(usuario.getSenha());
	        usuario.setSenha(senhaEncoder);

	        return Optional.of(repository.save(usuario));
	    }

	    public Optional<UserLogin> Logar(Optional<UserLogin> user) {
	        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	        Optional<Usuario> usuario = repository.findByUsuario(user.get().getEmail());

	        if (usuario.isPresent()) {
	            if (encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {

	                String auth = user.get().getEmail() + ":" + user.get().getSenha();
	                byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
	                String authHeader = "Basic " + new String(encodedAuth);

	                user.get().setToken(authHeader);
	                user.get().setNomeCompleto(usuario.get().getNomeCompleto());

	                return user;
	            }
	        }
	        return null;
	    }
	}
