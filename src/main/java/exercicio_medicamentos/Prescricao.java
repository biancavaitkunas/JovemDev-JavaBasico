package exercicio_medicamentos;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Prescricao {
	
	private Pessoa pessoa;
	List<Medicamento> medicamentos = new ArrayList <Medicamento>();
	

}
