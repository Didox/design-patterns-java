package br.com.didox.design_partterns.decorator;

public class Roupa {
	
	private IDecoracao decoracao;

	public Roupa(IDecoracao decoracao) {
		this.decoracao = decoracao;
	}
	
	public String ComoElaFicou() {
		return decoracao.aplicar();
	}
}
