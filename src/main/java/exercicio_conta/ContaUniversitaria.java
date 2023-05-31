package exercicio_conta;

public class ContaUniversitaria extends Conta{
	
	@Override
	public void sacar(double valorSaque) {
		if (saldo <= valorSaque) {
			super.sacar(valorSaque);
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
		if (saldo + valorDeposito > 2000) {
			super.depositar(saldo-valorDeposito);
		}
		
	}

}
