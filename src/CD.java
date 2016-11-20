
public class CD extends Midia {

	public static final int TIPO_CD = 1;
	private String artista;
	private String[] faixas = new String[15];
	private int qtdeFaixas = 0;

	public CD(String titulo, int anoCriacao, String artista) {
		super(titulo, anoCriacao);
		this.artista = artista;
	}

	public void adicionaFaixa(String faixa, double duracao) {
		this.faixas[qtdeFaixas] = faixa + ", dura��o: " + String.valueOf(duracao).replace(".", ":");
		this.qtdeFaixas++;
	}
	
	@Override
	public int getTipo() {
		return TIPO_CD;
	}

	@Override
	public String imprimeFicha() {
		StringBuilder sb = new StringBuilder();
		sb.append("T�tulo: " + this.titulo);
		sb.append("\nAno: " + this.anoCriacao);
		sb.append("\nTipo: CD de m�sica");
		sb.append("\nArtista: " + this.artista);
		for(int i = 0; i < this.qtdeFaixas; i++){
			sb.append("\nFaixa " + (i + 1)); 
			sb.append(": " + this.faixas[i]);
		}
		sb.append("\n------------------------\n");
		
		return sb.toString();
	}

}
