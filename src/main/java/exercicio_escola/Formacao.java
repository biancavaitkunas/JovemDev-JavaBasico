package exercicio_escola;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public enum Formacao {

	GRDUACAO(1), 
	ESPECIALIZACAO(2), 
	POSGRADUACAO(3);

	private int cod;

}
