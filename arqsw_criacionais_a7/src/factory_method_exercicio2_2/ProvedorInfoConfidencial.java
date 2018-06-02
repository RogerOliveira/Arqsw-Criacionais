package factory_method_exercicio2_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ProvedorInfoConfidencial implements FabricaProvedorInfo {

	@Override
	public String provedorInfo(String senha) {
		String dados = "";
		if(senha.equals("desi gnpatt er ns")) {
			try {
				File file = new File("C:\\Users\\roger\\git\\Arqsw-Criacionais\\arqsw_criacionais_a7\\src\\factory_method_exercicio2_2\\confidencial.txt");
				dados = new String(Files.readAllBytes(file.toPath()));
			} catch (IOException e) {
				e.printStackTrace();
			}
			return dados;
		}
		return "";
	}

}
