package bank;

public class CorrenteAccount extends Account {

	
	
	@Override
	void rentabilizar() {
		this.saldo *= 1.01;
	}

	

}
