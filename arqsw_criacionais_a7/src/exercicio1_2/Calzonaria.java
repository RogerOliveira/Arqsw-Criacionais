package exercicio1_2;

public class Calzonaria implements AbstractPizzaria {
	
	@Override
	public Pizza getFactory(DiaSemana dia) {
		switch(dia) {
		case SEGUNDA: case QUARTA: case SEXTA: return new CalzoneMarguerita();
		case TERCA: case QUINTA: case SABADO: return new CalzoneBrocolis();
		default:
			System.out.println("Pizzaria Fechada");
			return null;
		}
}
}
