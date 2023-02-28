package sport;

public class Athlete extends Person {
	
	int weigth;
	Boolean aposentado;
	
	public Athlete(String name, int age, int weigth, Boolean aposentado) {
		super(name, age);
		this.weigth = weigth;
		this.aposentado = aposentado;
	}
	
	void get_hoter(){
		System.out.println("Atleta aquecido");
	}
	
	void aposentado() {
		this.aposentado = true;
	}

}
