package exercicio_farmacia;

public class Perfumaria extends Produto{
	
	public Perfumaria(String nome, int estoque, double valor) {
		super(nome, estoque, valor);
	}
	
	@Override
	public boolean venda(Cliente c, int qtd) {
		if (c.saldoDevedor < 300 && podeVender(qtd)) {
			super.venda(c, qtd);
		}
		return false;
	} 

}
