package com.luis.maven.ejercios.poo;

public class Cuenta {

	String nombre_del_cliente;
	String numero_de_cuenta;
	double tipo_de_interes;
	double saldo;

	public Cuenta(String nombre_del_cliente, String numero_de_cuenta, double tipo_de_interes, double saldo) {
		super();
		this.nombre_del_cliente = nombre_del_cliente;
		this.numero_de_cuenta = numero_de_cuenta;
		this.tipo_de_interes = tipo_de_interes;
		this.saldo = saldo;
	}

	public Cuenta() {

	}

	public Cuenta(Cuenta cuenta) {
		this.nombre_del_cliente = cuenta.getNombre_del_cliente();
		this.numero_de_cuenta = cuenta.getNumero_de_cuenta();
		this.tipo_de_interes = cuenta.getTipo_de_interes();
		this.saldo = cuenta.getSaldo();
	}

	public String getNombre_del_cliente() {
		return nombre_del_cliente;
	}

	public void setNombre_del_cliente(String nombre_del_cliente) {
		this.nombre_del_cliente = nombre_del_cliente;
	}

	public String getNumero_de_cuenta() {
		return numero_de_cuenta;
	}

	public void setNumero_de_cuenta(String numero_de_cuenta) {
		this.numero_de_cuenta = numero_de_cuenta;
	}

	public double getTipo_de_interes() {
		return tipo_de_interes;
	}

	public void setTipo_de_interes(double tipo_de_interes) {
		this.tipo_de_interes = tipo_de_interes;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingreso(double valor) {
		if (valor < 0) {
			System.out.println("No puede ser negativo el valor");
		} else {
			this.saldo += valor;

		}
	}

	public void reintegro(double valor) {
		if (valor < 0) {
			System.out.println("Valor negativo");

		} else {
			if (valor > this.saldo) {
				System.out.println("No hay saldo suficiente");
			} else {
				System.out.println("La operacion fue efectuada");
				this.saldo -= valor;
			}
		}
	}

	public void transferencia(Cuenta cuentaDestino, double importe) {
		if (this.saldo < importe) {
			System.out.println("No se puede realizar la transferencia a la cuenta destino por falta de fondos");
		} else {
			reintegro(importe);
			cuentaDestino.ingreso(importe);
		}
	}
}
