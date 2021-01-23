package br.com.didox.design_partterns.chain_of_responsability.com_padrao;

public abstract class Adicional {
	protected Adicional proximo;
	
	public Adicional(Adicional proximo) {
		this.proximo = proximo;
	}
	
	public abstract String alteraNome(String nome);
}
