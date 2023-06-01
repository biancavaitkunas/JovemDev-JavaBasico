package exercicio_conta;
import lombok.NoArgsConstructor;


@NoArgsConstructor

public class ContaUniversitaria extends Conta{
	
	public ContaUniversitaria(int numero, int agencia, String nome, double saldo) {
		super(numero, agencia, nome, saldo);
	}

	
	@Override
	public void sacar(double valorSaque) {
		if (saldo >= valorSaque) {
			super.sacar(valorSaque);
		} else {
			this.saldo = saldo;
		}
	}
	
	@Override
	public void transferencia(Conta beneficiada, double valorTransferencia) {
		saldo = beneficiada.saldo;
		if (saldo + valorTransferencia > 2000) {
			saldo = beneficiada.saldo -= valorTransferencia;
		} 
	}
	
	@Override
	public void depositar(double valorDeposito) {
		if (this.saldo + valorDeposito < 2000) {
			super.depositar(valorDeposito);
		} else {
			this.saldo = saldo;
		}
		
	}

}
