package EJERCICIODEOBJETOS;

public class Animales {
	String nombres;
	double peso;
	double altura;
	public Animales() {
		super();
	
	}
	public Animales(String nombres, double peso, double altura) {
		super();
		this.nombres = nombres;
		this.peso = peso;
		this.altura = altura;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return nombres + " , pesa:" + peso + " , mide:" + altura;
	}
	
	
	

}
