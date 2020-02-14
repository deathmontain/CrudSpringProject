package com.jonatas.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jonatas.api.entities.Pessoa;
import com.jonatas.api.repositories.PessoaRepository;
import com.jonatas.api.utils.SenhaUtilSecurity;

@SpringBootApplication
public class CrudSpringProjectApplication {

	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPaginas;
	
	@Autowired
	private PessoaRepository pessoaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringProjectApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandlinerunner() {
		return args ->{
			System.out.println("Quantidade de elementos por páginas = " 
					+ this.qtdPaginas);

			String senhaEncoded = SenhaUtilSecurity.gerarBcrypt("123456");
		    System.out.println("Senha válida: " +
				SenhaUtilSecurity.validaSenha("123456", senhaEncoded));	
		    
		    Pessoa pessoa = new Pessoa();
			pessoa.setNomePessoa("Jônatas Santos");
			pessoa.setCpf_pessoa(123456789);
			pessoa.setTel_Pessoa("34791218");
			pessoa.setCel_pessoa("016998780278");

			this.pessoaRepository.save(pessoa);

			List<Pessoa> pessoaDB = pessoaRepository.findAll();
			pessoaDB.forEach(System.out::println);
			};
	}
}