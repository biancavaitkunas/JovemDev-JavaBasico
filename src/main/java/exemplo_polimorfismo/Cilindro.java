package exemplo_polimorfismo;

public class Cilindro extends Forma{
	
	public Cilindro() {
		super("Cilindro");
	}
	
	@Override
	public String desenhar() {
		return "Sou a forma cilindro";
	}

}
