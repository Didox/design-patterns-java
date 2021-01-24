package br.com.didox.design_partterns.strategy.com_padrao;

public class Juridica implements IPessoa, IPessoaJuridica{
	private String cnpj;
	private String razaoSocial;
	
	
	@Override
	public String getCnpj() {
		return cnpj;
	}

	@Override
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String getRazaoSocial() {
		return razaoSocial;
	}

	@Override
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	

	@Override
	public void salvar() {
		System.out.println("Salvou no banco de dados o tipo de pessoa: Jurídica");
	}
}
