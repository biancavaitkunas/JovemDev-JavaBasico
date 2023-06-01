package exercicio_escola;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter

public class DisciplinasAluno {
	
	private Disciplina d;
	private List <Double> notas = new ArrayList<Double>();
	private double [] nota = new double [3];
	
	public void addNotas (double n1, double n2, double n3) {
		notas.add(n1);
		notas.add(n2);
		notas.add(n3);
	}
	
	public double calculaMedia() {
		int soma = 0;
		for (Double notaAtual: notas) {
			soma += notaAtual;
		}
		return soma/3;
	}
	
	public void add (String nome, double n1, double n2, double n3) {
		nome = d.getNome();
		notas.add(n1);
		notas.add(n2);
		notas.add(n3);
	}


}
