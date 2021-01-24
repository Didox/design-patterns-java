package br.com.didox.design_partterns.state.sem_padra;

public abstract class AdicionalStateSemPadrao {
	protected AdicionalStateSemPadrao proximo;
	
	public AdicionalStateSemPadrao(AdicionalStateSemPadrao proximo) {
		this.proximo = proximo;
	}
	
	public abstract String alteraNome(String nome);
}
