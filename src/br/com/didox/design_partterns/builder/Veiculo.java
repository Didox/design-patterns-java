package br.com.didox.design_partterns.builder;

public class Veiculo {
	private String nome;
	private int quantidade;
	private ValorPorNacionalidade valor;
	private Boolean ativo;

	public Veiculo(String nome, int quandidade, Boolean ativo, ValorPorNacionalidade valor) {
		this.setNome(nome);
		this.quantidade = quandidade;
		this.setValor(valor);
		this.setAtivo(ativo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return this.valor.getValor();
	}

	public void setValor(ValorPorNacionalidade valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}
