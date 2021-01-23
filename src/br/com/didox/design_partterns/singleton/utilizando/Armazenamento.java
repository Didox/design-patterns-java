package br.com.didox.design_partterns.singleton.utilizando;

public class Armazenamento {
	public static void Gardar(Presente produto) {
		if (produto.getTipo().equals(TipoProduto.Escritorio)){
	        Escritorio.estoque().adicionarProduto(produto);
		}
		else {
			Mesanino.estoque().adicionarProduto(produto);
	    }
	}
}
