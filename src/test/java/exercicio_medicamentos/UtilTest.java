package exercicio_medicamentos;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UtilTest {
	
	private Util util = new Util();
	
	@BeforeEach
	void init() {
		
		List<String>sintomap1 = new ArrayList<String>();
		sintomap1.add("dor de cabeça");
		List<String>alergiap1 = new ArrayList<String>();
		alergiap1.add("dorflex");
		
		List<String>sintomap2 = new ArrayList<String>();
		sintomap2.add("dor de barriga");
		List<String>alergiap2 = new ArrayList<String>();
		alergiap2.add("doralgina");
		
		Pessoa p1 = new Pessoa("Pedro", sintomap1, alergiap1);
		util.add(p1);
		
		Pessoa p2 = new Pessoa("Maria", sintomap2, alergiap2);
		util.add(p2);
		
		List <String > contraindicacoesm1 = new ArrayList <String>();
		contraindicacoesm1.add("dor de barriga");
		List <String > indicacoesm1 = new ArrayList <String>();
		indicacoesm1.add("dor de cabeça");
		
		List <String > contraindicacoesm2 = new ArrayList <String>();
		contraindicacoesm2.add("dor de cabeça");
		List <String > indicacoesm2 = new ArrayList <String>();
		indicacoesm2.add("dor de barriga");
		
		Medicamento m1 = new Medicamento("advil", Administracao.ORAL, contraindicacoesm1, indicacoesm1);
		util.add(m1);
		
		Medicamento m2 = new Medicamento("engov", Administracao.ORAL, contraindicacoesm2, indicacoesm2);
		util.add(m2);
		
		
	}
	
	@Test
	@DisplayName("Teste adicionar pessoas na lista")
	
	void testAddPessoa() {
		
		List <Pessoa> cadsPessoa = util.listAllPessoas();
		assertEquals(2, cadsPessoa.size());
		List<String>sintomap3 = new ArrayList<String>();
		sintomap3.add("gravidez");
		List<String>alergiap3 = new ArrayList<String>();
		alergiap3.add("dipirona");
		util.add(new Pessoa("Isabela", sintomap3, alergiap3));
		assertEquals("Isabela", cadsPessoa.get(2).getNome());
		
	}
	
	@Test
	@DisplayName("Teste adicionar medicamentos na lista")
	
	void testAddMedicamento() {
		
		List <Medicamento> cadsMedicamentos = util.listAllMedicamentos();
		assertEquals(2, cadsMedicamentos.size());
		List <String > contraindicacoesm3 = new ArrayList <String>();
		contraindicacoesm3.add("dores musculares");
		List <String > indicacoesm3 = new ArrayList <String>();
		indicacoesm3.add("gravidez");
		util.add(new Medicamento("Meclizina", Administracao.INJETAVEL, contraindicacoesm3, indicacoesm3));
		
	}
	
	@Test
	@DisplayName("Teste prescrição")
	
	void testePrescricao() {
		
		List <Medicamento> cadsMedicamentos = util.listAllMedicamentos();
		Prescricao prescricao = util.prescreve("Maria", cadsMedicamentos);
		assertEquals(cadsMedicamentos.get(1), prescricao.medicamentos.get(1)); 		
		
		
	}
	
	@Test
	@DisplayName("Teste verificação alergia")
	
	void testeVerificaAlergia() {
		
		
		
	}

}
