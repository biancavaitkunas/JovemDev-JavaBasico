package exercicio_conta;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class ContaEspecial extends Conta{
	
	private double limite;
	
	public ContaEspecial(int numero, int agencia, String nome, double saldo) {
		super(numero, agencia, nome, saldo);
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
