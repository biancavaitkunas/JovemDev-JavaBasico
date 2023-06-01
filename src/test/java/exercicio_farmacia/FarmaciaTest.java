package exercicio_farmacia;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class FarmaciaTest {
	
	Farmacia farmacia = new Farmacia ();
	
	@BeforeEach
	public void init() {
		
		Cliente c1 = new Cliente("Cliente 1", 300);
		Cliente c2 = new Cliente("Cliente 2", 50);
		farmacia.getClientes().add(c1);
		farmacia.getClientes().add(c2);
		
		farmacia.getProdutos().add(new Medicamentos("Medicamento 1", 20, 15.50, true));
		farmacia.getProdutos().add(new Perfumaria("Perfumaria 1", 50, 5));
		farmacia.getProdutos().add(new Hospitalares("Hospitalar 1", 10, 200));

	}
	
	@Test
	@DisplayName("Teste add Produto")
	public void addProduto() {
		
	}

}
