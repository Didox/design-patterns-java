package br.com.didox.design_partterns.chain_of_responsability.com_padrao;

public class ComNomePersonalizado extends Adicional {
	public ComNomePersonalizado(Adicional proximo) {
		super(proximo);
	}

	@Override
	public String alteraNome(String nome) {
		nome += " - Com nome personalizado";
		if(this.proximo != null) return proximo.alteraNome(nome);
		return nome;
	}
}
