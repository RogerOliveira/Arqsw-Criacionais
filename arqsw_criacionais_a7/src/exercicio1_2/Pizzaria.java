package exercicio1_2;

public class Pizzaria implements AbstractPizzaria {
	
	@Override
	public Pizza getFactory(DiaSemana dia) {
		switch(dia) {
		case SEGUNDA: case QUARTA: case SEXTA: return new PizzaMarguerita();
		case TERCA: case QUINTA: case SABADO: return new PizzaBrocolis();
		default:
			System.out.println("Pizzaria Fechada");
			return null;
		}
}

}
