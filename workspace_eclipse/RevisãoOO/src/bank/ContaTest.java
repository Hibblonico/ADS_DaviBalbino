package bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {

	@Test
	void testContaCorrente() {
		
		Double saldoEsperado = 100.1;
		Double saldoObtido = 0.0;
		
		CorrenteAccount contacorrente = new CorrenteAccount();
		contacorrente.depositar(100.0);
		contacorrente.rentabilizar();
		assertEquals(saldoEsperado, contacorrente.saldo);
	}
	
}
