package br.com.didox.design_partterns.observer;

import java.util.ArrayList;

public class PedidoObservable {

	public PedidoObservable(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public ArrayList<IAcao> acoes = new ArrayList<IAcao>();
	
	private Pedido pedido;

	public void salvar() {
		
		for(var acao : this.acoes){
			acao.aplicar(this.pedido);
		}
		
		System.out.println("Salvou o pedido");
	}

}
