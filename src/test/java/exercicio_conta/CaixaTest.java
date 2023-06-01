package exercicio_conta;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

public class CaixaTest {
	
	List <Conta> contas = new ArrayList<Conta>();
	Caixa caixa = new Caixa();
	
	@BeforeEach
	public void init() {
		contas.clear();
		contas.add(new ContaCorrente(1234, 100, "Pessoa 1", 500));
		contas.add(new ContaUniversitaria(4567, 100, "Pessoa 2", 1000));
		ContaEspecial cEspecial = new ContaEspecial(8912, 200, "Pessoa 3", 3000);
		cEspecial.setLimite(1000);
		contas.add(cEspecial);	
		
	}
	
	@Test
	@DisplayName("Teste deposito conta corrente")
	public void testeDepositoCorrenteContas() {
		Conta cc = contas.get(0);
		cc.depositar(200);
		assertEquals(700, cc.getSaldo()); 
	}
	
	@Test
	@DisplayName("Teste deposito inválido em conta universitária")
	public void testeDepositoInvalidoCU() {
		Conta cu = contas.get(1);
		assertEquals("Pessoa 2", contas.get(1).getNome());
		cu.depositar(1200);
		assertEquals(1000, cu.getSaldo());
	}
	
	@Test
	@DisplayName("Teste deposito válido em conta universitária")
	public void testeDepositoValidoCU() {
		Conta cu = contas.get(1);
		cu.depositar(500);
		assertEquals(1500, cu.getSaldo());
	}
	
	@Test
	@DisplayName("Teste saque inválido em conta universitária")
	public void testeSaqueInvalidoCU() {
		Conta cc = contas.get(0);
		cc.sacar(600);
		assertEquals(500, cc.getSaldo());
	}
	
	@Test
	@DisplayName("Teste saque inválido em conta corrente")
	public void testeSaqueInvalidoCC() {
		Conta cu = contas.get(1);
		cu.sacar(1100);
		assertEquals(1000, cu.getSaldo());
	}
	
	@Test
	@DisplayName("Sacar com limite na conta especial")
	public void sacarComLimite() {
		Conta ce = contas.get(2);
		ce.sacar(3500);
		assertEquals(-500, ce.getSaldo());
	}
	
	@Test
	@DisplayName("Teste transferencia")
	public void testeTransferencia() {
		
	}
	
	

}
