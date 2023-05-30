package exercicio_medicamentos;

import java.util.ArrayList;

import java.util.List;

public class Util {

	private List<Pessoa> pessoa = new ArrayList<Pessoa>();
	private List<Medicamento> medicamentos = new ArrayList<Medicamento>();

	public Pessoa add(Pessoa p) {

		pessoa.add(p);
		return p;

	}

	public Medicamento add(Medicamento m) {

		medicamentos.add(m);
		return m;

	}
	
	public List<Pessoa> listAllPessoas () {
		return pessoa;
	}
	
	public List<Medicamento> listAllMedicamentos(){
		return medicamentos;
	}

	
	public Prescricao prescreve(String nome, List<Medicamento> listAllMedicamentos) {
		
		Pessoa pessoaEscolhida = pessoa.stream().filter(p -> p.getNome().equals(nome)).findAny().orElse(null);
		Prescricao prescricao = new Prescricao(pessoaEscolhida, listAllMedicamentos);
		
		for (Medicamento indicacao: listAllMedicamentos) {
			if (pessoaEscolhida.sintoma.equals(indicacao.indicacoes)) {
				prescricao = new Prescricao(pessoaEscolhida, listAllMedicamentos);
			}
			
		}
		
		return prescricao;
		
	}
	
	public boolean verificaAlergia(Prescricao prescreve) {
		
		boolean temAlergia = true;
		
		for (Medicamento contraIndicacoes: medicamentos) {
			if (prescreve.getPessoa().alergias.equals(contraIndicacoes.contraindicacoes)) {
				temAlergia = false;
			}
			
		}
		return temAlergia; 
		
	}


}
