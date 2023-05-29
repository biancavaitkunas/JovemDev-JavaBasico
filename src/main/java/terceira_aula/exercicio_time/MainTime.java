package terceira_aula.exercicio_time;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainTime {
	
	public static void main(String[] args) {
		
		List<TimeFutebol> times = new ArrayList<TimeFutebol>();
		
		int op = 0;
		
		
		do {
			
			op = Util.menu();
			
			if (op == 1) {
				
				Util.cadastrarTimeFutebol(times);
				
			} else if (op == 2) {
				
				JOptionPane.showMessageDialog(null, Util.listarJogadoresTime(times));
				
			} else if(op == 3) {
				
				JOptionPane.showMessageDialog(null, Util.artilheiro(times));
				
			} else if(op == 4) {
				
				JOptionPane.showMessageDialog(null, Util.vencedor(times));
			}
				
		}while(op!=5);
		
	}

}
