package terceira_aula.exercicio_time;

import javax.swing.JOptionPane;

public class Jogador {
		
	private String nome; 
	private int numeroCamisa;
	private int qtdGols;
	
	public void cadastraJogador() {
		
		nome = JOptionPane.showInputDialog("Qual o nome do jogador: ");
		numeroCamisa = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da camisa? "));
		qtdGols = Integer.parseInt(JOptionPane.showInputDialog("Qual quantidade de gols? "));

	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroCamisa() {
		return numeroCamisa;
	}

	public void setNumeroCamisa(int numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

	public int getQtdGols() {
		return qtdGols;
	}

	public void setQtdGols(int qtdGols) {
		this.qtdGols = qtdGols;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Numero da camisa: " + numeroCamisa + ", Quantidade de gols: " + qtdGols + "\n";
	}
	
	

}
