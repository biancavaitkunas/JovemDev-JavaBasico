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
	

}
