package br.com.didox.design_partterns.strategy.usando_singleton;

public class Presente {
	public Presente(String _nome, String _descricao, TipoProduto _tipo) {
		this.nome = _nome;
		this.descricao = _descricao;
		this.tipo = _tipo;
	}
	
	public Presente() {}
	
	private String nome;
	private String descricao;
	private TipoProduto tipo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public TipoProduto getTipo() {
		return tipo;
	}
	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}
}
