package br.com.didox.design_partterns.decorator;

public class Veludo implements IDecoracao {

	public Veludo(IDecoracao decoracao) {
		this.decoracao = decoracao;
	}
	
	public Veludo() {}
	
	private IDecoracao decoracao;

	@Override
	public String aplicar() {
		var item = "Com Veludo ";
		if(decoracao != null) item += decoracao.aplicar();
		return item;
	}

}