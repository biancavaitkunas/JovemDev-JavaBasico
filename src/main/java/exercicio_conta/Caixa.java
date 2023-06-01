package exercicio_conta;

import lombok.Getter;

@Getter

public class Caixa {
	
	private Conta conta;
	
	public void deposito(Conta c, double valor) {
		c.depositar(valor); 
	}
	
	public void saque(Conta c, double valor) {
		c.sacar(valor);
	}
	
	public void transferencia(Conta c, Conta recebe, double valor) {
		c.transferencia(recebe, valor);
	}

}
