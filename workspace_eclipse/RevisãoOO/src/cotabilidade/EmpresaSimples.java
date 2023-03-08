package cotabilidade;

public class EmpresaSimples implements Tributavel {

	static final Double TAXA_IR_EMPRESA_SIMPLES = 0.15;
	Double faturamentoMensal;

	public EmpresaSimples(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorIR() {

		return this.faturamentoMensal * 0.15;
	}

	@Override
	public Double getValorISS() {
		// TODO Auto-generated method stub
		return this.faturamentoMensal * 0.08;
	}

}
