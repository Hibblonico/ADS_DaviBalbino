package bank;

public abstract class Account {

	Double saldo = 0.0;
	
	void depositar(Double valor) {
		this.saldo += valor;
	}
	
	void sacar(Double valor) {
		this.saldo -= valor;
	}
	
	abstract void rentabilizar();

	@Override
	public String toString() {
		return "Account [saldo=" + saldo + "]";
	}
	
	
}
