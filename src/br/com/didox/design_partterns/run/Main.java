package br.com.didox.design_partterns.run;

import java.util.Scanner;

import br.com.didox.design_partterns.strategy.com_padrao.Fisica;
import br.com.didox.design_partterns.strategy.com_padrao.Juridica;
import br.com.didox.design_partterns.strategy.sem_padrao.Pessoa;
import br.com.didox.design_partterns.chain_of_responsability.com_padrao.ComEstampa;
import br.com.didox.design_partterns.chain_of_responsability.com_padrao.ComNomePersonalizado;
import br.com.didox.design_partterns.chain_of_responsability.com_padrao.ComSeloCorredor;
import br.com.didox.design_partterns.chain_of_responsability.com_padrao.Produto;
import br.com.didox.design_partterns.chain_of_responsability.sem_padrao.AdicionalSemPadrao;
import br.com.didox.design_partterns.chain_of_responsability.sem_padrao.ProdutoSemPadrao;
import br.com.didox.design_partterns.singleton.Email;
import br.com.didox.design_partterns.singleton.utilizando.Armazenamento;
import br.com.didox.design_partterns.singleton.utilizando.Escritorio;
import br.com.didox.design_partterns.singleton.utilizando.Mesanino;
import br.com.didox.design_partterns.singleton.utilizando.Presente;
import br.com.didox.design_partterns.singleton.utilizando.TipoProduto;


public class Main {
	public static void main(String[] args) {
		chainOfResponsabilitySemPadrao();
	}
	
	private static void chainOfResponsabilityComPadrao() {
		var camisetaSimples = new Produto();
		var adicionaisSelo = new ComSeloCorredor(null);
		camisetaSimples.setNome(adicionaisSelo.alteraNome("Padrão 000"));
		System.out.println("Nome da camiseta ficou: " + camisetaSimples.getNome());
		
		var camiseta = new Produto();
		var adicionais = new ComSeloCorredor(new ComEstampa(new ComNomePersonalizado(null)));
		camiseta.setNome(adicionais.alteraNome("Padrão 001"));
		System.out.println("Nome da camiseta ficou: " + camiseta.getNome());
	}
	
	private static void chainOfResponsabilitySemPadrao() {
		var camisetaSimples = new ProdutoSemPadrao();
		var adicionaisSimples = new AdicionalSemPadrao(true, false, false);
		camisetaSimples.setNome(adicionaisSimples.alteraNome("Padrão 000"));
		System.out.println("Nome da camiseta ficou: " + camisetaSimples.getNome());
		
		var camiseta = new Produto();
		var adicionais = new AdicionalSemPadrao(true, true, true);
		camiseta.setNome(adicionais.alteraNome("Padrão 001"));
		System.out.println("Nome da camiseta ficou: " + camiseta.getNome());
	}
	
	
	private static void usandoSingleton() {
		var disco = new Presente("Disco 1", "Este disco serve para cortar madeira", TipoProduto.Mesanino);
		var tesoura = new Presente("Tesoura", "Tesoura de corte", TipoProduto.Escritorio);
		
		Armazenamento.Gardar(disco);
		Armazenamento.Gardar(tesoura);

		System.out.println("Quantidade de produtos para Mesanino: " + Mesanino.estoque().produtos().size());
		System.out.println("Quantidade de produtos para Escritório: " + Escritorio.estoque().produtos().size());
	}
	
	
	private static void singleton() {
		Email.configurar("danilo.aparecido.santos@gmail.com", "localhost", "root", "123pin");
		try {
			Email.configurado().enviar("enviar@gmail.com", "Olá você", "Vamos ir ao evento juntos ? lá teremos ...");
		}
		catch(Exception erro){
			System.out.println("Erro ao enviar email - " + erro.getMessage());
		}
	}
	
	private static void strategyComPadao() {
		Scanner in = new Scanner(System.in);  
      
		System.out.println("Qual é o tipo de pessoa que deseja fazer o cadastro ?");
		System.out.println("Fisica (f)");
		System.out.println("Juridica (j)");

		if(in.nextLine().toLowerCase().equals("f")) {
			Fisica fisica = new Fisica();
			fisica.setCpf("333.333.333-33");
			fisica.setNome("Pessoa fisica");
			fisica.salvar();
		}
		else {
			Juridica juridica = new Juridica();
			juridica.setCnpj("122.223.222/0001-22");
			juridica.setRazaoSocial("Pessoa juridica");
			juridica.salvar();
		}
		
		in.close();
	}
	
	private static void strategySemPadao() {
		Scanner in = new Scanner(System.in);  
      
		System.out.println("Qual é o tipo de pessoa que deseja fazer o cadastro ?");
		System.out.println("Fisica (f)");
		System.out.println("Juridica (j)");

		Pessoa pessoa = new Pessoa();
		pessoa.setTipo(in.nextLine());
		
		if(pessoa.getTipo().equals("f")) {
			pessoa.setCpf("333.333.333-33");
			pessoa.setRazaoSocial("Pessoa fisica");
		}
		else {
			pessoa.setCnpj("122.223.222/0001-22");
			pessoa.setRazaoSocial("Pessoa juridica");
		}
		
		pessoa.salvar();
		
		in.close();
	}
}
