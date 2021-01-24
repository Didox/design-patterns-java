package br.com.didox.design_partterns.state.com_padrao;





public class ComEstampaStateComPadrao extends AdicionalStateComPadrao {
	public ComEstampaStateComPadrao(AdicionalStateComPadrao proximo, ISituacaoState situacao) {
		super(proximo, situacao);
	}

	@Override
	public String alteraNome(String nome) {
		if(this.proximo != null) return proximo.alteraNome(this.aplicaSituacao(nome + " Com estampa"));
		return this.aplicaSituacao(nome + " Com estampa");
	}
}
