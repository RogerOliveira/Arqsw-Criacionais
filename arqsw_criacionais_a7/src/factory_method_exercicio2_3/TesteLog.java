package factory_method_exercicio2_3;

public class TesteLog {

	public static void main(String args[]) {
		FabricaLog factory = new LogConsole();
		factory.log("console");

		factory = new LogArquivo();
		factory.log("arquivo");
	}

}
