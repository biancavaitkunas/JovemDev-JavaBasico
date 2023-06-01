package exercicio_medicamentos;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor

public class Pessoa {
	
	private String nome;
	List <String> sintoma = new ArrayList <String> ();
	List <String> alergias = new ArrayList <String> ();
	
	
	
	

}
