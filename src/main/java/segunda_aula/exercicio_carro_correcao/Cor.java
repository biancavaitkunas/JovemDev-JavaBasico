package segunda_aula.exercicio_carro_correcao;

public enum Cor {
	
	PRETO (1, "Preto"), 
	BRANCO (2, "Branco"), 
	VERMELHO (3, "Vermelho"), 
	PRATA (4, "Prata");
	
	private int cod;
	private String descricao;
	
	private Cor(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static Cor findById(int cod) {
		for (Cor cor: Cor.values()) {
			if (cod == cor.cod) {
				return cor;
			}
			
		}
		
		return null;
	}

}
