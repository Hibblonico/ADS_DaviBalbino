package state.artigo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class ZzzArtigo {

	private String estado;
	
	private List<String> logHistorico = new ArrayList<>();
	
	public ZzzArtigo() {
		this.estado = "RASCUNHO";
		
	}

	public String getEstado() {
		return estado;
	}

	

	public List<String> getLogHistorico() {
		return logHistorico;
	}
	
	public void publicar() {
		
		GerenteDeSeguranca gerenteSeguranca = GerenteDeSeguranca.getInstace();
		
		if("RASCUNHO".equals(this.estado)) {
			if(gerenteSeguranca.ehUsuarioAutor()) {
				this.estado = "REVISANDO";
				this.logHistorico.add("Transitado para REVISADO em "+ LocalDate.now());
				return;
			}else {
				throw new RuntimeException("Usuario não tem permissão para publicar");
			}
		}
		
		if("REVISANDO".equals(this.estado)) {
			if(gerenteSeguranca.ehUsuarioModerador()) {
				this.estado = "APROVADO";
				this.logHistorico.add("Transitado para PROVADO em "+ LocalDate.now());
				return;
			}else {
				throw new RuntimeException("Usuario sem permissao para publicar");
			}
		}
		
		if("APROVADO".equals(estado)) {
			return;
		}
	}
	
	public void reprovar() {
		GerenteDeSeguranca gerente = GerenteDeSeguranca.getInstace();
		if("RASCUNHO".equals(estado)) {
			return;
		}
		if("APROVADO".equals(estado)) {
			return;
		}
		if("REVISANDO".equals(estado)) {
			this.estado = "RASCUNHO";
			logHistorico.add("Transitado para Rascunho em "+ LocalDate.now());
			return;
		}else {
			throw new RuntimeException("Usuario não tem permissao para reprovar");
			}
		
	}
}
