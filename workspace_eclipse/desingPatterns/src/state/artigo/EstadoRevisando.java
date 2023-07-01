package state.artigo;

import java.time.LocalDate;

public class EstadoRevisando implements Estado {

	
	private Artigo artigo;
	
	public EstadoRevisando(Artigo artigo) {
		this.artigo= artigo;
	}

	@Override
	public void publicar() {
		GerenteDeSeguranca gerenteSeguranca = GerenteDeSeguranca.getInstace();
		
		if(gerenteSeguranca.ehUsuarioModerador()) {
			this.artigo.transitarEstadoPara(new EstadoAprovado(artigo));
			this.artigo.getLogHistorico().add("Transitado para Aprovado em "+ LocalDate.now());
			return;
		}else {
			throw new RuntimeException("Usuario não tem permissão para publicar");
		}
		
	}

	@Override
	public void reprovar() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstace();
		if(gerenteDeSeguranca.ehUsuarioModerador()) {
			this.artigo.transitarEstadoPara(new EstadoRascunho(artigo));
			this.artigo.getLogHistorico().add("Transitado para RASCUNHO em "+ LocalDate.now());
			return;
		}else {
			throw new RuntimeException("Usuario não tem permissao para reprovar");
		}
	}
}
