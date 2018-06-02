package abstract_factroty_exercicio1_1;

public class Incremental {

	private static int count = 0;
	private int numero;

	public Incremental() {
		numero = ++count;
	}

	public String toString() {
		return "Incremental " + numero;
	}

}
