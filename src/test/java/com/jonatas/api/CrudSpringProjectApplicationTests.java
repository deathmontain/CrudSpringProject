package com.jonatas.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class CrudSpringProjectApplicationTests {

	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPaginas;

	@Test
	public void contextLoads() {
	}

	@Bean
	public CommandLineRunner commandlinerunner() {
		return args -> {
			System.out.println("Quantidade de elementos por páginas = " + this.qtdPaginas);
		};
	}

}
