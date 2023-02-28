package sport;

public class Runner extends Athlete {

	public Runner(String name, int age, int weigth, Boolean aposentado) {
		super(name, age, weigth, aposentado);
		// TODO Auto-generated constructor stub
	}
	
	void run() {
		System.out.println("Runner is running");
	}

}
