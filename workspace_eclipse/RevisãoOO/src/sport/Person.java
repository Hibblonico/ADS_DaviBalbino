package sport;

public class Person extends Object {
	String name;
	
	int age;

	public Person(String name, int age) { //CRTL+3 pra abrir o campo de pesquisa de comando
		super();
		this.name = name;
		this.age = age;
	}
	
	void get_older() {
		this.age++;
	}
	
}
