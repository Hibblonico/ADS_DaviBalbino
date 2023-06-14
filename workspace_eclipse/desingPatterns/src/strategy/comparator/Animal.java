package strategy.comparator;

public class Animal {

	long id;
	String nome;
	public Animal(long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
}
