package strategy.frete;

public class ServicoFreteDHL implements Fretavel {
	
	@Override
	public double calcularValor(double pesoEmKG) {
		
		if(pesoEmKG< 20) {
			return 100.00;
		}else {
			return 90.00;
		}
	}

}
