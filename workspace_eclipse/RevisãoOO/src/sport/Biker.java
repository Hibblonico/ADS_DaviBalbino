package sport;

public class Biker extends Athlete{

	public Biker(String name, int age, int weigth, Boolean aposentado) {
		super(name, age, weigth, aposentado);
		// TODO Auto-generated constructor stub
	}
	
	void ride() {
		System.out.println("Biker is ridiyng");
	}
	
}
