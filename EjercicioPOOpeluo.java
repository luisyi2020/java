package com.luis.maven.ejercios.poo;

import java.time.LocalDate;

public class EjercicioPOOpeluo {
	private String dni;
	private String nombre;
	private Character sexo; // `H`hombre, `M` Mujer. Pongo la variable Character porque me da mas opciones en caso de necesitarlas
	private double salario;
	private LocalDate fecha_nacimiento; //Local date es una clase que sirve para fechas.
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public EjercicioPOOpeluo(String dni, String nombre, Character sexo, double salario, LocalDate fecha_nacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.sexo = sexo;
		this.salario = salario;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public EjercicioPOOpeluo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EjercicioPOOpeluo [dni=" + dni + ", nombre=" + nombre + ", sexo=" + sexo + ", salario=" + salario
				+ ", fecha_nacimiento=" + fecha_nacimiento + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		EjercicioPOOpeluo other = (EjercicioPOOpeluo) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	
}
