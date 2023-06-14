package builder.carro;

public class Carro {

	private Porta porta[];
	private Motor motor;
	private ComputadorDeBordo cb;
	private FreioABS freioABS;
	
	public Porta[] getPorta() {
		return porta;
	}
	public void setPorta(Porta[] porta) {
		this.porta = porta;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public ComputadorDeBordo getCb() {
		return cb;
	}
	public void setCb(ComputadorDeBordo cb) {
		this.cb = cb;
	}
	public FreioABS getFreioABS() {
		return freioABS;
	}
	public void setFreioABS(FreioABS freioABS) {
		this.freioABS = freioABS;
	}

	
	
	}
