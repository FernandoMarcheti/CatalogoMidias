import static org.junit.Assert.*;

import org.junit.Test;

public class TestCD {

	@Test
	public void testAdicionaFaixa() {
		CD cd = new CD("Master of Puppets", 1986, "Metallica");
		cd.adicionaFaixa("Battery", 5.12);
		assertEquals("T�tulo: Master of Puppets"
				+ "\nAno: 1986"
				+ "\nTipo: CD de m�sica"
				+ "\nArtista: Metallica"
				+ "\nFaixa 1: Battery, dura��o: 5:12"
				+ "\n------------------------\n", cd.imprimeFicha());
	}
	
	@Test
	public void testAdicionaMaisFaixas() {
		CD cd = new CD("Master of Puppets", 1986, "Metallica");
		cd.adicionaFaixa("Battery", 5.12);
		cd.adicionaFaixa("Master of Puppets", 8.36);
		cd.adicionaFaixa("The Thing That Should Not Be", 6.39);
		assertEquals("T�tulo: Master of Puppets"
				+ "\nAno: 1986"
				+ "\nTipo: CD de m�sica"
				+ "\nArtista: Metallica"
				+ "\nFaixa 1: Battery, dura��o: 5:12"
				+ "\nFaixa 2: Master of Puppets, dura��o: 8:36"
				+ "\nFaixa 3: The Thing That Should Not Be, dura��o: 6:39"
				+ "\n------------------------\n", cd.imprimeFicha());
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testAdicionaFaixaException() {
		CD cd = new CD("Master of Puppets", 1986, "Metallica");
		for(int i = 0; i < 15; i++){
			try{
				cd.adicionaFaixa(String.valueOf(i), 1.11);
			} catch (Exception e) {
				fail();
			}
		}
		cd.adicionaFaixa("exce��o", 0.0);
	}
	
	@Test
	public void testTipo(){
		CD cd = new CD("Master of Puppets", 1986, "Metallica");
		assertEquals(1, cd.getTipo()); 
	}
	
}
