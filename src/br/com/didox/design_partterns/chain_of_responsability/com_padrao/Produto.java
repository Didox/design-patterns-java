package br.com.didox.design_partterns.chain_of_responsability.com_padrao;

public class Produto {
	public Produto(String _nome) {
		this.nome = _nome;
	}
	
	public Produto() {}
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
