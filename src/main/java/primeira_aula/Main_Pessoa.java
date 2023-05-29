package primeira_aula;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main_Pessoa extends Pessoa {

	public static void main(String[] args) {

		ArrayList<Pessoa> Pessoas = new ArrayList<Pessoa>();
		int newPessoa = 0;

		while (newPessoa == 0) {
			newPessoa = Integer.parseInt(JOptionPane.showInputDialog("Cadastrar uma nova pessoa? \n0 - Sim\n1 - Não"));
			Pessoa p = new Pessoa();

			if (newPessoa == 0) {

				p.setNome(JOptionPane.showInputDialog("Digite o nome da pessoa: "));
				p.setSexo(JOptionPane.showInputDialog("Digite o sexo da pessoa: "));
				p.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da pessoa: ")));
				p.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa: ")));
				p.setIMC(p.getPeso(), p.getAltura());
				p.getAvaliacaoIMC(p.getImc());
				Pessoas.add(p);

			} else {
				
				System.out.println(Pessoas.toString());
				
			}

		}

	}

}
