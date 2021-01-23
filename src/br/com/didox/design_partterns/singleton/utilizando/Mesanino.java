package br.com.didox.design_partterns.singleton.utilizando;

import java.util.ArrayList;

public class Mesanino {
	private Mesanino() {}

	private static Mesanino mesanino;
	public static Mesanino estoque() {
		if(mesanino == null) {
			mesanino = new Mesanino();
			mesanino.produtos = new ArrayList<Presente>();
		}
		return mesanino;
	}
	
	
	
	private ArrayList<Presente> produtos;
	public ArrayList<Presente> getProdutos(){
		return this.produtos;
	}
	
	public void adicionarProduto(Presente produto) {
		mesanino.produtos.add(produto);
	}
	
	public ArrayList<Presente> produtos() {
		return mesanino.getProdutos();
	}
}
