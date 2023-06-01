package exercicio_medicamentos_correcao;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Consultorio {
	
	private List<Medicamento> medicamentos = new ArrayList<Medicamento>();
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	void cadastraMedicamento(Medicamento m) {
		medicamentos.add(m);
	}
	
	void cadastraPessoa(Pessoa p) {
		pessoas.add(p);
	}
	
	boolean existeMedicamento(Medicamento m) {
		return medicamentos.contains(m); 
	}
	
	boolean existePessoa(Pessoa p) {
		return pessoas.contains(p);
	}
	
	void prescreveMedicamento(Pessoa p, Medicamento m) {
		if(existeMedicamento(m) && existePessoa(p)) {
			p.addMedicamento(m);
		}
	}
	
}
