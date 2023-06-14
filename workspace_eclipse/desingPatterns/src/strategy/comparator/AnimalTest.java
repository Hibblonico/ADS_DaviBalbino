package strategy.comparator;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AnimalTest {

	@Test
	void deveOrdenarListaDeAnimaisPeloNome() {
		List<Animal> listaDeanimais = new ArrayList<>();
		
		listaDeanimais.add(new Animal(1L,"Tartaruga"));
		listaDeanimais.add(new Animal(2L, "Coelho"));
		listaDeanimais.add(new Animal(3L,"Cachorro"));
		listaDeanimais.add(new Animal(4L,"Gato"));
		listaDeanimais.add(new Animal(5L, "Girafa"));
		listaDeanimais.add(new Animal(6L,"Gato"));
		System.out.println("Lista Original: ");
		listaDeanimais.forEach(System.out::println);
		listaDeanimais.sort(new ComparadorPorNome());
		System.out.println("Lista ordenada por nome:");
		listaDeanimais.forEach(System.out::println);
	}
	
}
