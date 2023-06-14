package open_closed;

import static org.junit.Assert.*;

import org.junit.Test;

public class FolhaPagamentoTest {

	@Test
	public void testCalcular() {

		ContratoCLT contratoCLT = new ContratoCLT(1000.0);
		Estagio estagio = new Estagio(500.0);
				
		FolhaPagamento folhaPagamento = new FolhaPagamento();
		folhaPagamento.calcular(contratoCLT);
		folhaPagamento.calcular(estagio);
				
		Double valorEsperado = 1500.0;
		Double valorAtual = folhaPagamento.getTotalFolha();
		assertEquals(valorEsperado,valorAtual);
			}
			
	}


