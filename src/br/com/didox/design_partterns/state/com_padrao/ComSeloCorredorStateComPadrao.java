package br.com.didox.design_partterns.state.com_padrao;

public class ComSeloCorredorStateComPadrao extends AdicionalStateComPadrao {
	public ComSeloCorredorStateComPadrao(AdicionalStateComPadrao proximo, ISituacaoState situacao) {
		super(proximo, situacao);
	}

	@Override
	public String alteraNome(String nome) {
		if(this.proximo != null) return proximo.alteraNome(this.aplicaSituacao(nome+ " Com selo"));
		return this.aplicaSituacao(nome + " Com selo");
	}
}
