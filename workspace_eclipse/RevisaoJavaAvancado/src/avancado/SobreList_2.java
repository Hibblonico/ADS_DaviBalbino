package avancado;

import java.util.ArrayList;
import java.util.List;

public class SobreList_2 {
	
	public static void main(String[] args) {
		List<Animal> listaDeAnimal = new ArrayList<Animal>();
		listaDeAnimal.add(new Animal(1L, "Tartaruga"));
		listaDeAnimal.add(new Animal(2L, "Coelho"));
		listaDeAnimal.add(new Animal(3L, "Cachorro"));
		listaDeAnimal.add(new Animal(4L, "Gato"));
		listaDeAnimal.add(new Animal(5L, "Girafa"));
		listaDeAnimal.add(new Animal(6L, "Gato"));
		
		System.out.println(listaDeAnimal);
		
	}
}
