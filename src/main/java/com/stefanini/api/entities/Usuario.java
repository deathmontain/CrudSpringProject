package com.stefanini.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cd_Usuario;
	@Column(name = "LG_USUARIO", nullable = false)
	private String Lg_Usuario;
	@Column(name = "SN_USUARIO", nullable = false)
	private String senha;
	@OneToOne(fetch = FetchType.EAGER)
	private Pessoa pessoa;
	
	public int getCd_Usuario() {
		return Cd_Usuario;
	}
	
	public void setCd_Usuario(int cd_Usuario) {
		Cd_Usuario = cd_Usuario;
	}
	
	public String getLg_Usuario() {
		return Lg_Usuario;
	}
	
	public void setLg_Usuario(String lg_Usuario) {
		Lg_Usuario = lg_Usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}