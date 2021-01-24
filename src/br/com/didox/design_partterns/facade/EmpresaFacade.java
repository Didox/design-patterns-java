package br.com.didox.design_partterns.facade;

public class EmpresaFacade {
	// uma espacie de fachada
	public ClienteFacade buscaCliente(String cpf) {
		return new ClienteDb().buscaPorCpf(cpf);
	}
	
	public PedidoFacade buscaPedido(int id) {
		return new PedidoFacadeDb().buscaPorId(id);
	}

	public AcessorioFacade buscaAcessorio(String nome) {
		return new AcessorioFacadeDb().buscaPorNome(nome);
	}
}
