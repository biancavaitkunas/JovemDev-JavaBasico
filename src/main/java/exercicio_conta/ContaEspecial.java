package exercicio_conta;

import lombok.Setter;

@Setter

public class ContaEspecial extends Conta{
	
	private double limite;
	
	@Override
	public void sacar(double valorSaque) {
		if (saldo >= limite+saldo) {
			super.sacar(valorSaque);
		}
	}
	
	@Override
	public void transferencia(Conta beneficiada, double valorTransferencia) {
		if (saldo + limite > valorTransferencia) {
			super.transferencia(beneficiada, valorTransferencia);
		}
	}

}
