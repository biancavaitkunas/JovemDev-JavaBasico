package exercicio_conta;

import lombok.Getter;

@Getter

public class ContaEspecial extends Conta{
	
	private double limite;
	
	public ContaEspecial(int numero, int agencia, String nome, double saldo, double limite) {
		super(numero, agencia, nome, saldo);
		this.limite = limite;
	}

	
	@Override
	public void sacar(double valorSaque) {
		if (valorSaque <= limite+saldo) {
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
