package factory_method_exercicio2_2;

public class TesteProvedorInfo {

public static void main(String[] args) {
		
		FabricaProvedorInfo factory = new ProvedorInfoPublica();
		String info = factory.provedorInfo("");
		System.out.println(info);
		
		info = factory.provedorInfo("Teste");
		System.out.println(info);
		
		info = factory.provedorInfo(null);
		System.out.println(info);
		
		factory = new ProvedorInfoConfidencial();
		info = factory.provedorInfo("");
		System.out.println(info);
		
		info = factory.provedorInfo("desi gnpatt er ns");
		System.out.println(info);
		
	}
	
}
