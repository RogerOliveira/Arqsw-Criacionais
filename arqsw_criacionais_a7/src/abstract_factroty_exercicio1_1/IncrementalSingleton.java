package abstract_factroty_exercicio1_1;

public class IncrementalSingleton {
	private static IncrementalSingleton instance = new IncrementalSingleton();
	private static int count = 0;
	private int numero;

	IncrementalSingleton() {
		numero = +count;
	}

	public static IncrementalSingleton getInstance() {
		if (instance == null) {
			instance = new IncrementalSingleton();
		}
		return instance;
	}

	public String toString() {
		return "IncrementalSingleton " + numero;
	}
}
