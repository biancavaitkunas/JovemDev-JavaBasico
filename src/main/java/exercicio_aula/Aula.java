package exercicio_aula;

import java.util.ArrayList;
import java.util.List;


public class Aula {
	
	private List<Disciplina>disciplinas = new ArrayList<Disciplina>();
	private List<Aluno>alunos = new ArrayList<Aluno>();
	private List<Professor>professores = new ArrayList<Professor>();
	
	public Aluno cadAluno(Aluno a) {
		
		a.addDisciplina(null);
		alunos.add(a);
		return a;
		
	}
	
	public Disciplina cadDisciplina(Disciplina d) {
		disciplinas.add(d);
		return d;
	}
	
	public Professor cadProfessor(Professor p) {
		professores.add(p);
		return p;
	}
	
	public boolean existeAluno (Aluno a) {
		return alunos.contains(a);
	}
	
	public boolean existeDisciplina (Disciplina d) {
		return disciplinas.contains(d);
	}
	
	public A cadNotaDisciplina(Aluno a, Disciplina d) {
		a.addDisciplina(d.addNotas(0, 0, 0));
	}

}
