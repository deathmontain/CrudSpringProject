package com.jonatas.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ENDERECO")
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cdEndereco;
	@Column(name = "ENDERECO", nullable = false)
	private String Endereco;
	@Column(name = "CEP_ENDERECO", nullable = false)
	private String cepEndereco;
	@ManyToOne(fetch = FetchType.EAGER)
	private Pessoa pessoa;
	
	public int getCdEndereco() {
		return cdEndereco;
	}
	
	public void setCdEndereco(int cdEndereco) {
		this.cdEndereco = cdEndereco;
	}
	public String getEndereco() {
		return Endereco;
	}
	
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	public String getCepEndereco() {
		return cepEndereco;
	}
	
	public void setCepEndereco(String cepEndereco) {
		this.cepEndereco = cepEndereco;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}