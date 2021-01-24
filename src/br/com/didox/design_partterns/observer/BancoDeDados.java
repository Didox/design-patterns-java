package br.com.didox.design_partterns.observer;

public class BancoDeDados implements IAcao {

	public BancoDeDados() {}
	
	public void aplicar(Pedido pedido) {
		System.out.println("salvando no banco de dados");
	}

}
