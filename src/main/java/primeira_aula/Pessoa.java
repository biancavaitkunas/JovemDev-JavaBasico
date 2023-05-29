package primeira_aula;

public class Pessoa {

		private String nome;
		private String sexo;
		private double peso;
		private double altura;
		private double imc;
		private String avaliacaoIMC;
		

		public Pessoa() {
			super();
		}
		
		public Pessoa(String nome, String sexo, double peso, double altura) {
			super();
			this.nome = nome;
			this.sexo = sexo;
			this.peso = peso;
			this.altura = altura;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getSexo() {
			return sexo;
		}
		
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		
		public double getPeso() {
			return peso;
		}
		
		public void setPeso(double peso) {
			this.peso = peso;
		}
		
		public double getAltura() {
			return altura;
		}
		
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		public String getAvaliacaoIMC(double imc) {
			if (imc <= 18.5) {
				avaliacaoIMC = "Abaixo do peso";
			} else if (imc >= 18.6 && imc <=24.9){
				avaliacaoIMC = "Peso ideal";
			} else if (imc >= 25 && imc <= 29.9) {
				avaliacaoIMC = "Levemente acima do peso";
			} else if (imc >= 30 && imc <= 34.9) {
				avaliacaoIMC = "Obesidade grau l";
			} else if (imc >= 35 && imc <= 39.9) {
				avaliacaoIMC = "Obesidade grau ll";
			} else if ( imc >= 40) {
				avaliacaoIMC = "Obesidade mórbida";
			}
			
			return avaliacaoIMC;
		}
	

		public void setAvaliacaoIMC(String avaliacaoIMC) {
			this.avaliacaoIMC = avaliacaoIMC;
		}

		public void setIMC(double peso, double altura) {
			imc = peso/(altura*altura);
		}

		public double getImc() {
			return imc;
		}


		@Override
		public String toString() {
			return "Nome: " + nome + ", IMC: " + imc + ", Avaliação do IMC: " + avaliacaoIMC + "\n";
		}



}
