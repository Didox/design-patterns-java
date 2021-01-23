package br.com.didox.design_partterns.strategy.chain_of_responsability.sem_padrao;

public class AdicionalSemPadrao {
	protected AdicionalSemPadrao proximo;
	
	private Boolean comEstampa;
	private Boolean comNomePersonalizado;
	private Boolean comSeloCorredor;
	
	public AdicionalSemPadrao(Boolean comEstampa, Boolean comNomePersonalizado, Boolean comSeloCorredor) {
		this.comEstampa = comEstampa;
		this.comNomePersonalizado = comNomePersonalizado;
		this.comSeloCorredor = comSeloCorredor;
	}
	
	public String alteraNome(String nome) {
		if(this.comEstampa) {
			nome += " - Com estampa";
		}
		
		if(this.comNomePersonalizado) {
			nome += " - Com nome personalizado";
		}
		
		if(this.comSeloCorredor) {
			nome += " - Com selo corredor";
		}
		
		return nome;
	}
}
