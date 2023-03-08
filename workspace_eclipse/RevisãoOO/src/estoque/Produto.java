package estoque;

import java.time.LocalDate;

public class Produto {

	private String descricao;
	private Double valorCompra;
	private LocalDate dataDeValidade;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public LocalDate getDataDeValidade() {
		return dataDeValidade;
	}
	public void setDataDeValidade(LocalDate dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}
	
	
	
	
	
	
	
}
