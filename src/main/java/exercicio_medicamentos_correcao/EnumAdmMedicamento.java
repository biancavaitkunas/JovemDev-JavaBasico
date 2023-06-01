package exercicio_medicamentos_correcao;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumAdmMedicamento {
	
	ORAL ("Oral"),
	INJETAVEL("Injetável"),
	TOPICO ("Tópico"),
	SUPOSITORIO ("Supositório");
	
	private String descricao;

}
