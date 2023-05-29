package terceira_aula.exercicio_livros;

import java.util.List;

import javax.swing.JOptionPane;

public class Util {

	public static void cadastrarAutores(List<Autor> autores) {
			
			Autor a = new Autor();
			a.cadastraAutor();
			autores.add(a);
	
	}

	public static Autor escolheAutor(List<Autor> autores) {

		String menu = "Selecione o(a) autor(a): \n";
		int pos = 1;

		for (Autor autor : autores) {
			menu += pos + " - " + autor.getNome() + "\n";
			pos++;
		}

		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		if (op > pos) {
			JOptionPane.showMessageDialog(null, "Não há autores cadastrados nesse índice!");
		}
		
		return autores.get(op - 1);

	}

	public static void cadastrarLivros(List<Livro> livros, List<Autor> autores) {
		
			Livro l = new Livro();
			l.cadastrarLivro(autores);
			livros.add(l);
	}

	public static String listarTodosLivros(List<Livro> livros) {

		String lista = "Livros cadastrados:\n";
		for (Livro livro : livros) {
			lista += livro.listaDadosLivro();
		}

		return lista;
	}

	public static String buscaLivroPorAutor(List<Livro> livros, List<Autor> autores) {

		Autor a = escolheAutor(autores);
		String listaAutor = "Livros do(a) autor(a) " + a.getNome() + ": \n";

		for (Livro livro : livros) {

			if (livro.temAutor(a)) {
				listaAutor += livro.listaDadosLivro();
			}

			if (!livro.temAutor(a)) {
				int autor = Integer.parseInt(JOptionPane.showInputDialog(null, "Esse autor não possui livros cadastrados! "
						+ "\nDeseja cadastrar? \n1 - Sim \n2 - Não"));
				if (autor == 1) {
					Util.cadastrarLivros(livros, autores);
				}
			}
		}
		return listaAutor;
	}

	public static String buscaLivroPorPreco(List<Livro> livros) {

		double valorMinimo = Double.parseDouble(JOptionPane.showInputDialog("Valor mínimo para consulta? "));
		double valorMaximo = Double.parseDouble(JOptionPane.showInputDialog("Valor máximo para consulta? "));

		String listaPreco = "Livros da faixa de preco: R$ " + valorMinimo + " - R$ " + valorMaximo + ": \n";

		for (Livro livro : livros) {
			if (livro.faixaPreco(livros, valorMinimo, valorMaximo)) {
				listaPreco += livro.listaDadosLivro();
			}
		}
		return listaPreco;

	}
	

	public static String listaCriancas(List<Livro> livros) {

		String listaCrianca = "Livros cujos autores são crianças: \n";

		for (Livro livro : livros) {
				if (livro.temCrianca()) {
					listaCrianca += livro.listaDadosLivro();
			}
		
		}
		return listaCrianca;

	}

	public static String listaMulheres(List<Livro> livros) {

		String listaMulher = "Livros escritos somente por mulheres: \n";

		for (Livro livro : livros) {
			if (livro.temSomenteMulher()) {
				listaMulher += livro.listaDadosLivro();
			}
		}
		return listaMulher;

	}

	public static String listaHomens(List<Livro> livros) {

		String listaHomens = "Livros escritos somente por homens: \n";

		for (Livro livro : livros) {
			if (livro.temSomenteHomem()) {
				listaHomens += livro.listaDadosLivro();
			} 
		}
		return listaHomens;

	}
	
	boolean validar(String validacao) {
		if (validacao.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Preencha o campo!");
			return false;
		}
		return true;
		
	}
	
	public static int menu () {
		
		String menu = "Escolhauma opção: "
				+ "\n1 - Cadastrar Autor "
				+ "\n2 - Cadastrar livro "
				+ "\n3 - Listar todos os livros cadastrados "
				+ "\n4 - Pesquisar livro por autor"
				+ "\n5 - Pequisar livro por faixa de preço"
				+ "\n6 - Listar livros cujpos autores são crianças"
				+ "\n7 - Listar todos os livros cujos autores são somente mulheres"
				+ "\n8 - Listar todos os livros cujos autores são somente homens"
				+ "\n9 - Sair";
		
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

}
