package avancado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class SobreArrays {
	
	public static void main(String[] args) {
		Animal[] arrayDeAnimal = new Animal [4];
		
		arrayDeAnimal[0] = new Animal(1L,"Tataruga");
		arrayDeAnimal[1] = new Animal(2L,"Coelho");
		arrayDeAnimal[2] = new Animal(3L,"Cachorro");
		arrayDeAnimal[3] = new Animal(4L,"Gato");
		
		System.out.println("Array de animais: ");
		/*for(int i=0; i<arrayDeAnimal.length;i++)
		{
			System.out.println(arrayDeAnimal[i].getNome());
		}
		
	} */
		for(Animal animal: arrayDeAnimal) {
			System.out.println(animal.getNome());
		}
		
		Collection<String> colecao = buildCollectionImplementation();
		colecao.add("Gato");
		colecao.add("Cachorro");
		colecao.add("Leão");
		colecao.add("Pantera");
		colecao.add("Avestruz");
		
		System.out.println(colecao);
	
	}

	private static Collection<String> buildCollectionImplementation() {
		return new TreeSet<String>();
		
	}
	}
