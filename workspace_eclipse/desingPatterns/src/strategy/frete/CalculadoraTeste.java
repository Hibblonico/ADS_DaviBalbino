package strategy.frete;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTeste {

	@Test
	void deveCalcularFrete() {
		Fretavel f = new ServicoFreteDHL();
		Fretavel f1 = new ServicoFreteJadLog();
		Fretavel f2 = new ServicoFreteSedex();
		Fretavel f3 = new ServicoFreteFedEx();
		assertEquals(f.calcularValor(19),100.00 );
		assertEquals(f1.calcularValor(29),0.00 );
		assertEquals(f2.calcularValor(5),50.00 );
		assertEquals(f3.calcularValor(19),0.00 );
	}
	
}
