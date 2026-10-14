import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VitaminaTest {

	@Test
	public void precoVitaminaPequena() {
		Vitamina vitamina = new Vitamina(EFruta.MANGA);
		assertEquals(7.5, vitamina.preco(), 0.01);
	}

	@Test
	public void precoVitaminaMedia() {
		Vitamina vitamina = new Vitamina(EFruta.MANGA);
		vitamina.adicionar(EFruta.MORANGO);
		assertEquals(11.2, vitamina.preco(), 0.01);
	}

	@Test
	public void precoVitaminaGrande() {
		Vitamina vitamina = new Vitamina(EFruta.MANGA);
		vitamina.adicionar(EFruta.MORANGO);
		vitamina.adicionar(EFruta.GRAVIOLA);
		assertEquals(13.6, vitamina.preco(), 0.01);
	}

	@Test
	public void naoAceitaMaisQueTresFrutas() {
		Vitamina vitamina = new Vitamina(EFruta.MANGA);
		vitamina.adicionar(EFruta.MORANGO);
		vitamina.adicionar(EFruta.GRAVIOLA);
		assertEquals(3, vitamina.adicionar(EFruta.CUPUACU));
	}

}

