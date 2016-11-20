
public abstract class Midia {

	protected String titulo;
	protected int anoCriacao;

	public Midia(String titulo, int anoCriacao) {
		this.titulo = titulo;
		this.anoCriacao = anoCriacao;
	}
	
	public abstract int getTipo();
	
	public String imprimeFicha() {
		return "M�dia";
	}
	
	public String getTitulo() {
		return titulo;
	}
}
