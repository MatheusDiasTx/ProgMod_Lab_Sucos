import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PedidoTest {

	@Test
	public void precoEhSomaDasBebidas() {
		Pedido pedido = new Pedido();
		Suco suco = new Suco(EFruta.LARANJA);
		suco.adicionar(EFruta.MORANGO);
		Vitamina vitamina = new Vitamina(EFruta.MANGA);
		vitamina.adicionar(EFruta.MORANGO);
		pedido.adicionar(suco);
		pedido.adicionar(vitamina);
		assertEquals(16.2, pedido.preco(), 0.01);
	}

	@Test
	public void adicionarRetornaQuantidadeDeItens() {
		Pedido pedido = new Pedido();
		pedido.adicionar(new Suco(EFruta.LARANJA));
		assertEquals(2, pedido.adicionar(new Vitamina(EFruta.MANGA)));
	}

}

