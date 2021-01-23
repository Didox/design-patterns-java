package br.com.didox.design_partterns.strategy.sem_padrao;

public class Pessoa {
	private String nome;
	private String cpf;
	private String cnpj;
	private String tipo;
	private String razaoSocial;
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public void salvar() {
		System.out.println("Salvou no banco de dados o tipo de pessoa: " + this.getTipoDescricao());
	}
	
	private String getTipoDescricao() {
		return this.getTipo().toLowerCase().equals("f") ? "Física" : "Jurídica";
	}
}
