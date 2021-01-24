package br.com.didox.design_partterns.decorator;

public class Algodao implements IDecoracao {

	public Algodao(IDecoracao decoracao) {
		this.decoracao = decoracao;
	}
	
	public Algodao() {}
	
	private IDecoracao decoracao;

	@Override
	public String aplicar() {
		var item = "Com Algodão ";
		if(decoracao != null) item += decoracao.aplicar();
		return item;
	}
}