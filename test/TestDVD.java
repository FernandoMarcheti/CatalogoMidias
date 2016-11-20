import static org.junit.Assert.*;

import org.junit.Test;

public class TestDVD {

	@Test
	public void testAdicionaArtista() {
		DVD dvd = new DVD("Bastardos Inglórios", 2009, "Quentin Tarantino");
		dvd.adicionaArtista("Brad Pitt", "Tenente Aldo Raine");
		assertEquals("Título: Bastardos Inglórios"
				+ "\nAno: 2009"
				+ "\nTipo: Filme em DVD"
				+ "\nDiretor: Quentin Tarantino"
				+ "\nArtista 1: Brad Pitt, papel: Tenente Aldo Raine"
				+ "\n------------------------\n", dvd.imprimeFicha());
	}

	@Test
	public void testAdicionaMaisArtistas() {
		DVD dvd = new DVD("Bastardos Inglórios", 2009, "Quentin Tarantino");
		dvd.adicionaArtista("Brad Pitt", "Tenente Aldo Raine");
		dvd.adicionaArtista("Quentin Tarantino", "Primeiro nazista escalpelado");
		dvd.adicionaArtista("Christoph Waltz", "Hans Landa");
		assertEquals("Título: Bastardos Inglórios"
				+ "\nAno: 2009"
				+ "\nTipo: Filme em DVD"
				+ "\nDiretor: Quentin Tarantino"
				+ "\nArtista 1: Brad Pitt, papel: Tenente Aldo Raine"
				+ "\nArtista 2: Quentin Tarantino, papel: Primeiro nazista escalpelado"
				+ "\nArtista 3: Christoph Waltz, papel: Hans Landa"
				+ "\n------------------------\n", dvd.imprimeFicha());
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testAdicionaFaixaException() {
		DVD dvd = new DVD("Bastardos Inglórios", 2009, "Quentin Tarantino");
		for(int i = 0; i < 5; i++){
			try{
				dvd.adicionaArtista(String.valueOf(i), "");
			} catch (Exception e) {
				fail();
			}
		}
		dvd.adicionaArtista("exceção", "");
	}
	
	@Test
	public void testTipo(){
		DVD dvd = new DVD("Bastardos Inglórios", 2009, "Quentin Tarantino");
		assertEquals(2, dvd.getTipo()); 
	}
}
