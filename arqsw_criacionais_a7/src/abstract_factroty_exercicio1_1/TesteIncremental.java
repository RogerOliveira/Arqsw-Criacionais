package abstract_factroty_exercicio1_1;

public class TesteIncremental {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Incremental inc = new Incremental();
			System.out.println(inc);
		}
		for (int i = 0; i < 10; i++) {
			new IncrementalSingleton();
			IncrementalSingleton inc = IncrementalSingleton.getInstance();
			System.out.println(inc);
		}
	}
}
