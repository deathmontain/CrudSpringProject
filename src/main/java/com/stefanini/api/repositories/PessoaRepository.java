package com.stefanini.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stefanini.api.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
}