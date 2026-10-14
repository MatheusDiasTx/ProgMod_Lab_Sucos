import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SucoTest {

	@Test
	public void precoEhMediaDasFrutas() {
		Suco suco = new Suco(EFruta.LARANJA);
		suco.adicionar(EFruta.MORANGO);
		assertEquals(5.0, suco.preco(), 0.01);
	}

	@Test
	public void naoAceitaDuasFrutasSemLaranja() {
		Suco suco = new Suco(EFruta.MANGA);
		assertEquals(1, suco.adicionar(EFruta.MORANGO));
	}

	@Test
	public void naoAceitaMaisQueDuasFrutas() {
		Suco suco = new Suco(EFruta.LARANJA);
		suco.adicionar(EFruta.MANGA);
		assertEquals(2, suco.adicionar(EFruta.LARANJA));
	}

}