package br.com.didox.design_partterns.strategy.usando_singleton;

import java.util.ArrayList;

public class Escritorio {
	private Escritorio() {}
	
	private static Escritorio escritorio;
	public static Escritorio estoque() {
		if(escritorio == null) {
			escritorio = new Escritorio();
			escritorio.produtos = new ArrayList<Presente>();
		}
		return escritorio;
	}
	
	
	private ArrayList<Presente> produtos;
	public ArrayList<Presente> getProdutos(){
		return this.produtos;
	}
	
	public void adicionarProduto(Presente produto) {
		escritorio.produtos.add(produto);
	}
	
	public ArrayList<Presente> produtos() {
		return escritorio.getProdutos();
	}
}