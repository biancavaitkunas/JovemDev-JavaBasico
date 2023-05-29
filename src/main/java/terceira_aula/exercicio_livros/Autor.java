package terceira_aula.exercicio_livros;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Autor {
	
	private String nome;
	private String sexo;
	private int idade;
	
	public void cadastraAutor() {
		
			nome = JOptionPane.showInputDialog("Qual o nome e sobrenome do autor: ").trim();
			
			while (!validaNome(nome)){
				JOptionPane.showMessageDialog(null, "Digite o nome e sobrenome");
				nome = JOptionPane.showInputDialog("Qual o nome e sobrenome do autor: ");
			}
			
			sexo = JOptionPane.showInputDialog("Qual o sexo do autor: \nF - Feminino \nM - Masculino");
			
			idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do autor: "));
			
			while (idade < 0) {
				JOptionPane.showMessageDialog(null, "A idade não pode ser negativa! Digite novamente.");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do autor: "));
			}
			
		
	}
	
	
	public boolean validaNome(String nome) {
		
		String [] palavra = nome.split(" ");
		return palavra.length >= 2;
		
	}

	@Override
	public String toString() {
		return "Autor: " + nome + " - Sexo: " + sexo + " - " + idade + " anos\n";
	}
	
	

}
