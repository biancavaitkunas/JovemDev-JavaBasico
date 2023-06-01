package exercicio_conta;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(int numero, int agencia, String nome, double saldo) {
		super(numero, agencia, nome, saldo);
	}
	
	@Override
	public void sacar(double valorSaque) {
		if (valorSaque > this.saldo) {
			this.saldo = saldo;
		} 
	}
	
	@Override
	public void transferencia(Conta beneficiada, double valorTransferencia) {
		if (saldo >= valorTransferencia) {
			super.transferencia(beneficiada, valorTransferencia);
		}
	}

}
