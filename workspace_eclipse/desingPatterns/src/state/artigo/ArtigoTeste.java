package state.artigo;



import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class ArtigoTeste {

	@Test
	void deveArtigoTransitarDeRascunhoAteAprovado() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstace();
		
		Artigo artigo  = new Artigo();
		
		//1. Rascunho -> Revisando
		
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRevisando );
		
		//2. Revisando -> Aprovado
		
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.publicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoAprovado);
		
		//Imprime o Historico
		artigo.getLogHistorico().forEach(System.out::println);
		
		
		
	}
	
}
