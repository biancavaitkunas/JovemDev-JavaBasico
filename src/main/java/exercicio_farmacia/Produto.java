package exercicio_farmacia;

import lombok.Getter;

@Getter

public class Produto {
	
	private String nome;
	protected int estoque;
	private double valor;
	
	public Produto(String nome, int estoque, double valor) {
		this.nome = nome;
		this.estoque = estoque;
		this.valor = valor;
	}
	
	public boolean venda(Cliente c, int qtd) {
		estoque = getEstoque() - qtd;
		c.saldoDevedor = c.saldoDevedor + getValor()*qtd;
		return true;
		
	}
	
	public boolean podeVender(int qtd) {
		if (estoque > qtd) {
			return true;
		}
		return false;
	}
}
