package exercicio_farmacia;

public class Perfumaria extends Produto{
	
	public Perfumaria(String nome, int estoque, double valor) {
		super(nome, estoque, valor);
	}
	
	@Override
	public void venda(Cliente c, Produto p, int qtd) {
		if (!c.isMaior() && p.podeVender()) {
			super.venda(c, p, qtd);
		}
		
	}

}
