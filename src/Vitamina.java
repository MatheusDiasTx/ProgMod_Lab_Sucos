public class Vitamina extends Bebida {

	private static final double ACRESCIMO = 2.5;
	private static final int MAX_FRUTAS = 3;

	public Vitamina(EFruta fruta) {
		super("Vitamina");
		frutas.add(fruta);
	}

	@Override
	public int adicionar(EFruta fruta) {
		if (frutas.size() < MAX_FRUTAS) {
			frutas.add(fruta);
		}
		return frutas.size();
	}

	private double ajusteTamanho() {
		if (frutas.size() == 2) {
			return 1.4;
		}
		if (frutas.size() == 3) {
			return 1.6;
		}
		return 1.0;
	}

	@Override
	public double preco() {
		double soma = 0;
		for (EFruta f : frutas) {
			soma += f.valor();
		}
		double media = soma / frutas.size();
		return (media + ACRESCIMO) * ajusteTamanho();
	}

	@Override
	public String toString() {
		return super.toString();
	}

}