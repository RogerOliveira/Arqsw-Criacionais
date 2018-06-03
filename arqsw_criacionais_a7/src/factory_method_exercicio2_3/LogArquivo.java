package factory_method_exercicio2_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogArquivo implements FabricaLog {
	
	BufferedWriter writer = null;
	String[] numeros = new String[10];

	@Override
	public String log(String escolhido) {
		File file = new File("C:\\Users\\roger\\git\\Arqsw-Criacionais\\arqsw_criacionais_a7\\src\\factory_method_exercicio2_3\\log.txt");
		if(escolhido.equals("arquivo")) {
			try {
				writer = new BufferedWriter(new FileWriter(file));
				for (int i = 1; i <= 10; i++) {
					writer.write(i+"");
					numeros[i-1] = i+"";
				}
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return numeros.toString();
	}

}
