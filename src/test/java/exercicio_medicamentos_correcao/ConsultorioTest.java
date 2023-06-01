package exercicio_medicamentos_correcao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exercicio_medicamento.enums.EnumAdmMedicamento;
import exercicio_medicamento.models.Medicamento;
import exercicio_medicamento.models.Pessoa;
import exercicio_medicamento.utils.Consultorio;

class ConsultorioTest {
	
	Consultorio consultorio = new Consultorio();
	
	@BeforeEach
	void init() {
	    consultorio.getMedicamentos().clear();
	    consultorio.getPessoas().clear();
		Pessoa p1 = new Pessoa("Pessoa 1", "Gripe");
		p1.addCondicaoSaude("Diabetes");
		p1.addCondicaoSaude("Pressão Alta");
		
		Pessoa p2 = new Pessoa("Pessoa 2", "Dor");
		p2.addCondicaoSaude("Pressão Alta");
		
		Pessoa p3 = new Pessoa("Pessoa 3", "Dengue");
		p3.addCondicaoSaude("Asma");
		
		consultorio.getPessoas().add(p1);
		consultorio.getPessoas().add(p2);
		consultorio.getPessoas().add(p3);
		
		Medicamento m1 = new Medicamento("Medicamento 1", EnumAdmMedicamento.ORAL);
		m1.addIndicacao("Dor");
		m1.addIndicacao("Febre");
		m1.addContraIndicacao("Diabetes");
		
		Medicamento m2 = new Medicamento("Medicamento 2", EnumAdmMedicamento.ORAL);
		m2.addIndicacao("Gripe");
		
		Medicamento m3 = new Medicamento("Medicamento 3", EnumAdmMedicamento.INJETAVEL);
		m3.addContraIndicacao("Asma");
		m3.addIndicacao("Dengue");
		
		consultorio.getMedicamentos().add(m1);
		consultorio.getMedicamentos().add(m2);
		consultorio.getMedicamentos().add(m3);
		
	}

	@Test
	@DisplayName("Teste cadastrar Medicamento")
	void addMedicamento() {
		Medicamento m = new Medicamento("Teste 1", EnumAdmMedicamento.ORAL);
		consultorio.cadastraMedicamento(m);
		assertEquals(4, consultorio.getMedicamentos().size());
		consultorio.getMedicamentos().remove(0);
		assertEquals(3, consultorio.getMedicamentos().size());
		assertEquals("Medicamento 3", consultorio.getMedicamentos().get(1).getNome());
	}
	
	@Test
	@DisplayName("Teste cadastrar Pessoa")
	void addPessoa() {
		Pessoa p1 = new Pessoa("Teste 1", "");
		consultorio.cadastraPessoa(p1);
		assertEquals(4, consultorio.getPessoas().size());
		Pessoa p2 = new Pessoa("Teste 2", "");
		consultorio.cadastraPessoa(p2);
		assertEquals("Teste 2", consultorio.getPessoas().get(4).getNome());
		consultorio.getPessoas().remove(1);
		assertEquals(4, consultorio.getPessoas().size());
	}
	
	@Test
	@DisplayName("Teste prescricao ok")
	void addPrescricaoOK() {
		Pessoa p = consultorio.getPessoas().get(1);
		Medicamento m = consultorio.getMedicamentos().get(0);
		consultorio.prescreveMedicamento(p, m);
		assertEquals(1, p.getMedicamentos().size());
		assertEquals("Medicamento 1", p.getMedicamentos().get(0).getNome());
	}
	
	@Test
	@DisplayName("Teste prescricao por falha na indicação")
	void addPrescricaoFalhaIndicacao() {
		Pessoa p = consultorio.getPessoas().get(0);
		Medicamento m = consultorio.getMedicamentos().get(0);
		consultorio.prescreveMedicamento(p, m);
		assertEquals(0, p.getMedicamentos().size());
	}
	
	@Test
	@DisplayName("Teste prescrição com indicação e contra indicação simultâneo")
	void testeIndicacaoContraIndicacão() {
		
		Pessoa p = consultorio.getPessoas().get(2);
		Medicamento m = consultorio.getMedicamentos().get(2);
		consultorio.prescreveMedicamento(p, m);
		assertEquals(0, p.getMedicamentos().size()); 
		
	}
	
	@Test
	@DisplayName("Teste não indicação")
	void testeNaoIndicado() {
		Pessoa p1 = consultorio.getPessoas().get(2);
		Medicamento m1 = consultorio.getMedicamentos().get(0);
		assertEquals(false, m1.isIndicado(p1.getSintoma()));
		Pessoa p2 = consultorio.getPessoas().get(0);
		Medicamento m2 = consultorio.getMedicamentos().get(1);
		assertEquals(true, m2.isIndicado(p2.getSintoma()));
		
		
	}
	
	@Test
	@DisplayName("Teste indicacao")
	void testeIndicado() {
		Pessoa p1 = consultorio.getPessoas().get(1);
		Medicamento m1 = consultorio.getMedicamentos().get(0);
		assertEquals(true, m1.isIndicado(p1.getSintoma()));
		Pessoa p2 = consultorio.getPessoas().get(0);
		Medicamento m2 = consultorio.getMedicamentos().get(2);
		assertEquals(false, m2.isIndicado(p2.getSintoma()));
		
	}
	
	@Test
	@DisplayName("Teste existe pessoa")
	void testeExistePessoa() {
		Pessoa p = consultorio.getPessoas().get(1);
		assertEquals(true, consultorio.existePessoa(p)); 
		consultorio.getPessoas().remove(1);
		assertEquals(false, consultorio.existePessoa(p));
	}
	
	@Test
	@DisplayName("Teste existe medicamento")
	void testeExisteMedicamento() {
		Medicamento m = consultorio.getMedicamentos().get(1);
		assertEquals(true, consultorio.existeMedicamento(m)); 
		consultorio.getMedicamentos().remove(1);
		assertEquals(false, consultorio.existeMedicamento(m));
		
	}
	
	@Test
	@DisplayName("Teste contra indicacao")
	void testeContraIndicacao() {
		Pessoa p1 = consultorio.getPessoas().get(0);
		Medicamento m1 = consultorio.getMedicamentos().get(0);
		assertEquals(true, m1.isContraIndicado(p1.getCondicaoSaude())); 
		Pessoa p2 = consultorio.getPessoas().get(1);
		Medicamento m2 = consultorio.getMedicamentos().get(0);
		assertEquals(false, m2.isContraIndicado(p2.getCondicaoSaude())); 
		
	}
	
	

}
