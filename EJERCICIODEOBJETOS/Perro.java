package EJERCICIODEOBJETOS;

public class Perro  extends Animales{
	

	public Perro() {
		super();
		
	}

	public Perro(String nombres, double peso, double altura) {
		super(nombres, peso, altura);
		
	}



	@Override
	public String toString() {
		return "El perro se llama : "+super.toString()+"  y ladra fuertemente";
	}

	
	
	
	
}
