package exercicio_farmacia;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter 

public class Farmacia {
	
	private List <Cliente> clientes = new ArrayList<Cliente>();
	private List <Produto> produtos = new ArrayList<Produto>();
	
	
	public Produto cadProdutos(Produto p) {
		produtos.add(p);
		return p;
	}
	
	public Cliente cadClientes (Cliente c) {
		clientes.add(c);
		return c;
	}
	
	public boolean vender(Cliente c, Produto p, int qtd) {
		return p.venda(c, qtd);
	}
	
	public int produtosEstoque() {
		int pEstoque = 0;
		for (Produto produto : produtos) {
			if (produto.getEstoque() > 0) {
				pEstoque ++;
			}
		}
		return pEstoque;
		
	}
	
	public int clientesInadimplentes() {
		int cInadimplentes = 0;
		for (Cliente cliente : clientes) {
			if (cliente.saldoDevedor > 0) {
				cInadimplentes++;
			}
		}
		return cInadimplentes;
	}
	

}
