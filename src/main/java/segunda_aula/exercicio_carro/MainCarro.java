package segunda_aula.exercicio_carro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainCarro {

	public static void main(String[] args) {

		ArrayList<Carro> Carros = new ArrayList();

		int op = 1;

		while (op != 0) {

			op = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha uma opção: \n1 - Cadastrar Carro" + "\n2 - Listar os carros por período de fabricação"
							+ "\n3 - Listar carros por marca" + "\n4 - Listar carros por cor " + "\n5 - Sair"));

			if (op == 1) {

				Cor[] cores = Cor.values();
				Carro c = new Carro();

				c.setMarca(JOptionPane.showInputDialog("Qual a marca do carro? "));
				c.setAno(Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de fabricação do carro?")));
				Cor opcao = Cor.valueOf(JOptionPane.showInputDialog("Qual é a cor do carro? Opções \nPreto" + "\nBranco \nPrata \nVermelho"));
				c.setCor(opcao);
				Carros.add(c);


			} else if (op == 2) {

				int anoI = Integer.parseInt(JOptionPane.showInputDialog("Qual ano inicial você deseja consultar? "));
				int anoF = Integer.parseInt(JOptionPane.showInputDialog("Qual ano final você deseja consultar? "));

				boolean consta = false;
				for (Carro carro : Carros) {
					if (anoI >= carro.getAno() && anoF <= carro.getAno()) {
						consta = true;
						System.out.println(carro.toString());
					}
				}

				if (!consta) {
					System.out.println("Não consta");
				}

			} else if (op == 3) {

				String marca = JOptionPane.showInputDialog("Qual marca você deseja consultar? ");

				boolean consta = false;
				for (Carro carro : Carros) {
					if (carro.getMarca().equalsIgnoreCase(marca)) {
						consta = true;
						System.out.println(carro.toString());
					}

				}
				if (!consta) {
					System.out.println("Não consta");
				}

			} else if (op == 4) {

				Cor cor = Cor.valueOf(JOptionPane.showInputDialog("Qual cor de carro você deseja consultar? Opções \nPreto" + "\nBranco \nPrata \nVermelho"));

				boolean consta = false;
				for (Carro carro : Carros) {
					if (carro.getCor().equals(cor)) {
						consta = true;
						System.out.println(carro.toString());
					}

				}
				if (!consta) {
					System.out.println("Não consta");
				}

			} else if (op == 5) {

				break;

			}
		}

	}

}
