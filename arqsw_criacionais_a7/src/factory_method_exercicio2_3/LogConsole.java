package factory_method_exercicio2_3;

public class LogConsole implements FabricaLog {

	@Override
	public String log(String escolhido) {
		String[] numeros = new String[10];
		if(escolhido.equals("console")) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				numeros[i-1] = i+"";
			}
		}
		return numeros.toString();
	}

}
