package strategy.frete;

public class ServicoFreteFedEx implements Fretavel{

@Override
public double calcularValor(double pesoEmKG) {
	if(pesoEmKG<20.00) {
		return 0.00;
	}else if(pesoEmKG<40){
		return 45.00;
	}else {
		return 75.00;
	}
}
	
}
