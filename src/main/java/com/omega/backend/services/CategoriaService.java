package com.omega.backend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omega.backend.domain.Categoria;
import com.omega.backend.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria getCategoria(Integer id) {

		Optional<Categoria> obj = repo.findById(id);

		return obj.orElse(null);

	}
}
