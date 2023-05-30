package exercicio_medicamentos;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class Medicamento {
	
	private String nome;
	private Administracao adm;
	List <String> contraindicacoes = new ArrayList<String>();
	List <String> indicacoes = new ArrayList<String>();
	
	@Override
	public String toString() {
		return "Medicamento: " + nome + 
				"\nAdministração: " + adm + 
				"\nContraindicacoes=" + contraindicacoes + 
				"\nIndicacões: " + indicacoes + "\n\n";
	}

}
