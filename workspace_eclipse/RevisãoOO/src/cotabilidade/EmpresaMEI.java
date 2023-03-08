package cotabilidade;

public class EmpresaMEI implements Tributavel {
	
	Double faturamentoMensal;

	public EmpresaMEI() {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorIR() {
		
		return this.faturamentoMensal *0.275;
	}

	@Override
	public Double getValorISS() {
		
		return 0.0;
	}
	
	

}
