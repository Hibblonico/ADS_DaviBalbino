package sport;

import org.junit.jupiter.api.Test;

public class AtletaTeste {
	
	@Test
	void testarNadador() {
		Swimer swimerSarah = new Swimer("Sarah", 20, 87, false);
		
		swimerSarah.swim();
		
		swimerSarah.get_older();
		System.out.println(swimerSarah.age);
		System.out.println(swimerSarah.aposentado);
		 
	}

}
