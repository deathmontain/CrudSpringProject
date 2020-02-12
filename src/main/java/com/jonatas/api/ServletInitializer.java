package com.jonatas.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

public class ServletInitializer extends SpringBootServletInitializer {
	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPagina;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CrudSpringProjectApplication.class);
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return ards -> {
			System.out.println("Quantidade de elementos por página: " + this.qtdPorPagina);
		};
	}

}
