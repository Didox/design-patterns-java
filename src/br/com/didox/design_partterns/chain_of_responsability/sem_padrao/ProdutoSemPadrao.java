package br.com.didox.design_partterns.chain_of_responsability.sem_padrao;

public class ProdutoSemPadrao {
	public ProdutoSemPadrao(String _nome) {
		this.nome = _nome;
	}
	
	public ProdutoSemPadrao() {}
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
