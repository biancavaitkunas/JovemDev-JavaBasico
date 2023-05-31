package exercicio_conta;

public class ContaCorrente extends Conta{
	
	@Override
	public void sacar(double valorSaque) {
		if (saldo <= valorSaque) {
			super.sacar(valorSaque);
		}
	}
	
	@Override
	public void transferencia(Conta beneficiada, double valorTransferencia) {
		if (saldo >= valorTransferencia) {
			super.transferencia(beneficiada, valorTransferencia);
		}
	}
}
