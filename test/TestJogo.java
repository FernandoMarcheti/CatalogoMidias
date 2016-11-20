import static org.junit.Assert.*;

import org.junit.Test;

public class TestJogo {

	@Test
	public void test() {
		Jogo jogo = new Jogo("Grand Theft Auto V", 2013, "Ação/Aventura");
		assertEquals("Título: Grand Theft Auto V"
				+ "\nAno: 2013"
				+ "\nTipo: Jogo Eletrônico"
				+ "\nGênero: Ação/Aventura"
				+ "\n------------------------\n", jogo.imprimeFicha());
	}
	
	@Test
	public void testTipo(){
		Jogo jogo = new Jogo("Grand Theft Auto V", 2013, "Ação/Aventura");
		assertEquals(3, jogo.getTipo()); 
	}

}
