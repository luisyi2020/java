package EJERCICIODEOBJETOS;

public class Ratones extends Animales{
	
	public Ratones() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ratones(String nombres, double peso, double altura) {
		super(nombres, peso, altura);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "El raton se llama " + super.toString() + " y roen fuermente";
	}
	
	

}
