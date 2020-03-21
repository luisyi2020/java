package com.luis.maven.ejercios.poo;

public class Contador {
	 int cont;

	public Contador(int cont) {
		if (cont>=0) {
			this.cont = cont;
		}else {
			this.cont = 0;
		}

		
	}

	public Contador() {
		super();

	}

	public Contador(Contador cont) {
		super();
		this.cont = cont.cont;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	
	public void incrementar () {
		this.cont++;
	}
	 
	public void decrementar () {
		if (this.cont >0) {
			this.cont--;
		}else {
			this.cont = 0;
		}
		
	}
}
