package terceira_aula.exercicio_time;

import java.util.List;
import javax.swing.JOptionPane;

public class Util {
	
	public static void cadastrarTimeFutebol(List<TimeFutebol> times) {
		
		TimeFutebol t = new TimeFutebol();
		t.cadastraTime();
		times.add(t);
	}
	
	public static TimeFutebol escolherTime(List<TimeFutebol> times) {
		
		String menu = "Escolha um time\n";
		int pos = 1;
		
		for (TimeFutebol time: times) {
			menu += pos + " - " + time.getNome() + "\n";
			pos ++;
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return times.get(op-1);
		
	}
	
	public static String artilheiro(List<TimeFutebol> times) {
		
		String lista = "O artilheiro do campeonato foi: \n";
		
		Jogador artilheiro = new Jogador();
		for (TimeFutebol time : times) {
			if (time.getArtilheiro().getQtdGols() > artilheiro.getQtdGols()) {
				artilheiro = time.getArtilheiro();
			}
		}
		return lista + artilheiro.toString();
	}
	
	public static String listarJogadoresTime(List<TimeFutebol> times) {
		
		TimeFutebol t = escolherTime(times);
		return t.listarJogadores();
	}
	
	public static String vencedor(List<TimeFutebol> times) {
		
		String lista = "O time com mais gols foi: \n";
		TimeFutebol vencedor = new TimeFutebol();
		
		for (TimeFutebol time : times) {
			if(time.getGols() > vencedor.getGols()) {
				vencedor = time;
			}
		}
		return lista + vencedor.getNome();
	}
	
	public static int menu() {
		
		String menu = "1 - Cadastrar time\n"
				+ "2 - Listar todos jogadores de um time\n"
				+ "3 - Verificar artilheiro do campeonato\n"
				+ "4 - Verificar qual time fez mais gols no campeonato\n"
				+ "5 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

}
