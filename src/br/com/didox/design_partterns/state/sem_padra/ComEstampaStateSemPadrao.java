package br.com.didox.design_partterns.state.sem_padra;

public class ComEstampaStateSemPadrao extends AdicionalStateSemPadrao {
	public ComEstampaStateSemPadrao(AdicionalStateSemPadrao proximo, String situacao) {
		super(proximo);
		this.situacao = situacao;
	}
	
	private String situacao;

	@Override
	public String alteraNome(String nome) {
		if(this.situacao == "Aguardando") {
			nome += " - Aguardando";
		}
		else if(this.situacao == "Pendente") {
			nome += " - Pendente";
		}
		else {
			nome += " - Com estampa";
		}
		
		if(this.proximo != null) return proximo.alteraNome(nome);
		return nome;
	}
}
