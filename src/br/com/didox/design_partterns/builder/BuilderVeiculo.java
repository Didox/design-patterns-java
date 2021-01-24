package br.com.didox.design_partterns.builder;

public class BuilderVeiculo {
	public static Veiculo construir(String nome, int quantidade, double valor, Nacionalidade nacionalidade) {
		return new Veiculo(nome, quantidade, true, new ValorPorNacionalidade(valor, nacionalidade));
	}
}
