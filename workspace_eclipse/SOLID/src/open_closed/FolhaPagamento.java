package open_closed;

public class FolhaPagamento {

	private Double totalFolha = 0.0;
/*	public void calcular(Object obj) {
		if(obj instanceof ContratoCLT) {
			ContratoCLT contratoClt = (ContratoCLT) obj;
			totalFolha += contratoClt.getSalario();
		} else if (obj instanceof Estagio) {
			Estagio estagio = (Estagio) obj;
			totalFolha += estagio.getBolsaAuxilio();
		}else {
			
		}
	}
*/
	
		public void calcular(Remuneravel r) {
			this.totalFolha+= r.getRemuneracao();
		}
	
	
	public Double getTotalFolha() {
		return totalFolha;
	}
	
	}
