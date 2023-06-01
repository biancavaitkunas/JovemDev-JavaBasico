package exercicio_farmacia;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter

public class Cliente {
	
	protected String nome;
	protected double saldoDevedor;
	
	public boolean isMaior() {
		return saldoDevedor > 300;
	}

	public Cliente(String nome, double saldoDevedor) {
		super();
		this.nome = nome;
		this.saldoDevedor = saldoDevedor;
	}
	
	public double pagarConta(double valor) {
		return this.saldoDevedor - valor;
	}

}
