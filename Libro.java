package com.luis.maven.ejercios.poo;

public class Libro {
	String titulo;
	String autor;
	int ejemplares;
	int prestados;

	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}

	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		if (prestados<=this.ejemplares&&prestados>=0) {
			this.prestados = prestados;
		}else {
			System.out.println("No hay stock suficiente");
		}
		
	} 
	

	public boolean prestamo() {

		if (this.prestados < this.ejemplares) {
			return false;
		} else {
			this.prestados++;
			return true;

		}
	}

	public boolean devolucion() {
		if (this.prestados > 0) {
			this.prestados--;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Libros [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares
				+ ", prestados=" + prestados + "]";
	}

}
