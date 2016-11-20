
public class Catalogo implements ColecaoMidia {

	private Midia[] midia = null;
	private int qtdeMidias = 0;
	private int quantidadeCDs = 0;
	private int quantidadeDVDs = 0;
	private int quantidadeJogos = 0;
	
	public Catalogo(int tamanhoMaximo) {
		midia = new Midia[300];
	}

	public boolean adicionaMidia(Midia midia) {
		if(this.qtdeMidias == this.midia.length)
			return false;
		this.midia[this.qtdeMidias++] = midia;
		incrementaTipoMidia(midia);
		return true;
	}

	private void incrementaTipoMidia(Midia midia) {
		if(midia.getTipo() == CD.TIPO_CD)
			this.quantidadeCDs++;
		if(midia.getTipo() == DVD.TIPO_DVD)
			this.quantidadeDVDs++;
		if(midia.getTipo() == Jogo.TIPO_JOGO)
			this.quantidadeJogos++;
	}

	public Midia obtemMidia(String titulo) {
		for (int i = 0; i < qtdeMidias; i++) {
			if(titulo.equals(this.midia[i].getTitulo()))
				return this.midia[i];
		}
		return null;
	}

	public int quantidadeMaximaDeMidias() {
		return this.midia.length;
	}

	public int quantidadeCDs() {
		return this.quantidadeCDs;
	}

	public int quantidadeDVDs() {
		return this.quantidadeDVDs;
	}

	public int quantidadeJogos() {
		return this.quantidadeJogos;
	}

	@Override
	public Midia[] colecao() {
		Midia[] colecaoCopia = new Midia[this.qtdeMidias];
		for (int i = 0; i < this.qtdeMidias; i++) {
			colecaoCopia[i] = this.midia[i];
		}
		return colecaoCopia;
	}

	public String imprimeColecao() {
		String colecao = "";
		for (int i = 0; i < this.qtdeMidias; i++) {
			colecao += this.midia[i].imprimeFicha();
		}
		return colecao;
	}

	@Override
	public Midia[] colecaoPorTipo(int tipo) {
		if(tipo == CD.TIPO_CD)
			return this.geraColecao(CD.TIPO_CD, this.quantidadeCDs);
		else if (tipo == DVD.TIPO_DVD)
			return this.geraColecao(DVD.TIPO_DVD, this.quantidadeDVDs);
		else if (tipo == Jogo.TIPO_JOGO)
			return this.geraColecao(Jogo.TIPO_JOGO, this.quantidadeJogos);
		return null;
	}
	
	private Midia[] geraColecao(int tipo, int tamanho){
		Midia[] colecaoAux = new Midia[tamanho];
		for (int i = 0; i < tamanho; i++) {
			if(this.midia[i].getTipo() == tipo)
				colecaoAux[i] = this.midia[i];
		}
		return colecaoAux;
	} 

	public String imprimeColecaoPorTipo(int tipo) {
		String colecao = "";
		for (int i = 0; i < this.qtdeMidias; i++) {
			if(this.midia[i].getTipo() == tipo)
				colecao += this.midia[i].imprimeFicha();
		}
		return colecao;
	}
}
