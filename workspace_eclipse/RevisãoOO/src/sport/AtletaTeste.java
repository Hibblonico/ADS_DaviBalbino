package sport;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

public class AtletaTeste {
	
	
	void testarNadador() {
		Swimer swimerSarah = new Swimer("Sarah", 20, 87, false);
		
		swimerSarah.swim();
		
		swimerSarah.get_older();
		System.out.println(swimerSarah.age);
		System.out.println(swimerSarah.aposentado);
		 
		
	}

	@Test
	void testarCiclista() {
		Biker bikerDavi = new Biker("Davi", 20, 103, false);
		assertFalse(bikerDavi.aposentado);
		System.out.println("Está aposentado?");
		if(bikerDavi.aposentado) {
			System.out.println("Sim");
		}
		else {
			System.out.println("Não");
		}
		
		bikerDavi.ride();
		bikerDavi.get_hoter();
		bikerDavi.get_older();
			
	}
}
