package br.com.didox.design_partterns.strategy.com_padrao;

public class Fisica implements IPessoa, IPessoaFisica {

	private String nome;
	private String cpf;
	
	@Override
	public String getCpf() {
		return cpf;
	}
	
	@Override
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void salvar() {
		System.out.println("Salvou no banco de dados o tipo de pessoa: Física");
	}

}
