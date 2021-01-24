package br.com.didox.design_partterns.state.com_padrao;



public abstract class AdicionalStateComPadrao {
	protected AdicionalStateComPadrao proximo;
	
	public AdicionalStateComPadrao(AdicionalStateComPadrao proximo, ISituacaoState situacao) {
		this.proximo = proximo;
		this.situacao = situacao;
	}
	
	public abstract String alteraNome(String nome);
	
	protected ISituacaoState situacao;
	
	public String aplicaSituacao(String nome) {
		return situacao.aplicar(nome);
	}
}
