package br.com.didox.design_partterns.run;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;

import br.com.didox.design_partterns.strategy.com_padrao.*;
import br.com.didox.design_partterns.strategy.sem_padrao.Pessoa;
import br.com.didox.design_partterns.chain_of_responsability.com_padrao.*;
import br.com.didox.design_partterns.chain_of_responsability.sem_padrao.*;
import br.com.didox.design_partterns.command.PedidoService;
import br.com.didox.design_partterns.singleton.Email;
import br.com.didox.design_partterns.singleton.utilizando.*;
import br.com.didox.design_partterns.template_method.com_padrao.*;
import br.com.didox.design_partterns.state.sem_padra.*;
import br.com.didox.design_partterns.state.com_padrao.*;
import br.com.didox.design_partterns.factory.AnimalFactory;
import br.com.didox.design_partterns.factory.TipoAnimal;
import br.com.didox.design_partterns.flyweight.*;
import br.com.didox.design_partterns.builder.*;
import br.com.didox.design_partterns.prototype.*;
import br.com.didox.design_partterns.decorator.*;
import br.com.didox.design_partterns.observer.*;
import br.com.didox.design_partterns.facade.*;

public class Testando {
	public static void main(String[] args) throws Exception {
		/*
	
		UpperCamelCase (PascalCase);
		lowerCamelCase (camelCase);
		underline (undescore) -> um_methodo_com_dados
		--------------------------------------------------
		Objetos ou ações			Tipo		Exemplo
		--------------------------------------------------
		Class						Pascal		AppDomain
		Enum type					Pascal		ErrorLevel
		Interface					Pascal		IDisposable
		Method						Pascal		ToString
		Parameter					Camel		typeName
		Protected instance field	Camel		redValue
		
		*/
		
		flyweight();
		
	}
	
	private static void flyweight() throws LineUnavailableException, InterruptedException{
		// forma de economizar memória ao criar instancia;
		var musicas = new ArrayList<INota>();
		musicas.add(new Do());
		musicas.add(new Re());
		musicas.add(new Mi());
		musicas.add(new Mi()); // repeti
		musicas.add(new Do()); // repeti
		
		for(var nota : musicas) {
			Sound.tone(nota.freq(), 500);
		}
		
		
		Thread.sleep(2000); // 2 segundos
		
		
		// com flyweight
		var notasMusicais = new NotasMusicais();
		var musicasFly = new ArrayList<INota>();
		musicasFly.add(notasMusicais.tiposNota("do"));
		musicasFly.add(notasMusicais.tiposNota("re"));
		musicasFly.add(notasMusicais.tiposNota("mi"));
		musicasFly.add(notasMusicais.tiposNota("mi"));
		musicasFly.add(notasMusicais.tiposNota("do"));
		
		for(var nota : musicasFly) {
			Sound.tone(nota.freq(), 500);
		}
	}
	
	
	private static void facade(){
		var empresaFacade = new EmpresaFacade();
		var cliente = empresaFacade.buscaCliente("122333");
		var acessorio = empresaFacade.buscaAcessorio("martela");
		var pedido = empresaFacade.buscaPedido(1);
	}
	
		
	private static void observer(){

		// Sem o observer
		var pedidoService = new br.com.didox.design_partterns.observer.PedidoService(
				new br.com.didox.design_partterns.observer.Pedido());
		
		pedidoService.salvar(new br.com.didox.design_partterns.observer.Email(), 
				new br.com.didox.design_partterns.observer.BancoDeDados());
		

		System.out.println("===============");
		
		
		//Com observer
		var pedidoObservable = new PedidoObservable(
				new br.com.didox.design_partterns.observer.Pedido());
		pedidoObservable.acoes.add(new br.com.didox.design_partterns.observer.Email());
		pedidoObservable.acoes.add(new br.com.didox.design_partterns.observer.BancoDeDados());
		
		pedidoObservable.salvar();
		
	}
	
	private static void decorator(){
		var roupa = new Roupa(new Lycra(new Veludo(new Algodao(new Lycra()))));
		System.out.println(roupa.ComoElaFicou());
	}
	
	private static void command(){
		// teria que fazer o mesmo em lugares diferentes quando quiser criar um pedido
		var pedido = new br.com.didox.design_partterns.command.Pedido();
		pedido.setData(LocalDateTime.now());
		pedido.setCliente(new br.com.didox.design_partterns.command.Cliente("Danilo"));
		pedido.setValorTotal(100);
		new br.com.didox.design_partterns.command.PedidoService(pedido).salvar();
		

		// um unico lugar um unico comando que faz o pedido para mim
		new br.com.didox.design_partterns.command.GeraPedido(LocalDateTime.now(), 
				100, new br.com.didox.design_partterns.command.Cliente("Danilo")).executa();
	}
	
	
	private static void prototype(){
		var funcionario = new Funcionario();
		funcionario.setId(1);
		funcionario.setNome("Danilo");
		funcionario.setCpf("2233322222222");
		funcionario.setIdentificacao(122);
		
		var funcionario2 = funcionario.Clone();
		funcionario2.setId(2); 
		
		System.out.println(funcionario.getNome() + " - " + funcionario.getId() + " - " + funcionario.getIdentificacao());
		System.out.println(funcionario2.getNome() + " - " + funcionario2.getId() + " - " + funcionario2.getIdentificacao());
	}
	
	private static void builder() throws Exception {
		var veiculo = BuilderVeiculo.construir("Veiculo 1", 10, 100.3, Nacionalidade.Brasil);
		System.out.println(veiculo.getValor());
		

		var veiculo2 = BuilderVeiculo.construir("Veiculo 2", 10, 100.3, Nacionalidade.Eua);
		System.out.println(veiculo2.getValor());
	}
	

	private static void factory() throws Exception {
		var gato = AnimalFactory.FabricaAnimal(TipoAnimal.Gato);
		System.out.println(gato.falar());
		
		var cachorro = AnimalFactory.FabricaAnimal(TipoAnimal.Cachorro);
		System.out.println(cachorro.falar());
	}
	
	
	private static void stateComPadrao() {
		var personaliza = new ComEstampaStateComPadrao(
				new ComSeloCorredorStateComPadrao(new ComEstampaStateComPadrao(null, new PagoState()), new AguardandoState()), 
				new PendenteState());

		System.out.println(personaliza.alteraNome("Danilo"));
	}
	
	private static void stateSemPadrao() {
		var personaliza = new ComEstampaStateSemPadrao(
				new ComSeloCorredorStateSemPadrao(null, "Aguardando"), "Pendente");

		System.out.println(personaliza.alteraNome("Danilo"));
	}
	
	private static void templateMethod() {

		var carros = new ArrayList<Carro>();
		
		var bmw = new BmwX3();
		bmw.setDetalhes("Uma bmw");
		carros.add(bmw);
		

		var gol = new Gol();
		gol.setDetalhes("Um Gol");
		carros.add(gol);
		

		var fusca = new Fusca();
		fusca.setDetalhes("Um Fusca");
		carros.add(fusca);
		
		for(var carro: carros) {
			System.out.println(carro.getDetalhes());
			System.out.println(carro.ComoEsteCarroAnda());
			System.out.println("---------------");
		}
	}
	
	private static void chainOfResponsabilityComPadrao() {
		var camisetaSimples = new Produto();
		var adicionaisSelo = new ComSeloCorredor(null);
		camisetaSimples.setNome(adicionaisSelo.alteraNome("Padrão 000"));
		System.out.println("Nome da camiseta ficou: " + camisetaSimples.getNome());
		
		var camiseta = new Produto();
		var adicionais = new ComSeloCorredor(
				new ComEstampa(
						new ComNomePersonalizado(
								new ComEstampa(null)
								)
						)
				);
		
		camiseta.setNome(adicionais.alteraNome("Padrão 001"));
		System.out.println("Nome da camiseta ficou: " + camiseta.getNome());
	}
	
	private static void chainOfResponsabilitySemPadrao() {
		var camiseta1 = new ProdutoSemPadrao();
		var adicionaisSimples = new AdicionalSemPadrao(true, false, false);
		var novoNome = adicionaisSimples.alteraNome("Padrão 000");
		
		camiseta1.setNome(novoNome);
		System.out.println("Nome da camiseta ficou: " + camiseta1.getNome());
		
		var camiseta = new Produto();
		var adicionais = new AdicionalSemPadrao(true, true, true);
		camiseta.setNome(adicionais.alteraNome("Padrão 001"));
		System.out.println("Nome da camiseta ficou: " + camiseta.getNome());
	}
	
	
	private static void usandoSingleton() {
		var disco = new Presente("Disco 1", "Este disco serve para cortar madeira", TipoProduto.Mesanino);
		var tesoura = new Presente("Tesoura", "Tesoura de corte", TipoProduto.Escritorio);
		var caneta = new Presente("caneta", "caneta preta", TipoProduto.Escritorio);
		
		Armazenamento.Gardar(disco);
		Armazenamento.Gardar(tesoura);
		Armazenamento.Gardar(caneta);

		System.out.println("Quantidade de produtos para Mesanino: " + Mesanino.estoque().produtos().size());
		System.out.println("Quantidade de produtos para Escritório: " + Escritorio.estoque().produtos().size());
	}
	
	
	private static void singleton() {
		
		//Email.configurar("danilo.aparecido.santos@gmail.com", "localhost", "root", "123pin");
		try {
			Email.configurado().enviar("enviar@gmail.com", "Olá você", "Vamos ir ao evento juntos ? lá teremos ...");
		}
		catch(Exception erro){
			System.out.println("Erro ao enviar email - " + erro.getMessage());
		}
	}
	
	private static void strategyComPadao() {
		Scanner in = new Scanner(System.in);  
      
		System.out.println("Pessoa fisica e juridica criada");
		
		var pessoas = new ArrayList<IPessoa>();

		Fisica fisica = new Fisica();
		fisica.setCpf("333.333.333-33");
		fisica.setNome("Pessoa fisica");
		pessoas.add(fisica);
		
		Juridica juridica = new Juridica();
		juridica.setCnpj("122.223.222/0001-22");
		juridica.setRazaoSocial("Pessoa juridica");
		pessoas.add(juridica);
		
		for(var pessoa: pessoas) {
			pessoa.salvar();
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
			pessoa.setNome("Pessoa fisica");
		}
		else {
			pessoa.setCnpj("122.223.222/0001-22");
			pessoa.setRazaoSocial("Pessoa juridica");
		}
		
		pessoa.salvar();
		
		in.close();
	}
}
