package exercicio_aula;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Disciplina {
	
	private String nome;
	private int cargaHoraria;
	private FormacaoProfessor professor;

}
