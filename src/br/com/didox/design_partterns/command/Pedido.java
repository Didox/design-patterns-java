package br.com.didox.design_partterns.command;

import java.time.LocalDateTime;

public class Pedido {
	private int id;
	private LocalDateTime data;
	private double valorTotal;
	private Cliente cliente;
	public int getId() {
		return id;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
