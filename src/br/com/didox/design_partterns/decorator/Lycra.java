package br.com.didox.design_partterns.decorator;

public class Lycra implements IDecoracao {
	
	public Lycra(IDecoracao decoracao) {
		this.decoracao = decoracao;
	}
	
	public Lycra() {}
	
	private IDecoracao decoracao;

	@Override
	public String aplicar() {
		var item = "Com Lycra ";
		if(decoracao != null) item += decoracao.aplicar();
		return item;
	}

}
