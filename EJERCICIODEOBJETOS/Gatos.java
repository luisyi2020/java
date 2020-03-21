package EJERCICIODEOBJETOS;

public class Gatos extends Animales{
	String maullar;

	public Gatos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gatos(String nombres, double peso, double altura) {
		super(nombres, peso, altura);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "El gato se llama"
				+ " "+super.toString()+" y maullan ";
	}

	
}
