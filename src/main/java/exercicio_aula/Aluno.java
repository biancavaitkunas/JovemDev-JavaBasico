package exercicio_aula;

import java.util.List;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor


public class Aluno {
	
	private String nome;
	private List <Disciplina> disciplinasAluno = new ArrayList<Disciplina>();
	
	public void addDisciplina(Disciplina d) {
		disciplinasAluno.add(d);
	}


}
