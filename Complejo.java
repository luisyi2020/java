package com.luis.maven.ejercios.poo;

public class Complejo {
	private double real;
	private double imaginaria;

	public Complejo(double real, double imaginaria) {
		super();
		this.real = real;
		this.imaginaria = imaginaria;
	}

	public Complejo() {
		this.real = 0;
		this.imaginaria = 0;

	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginaria() {
		return imaginaria;
	}

	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}

	public Complejo sumar(Complejo c) {
		Complejo resultado = new Complejo();
		resultado.setReal(this.real + c.real);
		resultado.setImaginaria(this.imaginaria + c.imaginaria);
		return resultado;

	}

	public Complejo restar(Complejo c) {
		Complejo resultado = new Complejo();
		resultado.setReal(this.real - c.real);
		resultado.setImaginaria(this.imaginaria - c.imaginaria);
		return resultado;

	}

	public Complejo multiplicar(Complejo c) {
		Complejo resultado = new Complejo();
		resultado.setReal((this.real * c.real) - (this.imaginaria * c.imaginaria));
		resultado.setImaginaria((this.real * c.imaginaria) + (this.imaginaria * c.real));
		return resultado;

	}

	public Complejo multiplicar(double c) {
		Complejo resultado = new Complejo();
		resultado.setReal(this.real * c);
		resultado.setImaginaria(this.imaginaria * c);
		return resultado;

	}

	public Complejo dividir(Complejo c) {
		Complejo resultado = new Complejo();
		resultado.setReal(((this.real * c.real) + (this.imaginaria * c.imaginaria))
				/ ((c.real * c.real + c.imaginaria * c.imaginaria)));
		resultado.setImaginaria(((this.imaginaria * c.real) - (this.real * c.imaginaria))
				/ ((c.real * c.real + c.imaginaria * c.imaginaria)));
		return resultado;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(imaginaria);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(real);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(imaginaria) != Double.doubleToLongBits(other.imaginaria))
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "(" + real + ", " + imaginaria + ")";
	}
	
	

}
