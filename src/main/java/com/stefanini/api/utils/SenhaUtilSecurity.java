package com.stefanini.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtilSecurity {
	public static String gerarBcrypt(String senha) {
		if (senha == null) {
			return senha;
		}
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.encode(senha);
	}
	
	public static boolean validaSenha(String senha, String senhaEncoded) {
		BCryptPasswordEncoder validaSenha = new BCryptPasswordEncoder();
		return validaSenha.matches(senha, senhaEncoded);
	}
}