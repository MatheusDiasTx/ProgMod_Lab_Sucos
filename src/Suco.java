public class Suco extends Bebida {

	private static final int MAX_FRUTAS = 2;

	public Suco(EFruta fruta) {
		super("Suco");
		frutas.add(fruta);
	}

	@Override
	public int adicionar(EFruta fruta) {
		if (frutas.size() < MAX_FRUTAS && (fruta == EFruta.LARANJA || frutas.contains(EFruta.LARANJA))) {
			frutas.add(fruta);
		}
		return frutas.size();
	}

	@Override
	public double preco() {
		double soma = 0;
		for (EFruta f : frutas) {
			soma += f.valor();
		}
		return soma / frutas.size();
	}

	@Override
	public String toString() {
		return super.toString();
	}

}