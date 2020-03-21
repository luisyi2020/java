package EJERCICIODEOBJETOS;

public class Empleado {
	private String nif;
	private String nombre;
	private double sueldo;
	private static int horas_extras;
	private double IRPF;
	private boolean casado;
	private int hijos;
	private static int importe_hora;
	public Empleado(String nif) {
		super();
		this.nif = nif;
	
	}
	public Empleado() {
		super();
	
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public int getHoras_extras() {
		return horas_extras;
	}
	public void setHoras_extras(int horas_extras) {
		Empleado.horas_extras = horas_extras;
	}
	public double getIRPF() {
		return IRPF;
	}
	public void setIRPF(int iRPF) {
		IRPF = iRPF;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public int getHijos() {
		return hijos;
	}
	public void setHijos(int hijos) {
		this.hijos = hijos;
	}
	public int getImporte_hora() {
		return importe_hora;
	}
	public void setImporte_hora(int importe_hora) {
		Empleado.importe_hora = importe_hora;
	}
	@Override
	public String toString() {
		return "Empleado [nif=" + nif + " " + nombre + "\nsueldo=" + sueldo + "\nhoras_extras=" + horas_extras
				+ "\nIRPF=" + IRPF + "\ncasado=" + ((this.casado== true)? "s" : "n")+ "\nhijos=" + hijos + "\nimporte_hora=" + importe_hora + "]";
	}

	public  int extras () {
		importe_hora = 10;
		return importe_hora*horas_extras;
	}
	public  double sueldobruto() {
		return sueldo+extras();
		
	}
	public  void RetencionesIRPF() {
		int cont=20;
		cont-=((casado== true  )? 2 : 0 ) - this.hijos;
		this.IRPF=(cont*this.sueldo) /100;
	}
	
	
}
