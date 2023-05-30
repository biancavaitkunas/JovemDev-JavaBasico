package exercicio_medicamentos;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public enum Administracao {

	INJETAVEL(1), TOPICO(2), ORAL(3), SUPOSITORIO(4);

	private int cod;

}
