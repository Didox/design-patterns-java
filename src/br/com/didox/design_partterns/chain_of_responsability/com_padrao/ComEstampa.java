package br.com.didox.design_partterns.chain_of_responsability.com_padrao;

public class ComEstampa extends Adicional {
	public ComEstampa(Adicional proximo) {
		super(proximo);
	}

	@Override
	public String alteraNome(String nome) {
		nome += " - Com estampa";
		if(this.proximo != null) return proximo.alteraNome(nome);
		return nome;
	}
}
