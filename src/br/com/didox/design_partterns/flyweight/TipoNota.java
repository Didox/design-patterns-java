package br.com.didox.design_partterns.flyweight;

public class TipoNota {
	public TipoNota(String nome, INota nota) {
		this.setNome(nome);
		this.setNota(nota);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public INota getNota() {
		return nota;
	}
	public void setNota(INota nota) {
		this.nota = nota;
	}
	private String nome;
	private INota nota;
}
