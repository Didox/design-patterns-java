package br.com.didox.design_partterns.observer;

public class Email implements IAcao {

	public Email(){}
	
	public void aplicar(Pedido pedido) {
		System.out.println("Enviando email");
		
	}

}
