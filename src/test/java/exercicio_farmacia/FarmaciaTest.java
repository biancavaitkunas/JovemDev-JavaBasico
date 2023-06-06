package exercicio_farmacia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class FarmaciaTest {
	
	//terminar e testar requerimento de receita
	
	Farmacia farmacia = new Farmacia ();
	
	@BeforeEach
	public void init() {
		
		farmacia.getClientes().clear();
		farmacia.getProdutos().clear();
		
		farmacia.getClientes().add(new Cliente("Cliente 1", 300));
		farmacia.getClientes().add(new Cliente("Cliente 2", 50));
		
		farmacia.getProdutos().add(new Medicamentos("Medicamento 1", 20, 10, true));
		farmacia.getProdutos().add(new Perfumaria("Perfumaria 1", 50, 5));
		farmacia.getProdutos().add(new Hospitalares("Hospitalar 1", 10, 200));
		farmacia.getProdutos().add(new Perfumaria("Perfumaria 2", 0, 20));

	}
	
	@Test
	@DisplayName("Teste add Cliente")
	public void addCliente() {
		Cliente c3 = new Cliente ("Cliente 3", 400);
		farmacia.cadClientes(c3);
		assertEquals(3, farmacia.getClientes().size());
	}
	
	@Test 
	@DisplayName("Teste add Produto")
	public void addProduto() {
		farmacia.cadProdutos(new Medicamentos("Medicamento 2", 30, 90.50, false));
		assertEquals(5, farmacia.getProdutos().size());
		assertEquals("Medicamento 2", farmacia.getProdutos().get(4).getNome());
	}
	
	@Test
	@DisplayName("Teste válido vender medicamento")
	public void vendaValidaMedicamento() {
		farmacia.vender(farmacia.getClientes().get(0), farmacia.getProdutos().get(0), 10);
		assertEquals(10, farmacia.getProdutos().get(0).estoque);
		assertEquals(400, farmacia.getClientes().get(0).saldoDevedor);
	}
	
	@Test
	@DisplayName("Teste inválido vender medicamento")
	public void vendaInvalidaMedicamento() {
		farmacia.vender(farmacia.getClientes().get(0), farmacia.getProdutos().get(0), 25);
		assertEquals(20, farmacia.getProdutos().get(0).estoque);
		assertEquals(300, farmacia.getClientes().get(0).saldoDevedor);
	} 
	
	@Test
	@DisplayName("Teste válido vender perfumaria")
	public void vendaValidaPerfumaria() {
		farmacia.vender(farmacia.getClientes().get(1), farmacia.getProdutos().get(1), 4);
		assertEquals(46, farmacia.getProdutos().get(1).estoque);
		assertEquals(70, farmacia.getClientes().get(1).saldoDevedor);
	}
	
	@Test
	@DisplayName("Teste vender perfumaria para cliente com saldo inválido")
	public void vendaInvalidaPerfumaria() {
		farmacia.vender(farmacia.getClientes().get(0), farmacia.getProdutos().get(1), 5);
		assertEquals(50, farmacia.getProdutos().get(1).estoque);
		assertEquals(300, farmacia.getClientes().get(0).saldoDevedor);
	}
	
	@Test
	@DisplayName("Teste vender hospitalar")
	public void vendaHospitalar() {
		farmacia.vender(farmacia.getClientes().get(0), farmacia.getProdutos().get(2), 15);
		assertEquals(-5, farmacia.getProdutos().get(2).estoque);
		assertEquals(3300, farmacia.getClientes().get(0).saldoDevedor);
	}
	
	@Test
	@DisplayName("Teste cliente pagar conta")
	public void clientePagaContar() {
		farmacia.getClientes().get(0).pagarConta(150);
		assertEquals(150, farmacia.getClientes().get(0).saldoDevedor);
	}
	
	@Test
	@DisplayName("Teste quantidade produtos em estoque")
	public void produtosEstoque() {
		farmacia.produtosEstoque();
		assertEquals(3, farmacia.produtosEstoque());
	}
	
	@Test
	@DisplayName("Teste lista produtos em estoque")
	public void clientesInadimplentes() {
		farmacia.clientesInadimplentes();
		assertEquals(2, farmacia.clientesInadimplentes());
	}
	
}
