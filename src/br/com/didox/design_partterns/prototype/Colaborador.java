package br.com.didox.design_partterns.prototype;

public class Colaborador {
	public Colaborador Clone() {
		var colaborador = new Colaborador();
		colaborador.nome = this.nome;
		colaborador.identificacao = this.identificacao;
		return colaborador;
	};
	
	private int id;
	private String nome;
	private int identificacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}

