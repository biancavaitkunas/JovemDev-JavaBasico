package exercicio_escola;

import java.util.List;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Aluno {

	private String nome;
	//List <String> disciplinas = new ArrayList<String>();
	List <Disciplina> disciplinas = new ArrayList<Disciplina>();

	public Aluno(String nome) {
		super();
		this.nome = nome;
	}
	
	public Disciplina add (Disciplina d) {
		disciplinas.add(d);
		return d;
	}
	
	public boolean temDisciplina (Disciplina d) {
		return disciplinas.contains(d);
	}

	/*public void addDisciplina(String nome, double nota1, double nota2, double nota3) {
		disciplinas.add(nome);
		disciplinas.add(String.valueOf(nota1));
		disciplinas.add(String.valueOf(nota2));
		disciplinas.add(String.valueOf(nota3));
		calculaMedia(nota1, nota2, nota3);

	}*/

	public double calculaMedia(double nota1, double nota2, double nota3) {
		return nota1 + nota2 + nota3 / 3;
	}
}
