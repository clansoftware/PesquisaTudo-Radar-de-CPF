package br.com.pesquisatudo.dao;

import java.util.List;

public class Pessoa {
    private String nome;
    private List<String> emails;
    private List<String> celulares;
    private List<String> telefones;
    private String tipoSangue;
    private String logradouro;
    private String numero;
    private String cep;
    private String estado;
    private String cidade;
    private Float salario;
    
	public Pessoa(String nome, List<String> emails, List<String> celulares, List<String> telefones, String tipoSangue,
			String logradouro, String numero, String cep, String estado, String cidade, Float salario) {
		super();
		this.nome = nome;
		this.emails = emails;
		this.celulares = celulares;
		this.telefones = telefones;
		this.tipoSangue = tipoSangue;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<String> getCelulares() {
		return celulares;
	}

	public void setCelulares(List<String> celulares) {
		this.celulares = celulares;
	}

	public List<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<String> telefones) {
		this.telefones = telefones;
	}

	public String getTipoSangue() {
		return tipoSangue;
	}

	public void setTipoSangue(String tipoSangue) {
		this.tipoSangue = tipoSangue;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}
}