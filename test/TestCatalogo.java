import static org.junit.Assert.*;

import org.junit.Test;

public class TestCatalogo {

	@Test
	public void testAdicionaMidia() {
		Catalogo catalogo = new Catalogo(300);
		CD cd = new CD("Master of Puppets", 1986, "Metallica");
		cd.adicionaFaixa("Battery", 5.12);
		cd.adicionaFaixa("Master of Puppets", 8.36);
		cd.adicionaFaixa("The Thing That Should Not Be", 6.39);
		assertTrue(catalogo.adicionaMidia(cd));
		assertEquals(cd, catalogo.obtemMidia("Master of Puppets"));
	}
	
	@Test
	public void testAdicionaMidias() {
		Catalogo catalogo = new Catalogo(300);
		CD cd = new CD("Master of Puppets", 1986, "Metallica");
		cd.adicionaFaixa("Battery", 5.12);
		cd.adicionaFaixa("Master of Puppets", 8.36);
		cd.adicionaFaixa("The Thing That Should Not Be", 6.39);
		
		DVD dvd = new DVD("Bastardos Ingl�rios", 2009, "Quentin Tarantino");
		dvd.adicionaArtista("Brad Pitt", "Tenente Aldo Raine");
		dvd.adicionaArtista("Quentin Tarantino", "Primeiro nazista escalpelado");
		dvd.adicionaArtista("Christoph Waltz", "Hans Landa");
		
		Jogo jogo = new Jogo("Grand Theft Auto V", 2013, "A��o/Aventura");
		
		assertTrue(catalogo.adicionaMidia(cd));
		assertTrue(catalogo.adicionaMidia(dvd));
		assertTrue(catalogo.adicionaMidia(jogo));
		
		assertEquals(cd, catalogo.obtemMidia("Master of Puppets"));
		assertEquals(dvd, catalogo.obtemMidia("Bastardos Ingl�rios"));
		assertEquals(jogo, catalogo.obtemMidia("Grand Theft Auto V"));
	}
	
	@Test
	public void testAdicionaCatalogoCheio() {
		Catalogo catalogo = new Catalogo(300);
		for (int i = 0; i < 300; i++) {
			catalogo.adicionaMidia(new CD("", i, ""));
		}
		assertFalse(catalogo.adicionaMidia(new CD("exce��o", 9999, "")));
	}
	
	@Test
	public void testQuantidadeMaximaMidias(){
		Catalogo catalogo = new Catalogo(300);
		assertEquals(300, catalogo.quantidadeMaximaDeMidias());
	}
	
	@Test
	public void testQuantidadeCDs(){
		Catalogo catalogo = new Catalogo(300);
		CD cd1 = new CD("CD1", 1111, "");
		Jogo jogo1 = new Jogo("Jogo", 1111, "");
		CD cd2 = new CD("CD2", 1111, "");
		Jogo jogo2 = new Jogo("Jogo", 1111, "");
		CD cd3 = new CD("CD3", 1111, "");
		Jogo jogo3 = new Jogo("Jogo", 1111, "");
		CD cd4 = new CD("CD4", 1111, "");
		catalogo.adicionaMidia(cd1);
		catalogo.adicionaMidia(jogo1);
		catalogo.adicionaMidia(cd2);
		catalogo.adicionaMidia(jogo2);
		catalogo.adicionaMidia(cd2);
		catalogo.adicionaMidia(jogo3);
		catalogo.adicionaMidia(cd4);
		assertEquals(4, catalogo.quantidadeCDs());
	}
	
	@Test
	public void testQuantidadeDVDs(){
		Catalogo catalogo = new Catalogo(300);
		DVD dvd1 = new DVD("CD1", 1111, "");
		Jogo jogo1 = new Jogo("Jogo", 1111, "");
		DVD dvd2 = new DVD("CD1", 1111, "");
		Jogo jogo2 = new Jogo("Jogo", 1111, "");
		DVD dvd3 = new DVD("CD1", 1111, "");
		Jogo jogo3 = new Jogo("Jogo", 1111, "");
		DVD dvd4 = new DVD("CD1", 1111, "");
		catalogo.adicionaMidia(dvd1);
		catalogo.adicionaMidia(jogo1);
		catalogo.adicionaMidia(dvd2);
		catalogo.adicionaMidia(jogo2);
		catalogo.adicionaMidia(dvd3);
		catalogo.adicionaMidia(jogo3);
		catalogo.adicionaMidia(dvd4);
		assertEquals(4, catalogo.quantidadeDVDs());
	}
	
	@Test
	public void testQuantidadeJogos(){
		Catalogo catalogo = new Catalogo(300);
		DVD dvd1 = new DVD("CD1", 1111, "");
		Jogo jogo1 = new Jogo("Jogo", 1111, "");
		DVD dvd2 = new DVD("CD1", 1111, "");
		Jogo jogo2 = new Jogo("Jogo", 1111, "");
		DVD dvd3 = new DVD("CD1", 1111, "");
		Jogo jogo3 = new Jogo("Jogo", 1111, "");
		DVD dvd4 = new DVD("CD1", 1111, "");
		catalogo.adicionaMidia(dvd1);
		catalogo.adicionaMidia(jogo1);
		catalogo.adicionaMidia(dvd2);
		catalogo.adicionaMidia(jogo2);
		catalogo.adicionaMidia(dvd3);
		catalogo.adicionaMidia(jogo3);
		catalogo.adicionaMidia(dvd4);
		assertEquals(3, catalogo.quantidadeJogos());
	}
	
	@Test
	public void testColecao(){
		
	}

	@Test
	public void testImprimeColecao(){
		Catalogo catalogo = new Catalogo(300);
		CD cd = new CD("Master of Puppets", 1986, "Metallica");
		cd.adicionaFaixa("Battery", 5.12);
		cd.adicionaFaixa("Master of Puppets", 8.36);
		cd.adicionaFaixa("The Thing That Should Not Be", 6.39);
		
		DVD dvd = new DVD("Bastardos Ingl�rios", 2009, "Quentin Tarantino");
		dvd.adicionaArtista("Brad Pitt", "Tenente Aldo Raine");
		dvd.adicionaArtista("Quentin Tarantino", "Primeiro nazista escalpelado");
		dvd.adicionaArtista("Christoph Waltz", "Hans Landa");
		
		Jogo jogo = new Jogo("Grand Theft Auto V", 2013, "A��o/Aventura");
		catalogo.adicionaMidia(cd);
		catalogo.adicionaMidia(dvd);
		catalogo.adicionaMidia(jogo);
		assertEquals("T�tulo: Master of Puppets"
				+ "\nAno: 1986"
				+ "\nTipo: CD de m�sica"
				+ "\nArtista: Metallica"
				+ "\nFaixa 1: Battery, dura��o: 5:12"
				+ "\nFaixa 2: Master of Puppets, dura��o: 8:36"
				+ "\nFaixa 3: The Thing That Should Not Be, dura��o: 6:39"
				+ "\n------------------------\n"
				+ "T�tulo: Bastardos Ingl�rios"
				+ "\nAno: 2009"
				+ "\nTipo: Filme em DVD"
				+ "\nDiretor: Quentin Tarantino"
				+ "\nArtista 1: Brad Pitt, papel: Tenente Aldo Raine"
				+ "\nArtista 2: Quentin Tarantino, papel: Primeiro nazista escalpelado"
				+ "\nArtista 3: Christoph Waltz, papel: Hans Landa"
				+ "\n------------------------\n"
				+ "T�tulo: Grand Theft Auto V"
				+ "\nAno: 2013"
				+ "\nTipo: Jogo Eletr�nico"
				+ "\nG�nero: A��o/Aventura"
				+ "\n------------------------\n", catalogo.imprimeColecao());
	}
	
	@Test
	public void testColecaoPorTipo(){
		
	}
	
	@Test
	public void testImprimeColecaoPorTipo(){
		Catalogo catalogo = new Catalogo(300);
		CD cd = new CD("Master of Puppets", 1986, "Metallica");
		cd.adicionaFaixa("Battery", 5.12);
		cd.adicionaFaixa("Master of Puppets", 8.36);
		cd.adicionaFaixa("The Thing That Should Not Be", 6.39);
		
		DVD dvd = new DVD("Bastardos Ingl�rios", 2009, "Quentin Tarantino");
		dvd.adicionaArtista("Brad Pitt", "Tenente Aldo Raine");
		dvd.adicionaArtista("Quentin Tarantino", "Primeiro nazista escalpelado");
		dvd.adicionaArtista("Christoph Waltz", "Hans Landa");
		
		Jogo jogo = new Jogo("Grand Theft Auto V", 2013, "A��o/Aventura");
		
		catalogo.adicionaMidia(cd);
		catalogo.adicionaMidia(dvd);
		catalogo.adicionaMidia(jogo);
		
		assertEquals("T�tulo: Master of Puppets"
				+ "\nAno: 1986"
				+ "\nTipo: CD de m�sica"
				+ "\nArtista: Metallica"
				+ "\nFaixa 1: Battery, dura��o: 5:12"
				+ "\nFaixa 2: Master of Puppets, dura��o: 8:36"
				+ "\nFaixa 3: The Thing That Should Not Be, dura��o: 6:39"
				+ "\n------------------------\n", catalogo.imprimeColecaoPorTipo(CD.TIPO_CD));
		
		assertEquals("T�tulo: Bastardos Ingl�rios"
				+ "\nAno: 2009"
				+ "\nTipo: Filme em DVD"
				+ "\nDiretor: Quentin Tarantino"
				+ "\nArtista 1: Brad Pitt, papel: Tenente Aldo Raine"
				+ "\nArtista 2: Quentin Tarantino, papel: Primeiro nazista escalpelado"
				+ "\nArtista 3: Christoph Waltz, papel: Hans Landa"
				+ "\n------------------------\n", catalogo.imprimeColecaoPorTipo(DVD.TIPO_DVD));
		
		assertEquals("T�tulo: Grand Theft Auto V"
				+ "\nAno: 2013"
				+ "\nTipo: Jogo Eletr�nico"
				+ "\nG�nero: A��o/Aventura"
				+ "\n------------------------\n", catalogo.imprimeColecaoPorTipo(Jogo.TIPO_JOGO));
	}
}
