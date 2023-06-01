package exercicio_farmacia;

public class Medicamentos extends Produto{
	
	private boolean requerReceita;
	private String nomeM;
	
	public Medicamentos(String nome, int estoque, double valor, boolean requerReceita) {
		super(nome, estoque, valor);
		this.requerReceita = requerReceita;
		
	}
	
	@Override
	public boolean venda(Cliente c, int qtd) {
		if (podeVender(qtd)) {
			super.venda(c, qtd);
		} 
		if (requerReceita) {
			vendaMedicamentoReceita(c, qtd, defineNomeMedico(nomeM));
		}
		return false;
	}
	
	public String defineNomeMedico(String nome) {
		return nome;
		
	}
	
	public boolean vendaMedicamentoReceita(Cliente c, int qtd, String nomeM) {
		if (requerReceita) {
			this.nomeM = nomeM; 
		}
		return false;
	}
	

}
