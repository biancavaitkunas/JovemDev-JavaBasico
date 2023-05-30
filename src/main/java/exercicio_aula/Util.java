package exercicio_aula;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Util {

	List <Professor> professores = new ArrayList<Professor>();
	List <Aluno> alunos = new ArrayList<Aluno>();
	List <Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Professor cadProfessor(Professor p) {
		professores.add(p);
		return p;
	}
	
	public Aluno cadAluno(Aluno a) {
		alunos.add(a);
		return a;
	}
	
	public Disciplina cadDisciplina (Disciplina d) {
		disciplinas.add(d);
		return d;
	}
	
	public List<Disciplina> escolheDisciplina(String nome, List <Disciplina> disciplinasAluno) {
		
		Aluno aluno = alunos.stream().filter(a -> a.getNome().equals(nome)).findAny().orElse(null); 
		
		for (Disciplina disciplina: disciplinasAluno) {
			aluno.disciplinasAluno.add(disciplina);
		}
		return null;
		
	}
	
	public List<Integer> listNotas(Disciplina d, Aluno a){
		return null;
		
	}

}
