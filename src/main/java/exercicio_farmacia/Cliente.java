package exercicio_farmacia;

public class Cliente {
	
	private String nome;
	protected double saldoDevedor;
	
	public Cliente(String nome, double saldoDevedor) {
		super();
		this.nome = nome;
		this.saldoDevedor = saldoDevedor;
	}

	
	public double pagarConta(double valor) {
		return saldoDevedor -= valor;
	}

}
