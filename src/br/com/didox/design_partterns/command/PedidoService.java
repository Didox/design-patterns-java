package br.com.didox.design_partterns.command;


public class PedidoService {
	
	private Pedido pedido;

	public PedidoService(Pedido pedido) {
		this.pedido = pedido;
	}

	public void salvar() {
		
		System.out.println("Salvou o pedido");
	}

}
