package br.com.didox.design_partterns.flyweight;

import java.util.ArrayList;

public class NotasMusicais  {
	
	private ArrayList<TipoNota> tipos;

	public NotasMusicais() {
		this.tipos = new ArrayList<TipoNota>();
		this.tipos.add(new TipoNota("do", new Do()));
		this.tipos.add(new TipoNota("re", new Re()));
		this.tipos.add(new TipoNota("mi", new Mi()));
	}
	

	public INota tiposNota(String tipo) {
		for(var nota : this.tipos) {
			if(nota.getNome().equals(tipo)) return nota.getNota();
		}
		
		return null;
	}

}
