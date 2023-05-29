package segunda_aula.exercicio_carro;


public class Carro {

	private String marca;
	private int ano;
	private Cor cor;
	
	public Carro(String marca, int ano, Cor cor) {
		super();
		this.marca = marca;
		this.ano = ano;
		this.cor = cor;
	}

	public Carro() {

	}

	public int getAno() {
		return ano;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Cor getCor() {
		return cor;
	}

	public String getMarca() {
		return marca;
	}
	

	@Override
	public String toString() {
		return "Marca: " + marca + ", Ano: " + ano + ", Cor: " + cor + "\n";
	}
	
	

}
