package br.com.didox.design_partterns.factory;

public class AnimalFactory {
	public static IAnimal FabricaAnimal(TipoAnimal tipo) throws Exception {
		switch (tipo)
	      {
	          case Cachorro:
	              return new Cachorro();
	          case Gato:
	              return new Gato();
	          default:
	            throw new Exception("Animal não existente");
	      }
	}
}
