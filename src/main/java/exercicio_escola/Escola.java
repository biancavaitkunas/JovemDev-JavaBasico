package exercicio_escola;

import java.util.ArrayList;
import java.util.List;


public class Escola {
	
	private List<Disciplina>disciplinas = new ArrayList<Disciplina>();
	private List<Aluno>alunos = new ArrayList<Aluno>();
	private List<Professor>professores = new ArrayList<Professor>();
	
	public Aluno cadAluno(Aluno a) {
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
	
	/*public boolean existeDisciplina (Disciplina d) {
		return disciplinas.contains(d);
	}*/


}
