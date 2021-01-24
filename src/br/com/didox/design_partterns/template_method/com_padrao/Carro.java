package br.com.didox.design_partterns.template_method.com_padrao;

public abstract class Carro {
	private String detalhes;
	
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	

	public abstract String ComoEsteCarroAnda();
}
