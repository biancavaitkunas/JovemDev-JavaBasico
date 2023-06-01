package exercicio_escola;

import org.junit.jupiter.api.BeforeEach;

public class EscolaTest {
	
	Escola escola = new Escola();
	
	@BeforeEach
	void init() {
		
		Aluno a = new Aluno("Aluno 1");
	}

}
