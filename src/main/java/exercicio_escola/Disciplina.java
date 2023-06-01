package exercicio_escola;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor

public class Disciplina {

	private String nome;
	private int cargaHoraria;
	private Formacao professor;
	private double n1, n2, n3;
	private Notas notas;
	
	public Disciplina(String nome, double n1, double n2, double n3) {
		super();
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	


}