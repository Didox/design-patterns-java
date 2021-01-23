package br.com.didox.design_partterns.chain_of_responsability.com_padrao;

public class ComSeloCorredor extends Adicional {
	public ComSeloCorredor(Adicional proximo) {
		super(proximo);
	}

	@Override
	public String alteraNome(String nome) {
		nome += " - Com nome selo do corredor";
		if(this.proximo != null) return proximo.alteraNome(nome);
		return nome;
	}
}
