package bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {

	
		
	@Test
	void  testPolimorfismo() {
			
		boolean flagContaCorrenteComoDefault = true;
		
		Account conta = null;
		
		if(flagContaCorrenteComoDefault) {
			conta = new CorrenteAccount();
		} else {
			conta = new AccountPoupanca();
		}
		
		conta.depositar(1000.0);
		conta.rentabilizar();
		System.out.println(conta.getClass().getName());
		System.out.println(conta.saldo);
		System.out.println(conta);
	}

	
}
