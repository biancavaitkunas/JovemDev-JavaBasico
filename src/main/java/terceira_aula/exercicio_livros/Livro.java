package terceira_aula.exercicio_livros;

import java.util.List;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter

public class Livro {

	private String titulo;
	private double preco;
	List<Autor> autor = new ArrayList<Autor>();

	public void cadastrarLivro(List<Autor> autores) {

		int count = 0;
		int op = 0;

		titulo = JOptionPane.showInputDialog("Qual o nome do livro? ").toLowerCase();
		preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do livro? "));

		while (preco <= 0) {
			JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
			preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do livro? "));
		}

		do {
			autor.add(Util.escolheAutor(autores));
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"Cadastrar mais um autor para esse livro? (Máximo: 4 autores)" + "\n1 - Sim \n2 - Não"));

			if (op == 1) {
				count++;
				continue;

			} else if (op == 2) {
				break;

			}

		} while (count < 4);

	}

	public String listaDadosLivro() {

		String lista = "Dados do livro " + titulo + " - Preço: R$" + preco + "\n";
		for (Autor autor : autor) {
			lista += autor.toString();
		}
		return lista + "******************************";

	}

	public boolean temAutor(Autor autorBusca) {
		
		boolean temAutor = false;

		String busca = null;
		for (Autor autor : autor) {
			if (autor.getNome().equalsIgnoreCase(busca)) {
				temAutor = true;
			}
		}
		return temAutor;
	}

	public boolean faixaPreco(List<Livro> livros, double valorMinimo, double valorMaximo) {

		boolean faixapreco = false;

		for (Livro livro : livros) {
			if (livro.getPreco() >= valorMinimo && livro.getPreco() <= valorMaximo) {
				faixapreco = true;
			}
		}

		return faixapreco;

	}

	public boolean temCrianca() {

		boolean temCrianca = true;

		for (Autor autores : autor) {
			if (autores.getIdade() > 12) {
				temCrianca = false;
			}
		}
		return temCrianca;

	}

	public boolean temSomenteMulher() {

		boolean temSomenteMulher = true;

		for (Autor autores : autor) {
			if (autores.getSexo().equalsIgnoreCase("m")) {
				temSomenteMulher = false;
			}

		}

		return temSomenteMulher;

	}

	public boolean temSomenteHomem() {

		boolean temSomenteHomem = true;

		for (Autor autores : autor) {
			if (autores.getSexo().equalsIgnoreCase("f")) {
				temSomenteHomem = false;
			}
		}

		return temSomenteHomem;

	}


}
