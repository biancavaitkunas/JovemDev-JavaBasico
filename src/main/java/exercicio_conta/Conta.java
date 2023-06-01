package exercicio_conta;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter 
@AllArgsConstructor
@NoArgsConstructor

public class Conta {
	
	protected int numero;
	protected int agencia;
	protected String nome;
	protected double saldo;
	
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public void sacar(double valorSaque) {
		this.saldo -= valorSaque;
	}
	
	public void transferencia(Conta beneficiada, double valorTransferencia) {
		if (this.saldo >= valorTransferencia) {
			this.saldo -= valorTransferencia;
			beneficiada.saldo += valorTransferencia;
		}
	}
	

}
