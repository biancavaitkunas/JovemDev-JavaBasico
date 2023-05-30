package exercicio_aula;

import java.util.List;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Aluno {
	
	private String nome;
	List <Disciplina> disciplinasAluno = new ArrayList<Disciplina>();
	List <Integer> notas = new ArrayList<Integer>();
	
	

}
