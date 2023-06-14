package builder.pizzaria;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PizzaTeste {
	@Test
	void deveContruirPizzaValida(){
		
		Pizza pizza = new PizzaBuilder()
				.setSize(1)
				.addChesse()
				.addPepperoni()
				.getPizza();
		
		assertNotNull(pizza);
		assertNotNull(pizza.getSize());
		assertTrue(pizza.getFlagCheese());
		assertTrue(pizza.getFlagPepperoni());
	}

	@Test
	void deveContruirPizzaInvalida(){
		
		Pizza pizza = new PizzaBuilder()
				.setSize(3)
				
				.getPizza();
		
		assertNotNull(pizza);
		assertNotNull(pizza.getSize());
		assertTrue(pizza.getFlagCheese());
		assertTrue(pizza.getFlagPepperoni());
	}

}



