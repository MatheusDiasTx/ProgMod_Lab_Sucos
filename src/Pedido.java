import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private List<Bebida> itens;

	public Pedido() {
		this.itens = new ArrayList<>();
	}

	public int adicionar(Bebida item) {
		itens.add(item);
		return itens.size();
	}

	public double preco() {
		double total = 0;
		for (Bebida b : itens) {
			total += b.preco();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Pedido:\n");
		for (Bebida b : itens) {
			sb.append(b).append("\n");
		}
		sb.append("Total: R$ ").append(String.format("%.2f", preco()));
		return sb.toString();
	}

}