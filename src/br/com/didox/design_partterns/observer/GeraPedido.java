package br.com.didox.design_partterns.observer;

import java.time.LocalDateTime;

public class GeraPedido {

	public GeraPedido(LocalDateTime data, double valorTotal, Cliente cliente) {
		this.data = data;
		this.valorTotal = valorTotal;
		this.cliente = cliente;
	}
	
	private LocalDateTime data;
	private double valorTotal;
	private Cliente cliente;
	
	public void executa() {
		var pedido = new Pedido();
		pedido.setData(this.data);
		pedido.setCliente(this.cliente);
		pedido.setValorTotal(this.valorTotal);
		
		new PedidoService(pedido).salvar(new Email(), new BancoDeDados());
	}
	
}
