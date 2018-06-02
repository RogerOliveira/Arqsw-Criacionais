package factory_method_exercicio2_1;

public class TesteNome {

	public static void main(String[] args) {

		FabricaNome factory = new FabricaNomeEspaco();
		Nome nome = factory.fazNome("Roger Oliveira");
		System.out.println(nome);

		factory = new FabricaNomeVirgula();
		nome = factory.fazNome("Oliveira, Roger");
		System.out.println(nome);
	}

}
