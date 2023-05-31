package exercicio_aula;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class Disciplina {

	private String nome;
	private int cargaHoraria;
	private Formacao professor;
	private double nota1;
	private List<Double>notas = new ArrayList <Double>();
	
	public List<Double> addNotas(double nota1, double nota2, double nota3) {
		notas.add(nota1);
		notas.add(nota2);
		notas.add(nota3);
		return notas;
	}
	
	public double media() {
		
		double somaNotas = 0;
		
		for (Double nota: notas) {
			somaNotas += nota;
		}
		return somaNotas/3;
	}

}