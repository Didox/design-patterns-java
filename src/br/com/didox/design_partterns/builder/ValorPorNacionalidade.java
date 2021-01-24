package br.com.didox.design_partterns.builder;

public class ValorPorNacionalidade {
	private double valor;

	public ValorPorNacionalidade(double valor, Nacionalidade nacionalidade) {
		this.valor = valor;
		if(nacionalidade != Nacionalidade.Brasil) {
			this.valor += this.valor * 10 / 100;
		}
	}
	
	public double getValor() {
		return this.valor;
	}
	
	
}
