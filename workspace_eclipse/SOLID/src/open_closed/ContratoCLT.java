package open_closed;

public class ContratoCLT implements Remuneravel {

	private Double salario;

	public ContratoCLT(Double salario) {
		super();
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}	
	
	public double getRemuneracao() {
		return this.getSalario();
	}
	
}
