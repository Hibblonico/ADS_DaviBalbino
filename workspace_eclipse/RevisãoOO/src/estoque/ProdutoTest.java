package estoque;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class ProdutoTest {

	@Test
	void testProdutoComoJavaBean() {
		
		Produto p = new Produto();
		p.setDescricao("Queijo Minas 1KG");
		p.setValorCompra(50.00);
		p.setDataDeValidade(LocalDate.of(2022, Month.DECEMBER, 30));
		
		System.out.println("Dados do produto:");
		System.out.println(p.getDescricao());
		System.out.println(p.getValorCompra());
		System.out.println(p.getDataDeValidade());
		
	}
	
}
