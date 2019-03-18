package com.stefanini.api.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PESSOA")
public class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rgPessoa;
	@Column(name = "NM_PESSOA", nullable = false)
	private String nomePessoa;
	@Column(name = "CPF_PESSOA", nullable = false)
	private int cpf_pessoa;
	@Column(name = "TEL_PESSOA")
	private String tel_Pessoa;
	@Column(name = "CEL_PESSOA")
	private String cel_pessoa;
	@OneToMany(mappedBy = "pessoa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Endereco> endereco;
	@OneToOne(fetch = FetchType.EAGER)
	private Usuario usuario;
	
	public Long getRgPessoa() {
		return rgPessoa;
	}
	
	public void setRgPessoa(Long rgPessoa) {
		this.rgPessoa = rgPessoa;
	}
	
	public String getNomePessoa() {
		return nomePessoa;
	}
	
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	
	public int getCpf_pessoa() {
		return cpf_pessoa;
	}
	
	public void setCpf_pessoa(int cpf_pessoa) {
		this.cpf_pessoa = cpf_pessoa;
	}
	
	public String getTel_Pessoa() {
		return tel_Pessoa;
	}
	
	public void setTel_Pessoa(String tel_Pessoa) {
		this.tel_Pessoa = tel_Pessoa;
	}
	
	public String getCel_pessoa() {
		return cel_pessoa;
	}
	
	public void setCel_pessoa(String cel_pessoa) {
		this.cel_pessoa = cel_pessoa;
	}
	
	public List<Endereco> getEndereco() {
		return endereco;
	}
	
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public String toString() {
		return "Nome: [" + nomePessoa + " RG: " + rgPessoa + " CPF: " 
				+ cpf_pessoa + " Telefone: " + tel_Pessoa + " Celular: "
				+ cel_pessoa + "]";
	}
}