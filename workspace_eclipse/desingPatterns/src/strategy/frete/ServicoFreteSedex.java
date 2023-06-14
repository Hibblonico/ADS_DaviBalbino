package strategy.frete;

public class ServicoFreteSedex implements Fretavel {

	@Override
	public double calcularValor(double pesoEmKG) {
		
		if(pesoEmKG<10) {
			return 50.00;
		}else if(pesoEmKG<20.00) {
			return 70.00;
		}else {
			return 90.00;
		}
		
	}
	
}
