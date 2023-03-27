package avancado;

import java.util.ArrayList;
import java.util.Collection;

public class SobreCollection_2 {
	
	private static void imprimirStatusDaColecao(Collection<String> engenharias) {
		if(engenharias.isEmpty()) {
			System.out.println("Vazio");
		}
		else {
			System.out.println("Tem Elementos");
		}
	}
	
	public static void main(String[] args) {
		
		Collection<String> engenhariasAtuais = new ArrayList<String>();
		
		engenhariasAtuais.add("Telecomunicações");
		engenhariasAtuais.add("Biomédica");
		engenhariasAtuais.add("Computação");
		engenhariasAtuais.add("Software");
		engenhariasAtuais.add("Produção");
		
		System.out.println("Engenharias Atuais: " + engenhariasAtuais);
		
		Collection<String> engenhariasFuturas = new ArrayList<String>();
		engenhariasFuturas.add("Mecânica");
		engenhariasFuturas.add("Mecatrônica");
		
		System.out.println("Engenharias Futuras: " + engenhariasFuturas);
		
		
		Collection<String> todas = new ArrayList<String>();
		
		todas.addAll(engenhariasAtuais);
		todas.addAll(engenhariasFuturas);
		
		System.out.println("Todas engenharias: " + todas);
		
		Collection<String> engenharias = new ArrayList<>(todas);
		
		System.out.println("Engenharias vazias? " + engenharias.isEmpty());
		System.out.println("Qtos elementos engenharias tem? " + engenharias.size());
		
		imprimirStatusDaColecao(engenharias);
		
		System.out.println("Invocando clear()");
		
		engenharias.clear();
		imprimirStatusDaColecao(engenharias);
		
	}
	
	
}
