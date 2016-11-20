
public class Jogo extends Midia {

	public static final int TIPO_JOGO = 3;
	private String genero;

	public Jogo(String titulo, int anoCriacao, String genero) {
		super(titulo, anoCriacao);
		this.genero = genero;
	}

	public int getTipo() {
		return TIPO_JOGO;
	}
	
	public String imprimeFicha() {
		StringBuilder sb = new StringBuilder();
		sb.append("Título: " + this.titulo);
		sb.append("\nAno: " + this.anoCriacao);
		sb.append("\nTipo: Jogo Eletrônico");
		sb.append("\nGênero: " + this.genero);
		sb.append("\n------------------------\n");
		
		return sb.toString();
	}

}
