
public class DVD extends Midia{

	public static final int TIPO_DVD = 2;
	private String diretor;
	private String[] artistas = new String[5];
	private int qtdeArtistas;

	public DVD(String titulo, int anoCriacao, String diretor) {
		super(titulo, anoCriacao);
		this.diretor = diretor;
	}

	public void adicionaArtista(String artista, String papel) {
		this.artistas[this.qtdeArtistas] = artista + ", papel: " + papel;
		this.qtdeArtistas++;
	}

	@Override
	public int getTipo() {
		return TIPO_DVD;
	}
	
	@Override
	public String imprimeFicha() {
		StringBuilder sb = new StringBuilder();
		sb.append("Título: " + this.titulo);
		sb.append("\nAno: " + this.anoCriacao);
		sb.append("\nTipo: Filme em DVD");
		sb.append("\nDiretor: " + this.diretor);
		for(int i = 0; i < this.qtdeArtistas; i++){
			sb.append("\nArtista " + (i + 1)); 
			sb.append(": " + this.artistas[i]);
		}
		sb.append("\n------------------------\n");
		
		return sb.toString();
	}

}
