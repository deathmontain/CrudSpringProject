package com.jonatas.api.repositories;

import com.jonatas.api.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

    Pessoa findByRgPessoa(String rgPessoa);
	
}