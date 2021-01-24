package br.com.didox.design_partterns.state.com_padrao;

public class PagoState implements ISituacaoState{

	@Override
	public String aplicar(String nome) {
		return nome;
	}
}
