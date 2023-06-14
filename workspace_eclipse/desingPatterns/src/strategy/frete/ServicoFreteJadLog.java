package strategy.frete;

public class ServicoFreteJadLog implements Fretavel {

	@Override
	public double calcularValor(double pesoEmKG) {
		if(pesoEmKG<30.00) {
			return 0.00;
		}else {
			return 150.00;
		}
	}
}
