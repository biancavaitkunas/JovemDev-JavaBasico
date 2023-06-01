package exercicio_farmacia;

public class Medicamentos extends Produto{
	
	private boolean requerReceita;
	private String medicoPrescreveu;
	
	public Medicamentos(String nome, int estoque, double valor, boolean requerReceita) {
		super(nome, estoque, valor);
		this.requerReceita = requerReceita;
	}
	
	@Override
	public void venda(Cliente c, Produto p, int qtd) {
		if (p.podeVender()) {
			super.venda(c, p, qtd);
		}
		
	}
	

}
