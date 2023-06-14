package builder.pizzaria;

public class PizzaBuilder {
	
	private Pizza pizza;
	
	public PizzaBuilder() {
		this.pizza = new Pizza();
	}
	
	public PizzaBuilder setSize(Integer size){
		pizza.setSize(size);
		return this;
		
	}
	
	public PizzaBuilder addChesse() {
		pizza.setFlagCheese(true);
		return this;
	}
	
	public PizzaBuilder addPepperoni() {
		pizza.setFlagPepperoni(true);
		return this;
	}
	public Pizza getPizza() {
		validateSize();
		validateIngredients();
		return pizza;
	}
	
	private void validateSize() {
		if(pizza.getSize()<=0 || pizza.getSize()>3) {
			throw new IllegalStateException("Tamanho invalido");
		}
		
	}
	private void validateIngredients() {
		if(!pizza.getFlagCheese() && !pizza.getFlagPepperoni()) {
			throw new IllegalStateException("Combinacao invalida");
		}
	}
	
	
}
