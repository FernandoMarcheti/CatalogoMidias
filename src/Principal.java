
public class Principal {

	public static void main(String[] args) {

		Catalogo catalogo = new Catalogo(20);
		catalogo.adicionaMidia(new CD("cd1", 1111, "a1"));
		catalogo.adicionaMidia(new CD("cd2", 1111, "a2"));
		catalogo.adicionaMidia(new CD("cd3", 1111, "a3"));
		catalogo.adicionaMidia(new CD("cd4", 1111, "a4"));
		catalogo.adicionaMidia(new CD("cd5", 1111, "a5"));
		catalogo.adicionaMidia(new CD("cd6", 1111, "a6"));
		
		catalogo.adicionaMidia(new DVD("dvd1", 1111, "d1"));
		catalogo.adicionaMidia(new DVD("dvd2", 1111, "d2"));
		catalogo.adicionaMidia(new DVD("dvd3", 1111, "d3"));
		catalogo.adicionaMidia(new DVD("dvd4", 1111, "d4"));
		
//		System.out.println(catalogo.imprimeColecao());
		Midia obtemMidia = catalogo.obtemMidia("cd1");
//		System.out.println(obtemMidia.imprimeFicha());
		
//		System.out.println(catalogo.imprimeColecaoPorTipo(DVD.TIPO_DVD));
		System.out.println(catalogo.colecaoPorTipo(CD.TIPO_CD).length);
	}

}
