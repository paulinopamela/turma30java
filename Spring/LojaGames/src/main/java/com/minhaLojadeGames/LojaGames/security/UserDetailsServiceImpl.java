package com.minhaLojadeGames.LojaGames.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.minhaLojadeGames.LojaGames.model.Usuario;
import com.minhaLojadeGames.LojaGames.repository.UserRepository;

	@Service
	public class UserDetailsServiceImpl implements UserDetailsService{

		@Autowired
	    private UserRepository userRepository;
		
		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			Optional<Usuario> usuario = userRepository.findByUsuario(username);
	        usuario.orElseThrow(()-> new UsernameNotFoundException(username + " not found."));
	        
	        return usuario.map(UserDetailsImpl :: new).get();
		}
}
