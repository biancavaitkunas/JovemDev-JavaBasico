package terceira_aula.exercicio_livros;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MainLivro {

	public static void main(String[] args) {
		
		List<Autor> autores = new ArrayList<Autor>();
		List<Livro> livros = new ArrayList<Livro>();
		
		int op = 0;
		
		do {
			
			op = Util.menu();
			
			if (op == 1) {
				
				Util.cadastrarAutores(autores);
				
			} else if (op == 2) {
				
				Util.cadastrarLivros(livros, autores);
			}else if (op == 3) {
				
				JOptionPane.showMessageDialog(null, Util.listarTodosLivros(livros));
				
			}else if (op == 4) {
				
				JOptionPane.showMessageDialog(null, Util.buscaLivroPorAutor(livros, autores));
				
			}else if (op == 5) {
				
				JOptionPane.showMessageDialog(null,Util.buscaLivroPorPreco(livros));
				
			}else if (op == 6) {
				
				JOptionPane.showMessageDialog(null, Util.listaCriancas(livros));
				
			}else if (op == 7) {
				
				JOptionPane.showMessageDialog(null, Util.listaMulheres(livros));
				
			}else if (op == 8) {
				
				JOptionPane.showMessageDialog(null, Util.listaHomens(livros));
			}
			
		}while(op != 9);
		

	}

}