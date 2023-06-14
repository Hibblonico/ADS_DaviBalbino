package state.artigo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArtigoTeste {

	@Test
	void deveArtigoTransitarDeRascunhoAteAprovado() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstace();
		
		ZzzArtigo artigo  = new ZzzArtigo();
		
		//1. Rascunho -> Revisando
		
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertEquals("REVISANDO", artigo.getEstado());
		
		//2. Revisando -> Aprovado
		
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.publicar();
		
		assertEquals("APROVADO", artigo.getEstado());
		
		//Imprime o Historico
		artigo.getLogHistorico().forEach(System.out::println);
		
		
		
	}
	
}
