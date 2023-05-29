package segunda_aula.exercicio_carro_correcao;

import java.util.List;

import javax.swing.JOptionPane;

public class Util {
	
	public static Cor escolheCor() {
		String menuCor = "Escolha a cor: \n";
		
		for (Cor cor: Cor.values()) {
			menuCor += cor.getCod() + " - " + cor.getDescricao() + "\n";
		}
		
		int op = Integer.parseInt(JOptionPane.showInputDialog(menuCor));
		return Cor.findById(op);
	}
	
	public static void cadastraCarros(List <Carro> carros) {
		
		Carro c = new Carro();
		c.cadastro();
		carros.add(c);
		
	}
	
	public static String listaPeriodo(List <Carro> carros) {
		
		int anoInicial = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano inicial para consulta? "));
		int anoFinal = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano final para consulta? "));
		
		String lista = "Carros fabricados no período de " + anoInicial + " a " + anoFinal + ": \n ";
		
		for (Carro carro: carros) {
			if (carro.temPeriodo(carros, anoInicial, anoFinal)) {
				lista += carro.toString();
			}
		}
		return lista;
		
	}
	
	public static String listaMarca(List <Carro> carros) {
		
		String busca = JOptionPane.showInputDialog("Qual marca você deseja consultar: ");
		String lista = "Carros da marca " + busca + ": \n";
		
		for (Carro carro: carros) {
			if (carro.temMarca(carros, busca)) {
				lista += carro.toString();
			}
		}
		return lista;
		
	}
	
	public static String listaCor(List <Carro> carros) {
		
		Cor cor = Util.escolheCor();
		String lista = "Carros da cor " + cor.getDescricao() + ": \n";
		
		for (Carro carro: carros) {
			if (carro.temCor(carros, cor)) {
				lista += carro.toString();
			}
		}
		return lista;
		
	}
	
	public static int menu() {
		
		String menu = "1 – Cadastrar Carro\r\n"
				+ "2 – Listar os carros por período de fabricação\r\n"
				+ "3 – Listar carros por marca\r\n"
				+ "4 – Listar carros por cor\r\n"
				+ "5 – Sair \r\n";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
		
	}

}
