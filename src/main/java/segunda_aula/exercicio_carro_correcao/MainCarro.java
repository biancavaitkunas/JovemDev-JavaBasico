package segunda_aula.exercicio_carro_correcao;
import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class MainCarro {

	public static void main(String[] args) {
		
		List <Carro> carros = new ArrayList<Carro>();
		
		int op = 0;
		
		do {
			
			op = Util.menu();
			
			if (op == 1) {
				Util.cadastraCarros(carros);
			} else if (op == 2) {
				JOptionPane.showMessageDialog(null, Util.listaPeriodo(carros));
			} else if (op == 3) {
				JOptionPane.showMessageDialog(null,Util.listaMarca(carros));
			} else if (op == 4) {
				JOptionPane.showMessageDialog(null,Util.listaCor(carros));
			}
			
		}while(op != 5);
		

	}

}
