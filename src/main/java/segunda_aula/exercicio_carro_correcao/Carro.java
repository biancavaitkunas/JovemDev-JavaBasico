package segunda_aula.exercicio_carro_correcao;

import java.util.List;

import javax.swing.JOptionPane;

public class Carro {
	
	private String marca;
	private int ano;
	private Enum cor;
	
	public void cadastro() {
		
		marca = JOptionPane.showInputDialog("Qual a marca do carro? ");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de fabicacao do carro? "));
		cor = Util.escolheCor();
		
		if (!valida()) {
			cadastro();
		}
		
	}
	
	boolean valida() {
		if (marca.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Erro! Preencha a marca!");
			return false;
		}
		if (ano < 0 || ano > 2023) {
			JOptionPane.showMessageDialog(null, "Erro! Ano inválido!");
			return false;
		}
		if (cor == null) {
			JOptionPane.showMessageDialog(null, "Erro! Cor inválida!");
			return false;
		}
		return true;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Enum getCor() {
		return cor;
	}

	public void setCor(Enum cor) {
		this.cor = cor;
	}

	public boolean temPeriodo(List <Carro> carros, int anoInicial, int anoFinal) {
		
		boolean temPeriodo = false;
		for (Carro carro: carros) {
			if (carro.getAno() > anoInicial && carro.getAno() < anoFinal) {
				return true;
			}
		}
		return temPeriodo;
		
	}
	
	public boolean temMarca(List <Carro> carros, String marcaBusca) {
		
		boolean temMarca = false;
		
		for (Carro carro: carros) {
			if (carro.getMarca().equalsIgnoreCase(marcaBusca)) {
				temMarca =  true;
			}
		}
		return temMarca;
		
	}
	
	public boolean temCor(List <Carro> carros, Cor cor) {
		
		boolean temCor = false;
		
		for (Carro carro: carros) {
			if (carro.getCor().equals(cor)) {
				temCor = true;
			}
		}
		return temCor;
		
	}

	@Override
	public String toString() {
		return "Marca: " + marca + " - Ano: " + ano + " - Cor: " + cor + "\n";
	}
	
}
