package br.com.didox.design_partterns.observer;

public class PedidoService {

	public PedidoService(Pedido pedido) {
		this.pedido = pedido;
	}
	
	private Pedido pedido;

	public void salvar(Email email, BancoDeDados banco) {
		//injeção de dependencia
		
		email.aplicar(this.pedido);
		banco.aplicar(this.pedido);
		System.out.println("Salvou o pedido");
	}

}
