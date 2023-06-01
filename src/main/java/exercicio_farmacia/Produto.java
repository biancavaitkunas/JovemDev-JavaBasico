package exercicio_farmacia;

import lombok.Getter;

@Getter

public class Produto {
	
	protected String nome;
	protected int estoque;
	protected double valor;
	
	public Produto(String nome, int estoque, double valor) {
		this.nome = nome;
		this.estoque = estoque;
		this.valor = valor;
	}
	
	public boolean temEstoque () {
		return estoque > 0;
	}
	
	public void venda(Cliente c, Produto p, int qtd) {
		p.estoque = p.getEstoque() - qtd;
		c.saldoDevedor = c.getSaldoDevedor() + p.getValor()*qtd;
		
	}
	
	public boolean podeVender() {
		return temEstoque();
	}

}
