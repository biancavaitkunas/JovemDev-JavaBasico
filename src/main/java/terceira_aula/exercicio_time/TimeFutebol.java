package terceira_aula.exercicio_time;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class TimeFutebol {

	private String nome;
	List<Jogador> jogadores = new ArrayList<Jogador>();

	void cadastraTime() {

		int newJogador = 1;

		nome = JOptionPane.showInputDialog("Qual o nome do time: ");

		while (newJogador == 1) {
			Jogador j = new Jogador();
			j.cadastraJogador();
			jogadores.add(j);
			newJogador = Integer.parseInt(JOptionPane.showInputDialog("Cadastrar novo jogador? "
					+ "\n1 - Sim"
					+ "\n2 - Não"));
		}

	}
	
	public String getNome() {
		return nome;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public String listarJogadores() {

		String lista = null;
		for (Jogador jogador : jogadores) {
			lista = jogador.toString();
		}
		return lista;

	}
	
	public Jogador getArtilheiro () {
		
		Jogador artilheiro = jogadores.get(0);
		for (Jogador jogador: jogadores) {
			if (jogador.getQtdGols() > artilheiro.getQtdGols()) {
				artilheiro = jogador;
			}
		}
		return artilheiro;
	}
	
	public int getGols() {
		int gols = 0;
		for (Jogador jogador : jogadores) {
			gols += jogador.getQtdGols();
		}
		return gols;
	}


}
