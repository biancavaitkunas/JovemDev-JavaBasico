package terceira_aula.exercicio_time_correcao;

import javax.swing.JOptionPane;

import lombok.Getter;

@Getter
public class Jogador {
	
	private String nome;
	private int camisa;
	private int gols;
	
	public void cadastra() {
		nome = JOptionPane.showInputDialog("Nome do jogador");
		camisa = Integer.parseInt(JOptionPane.showInputDialog("Camisa"));
		gols = Integer.parseInt(JOptionPane.showInputDialog("Gols"));
	}
	
	@Override
	public String toString() {
		return nome + "-" + camisa + "-" + gols + "\n";
	}

}
