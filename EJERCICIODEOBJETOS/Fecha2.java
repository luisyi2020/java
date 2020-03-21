package EJERCICIODEOBJETOS;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Fecha2 {
	int dia;
	int mes;
	int ano;
	public Fecha2(int dia, int mes,  int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public Fecha2() {
		super();

	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAño() {
		return ano;
	}
	public void setAño(int año) {
		this.ano = año;
	}
	
	public boolean fechaCorrecta () {
		//para comprobar que el formato de una fecja esta de la manera correcta, esto tambien te dice si es bisiesto o no 
		try {
			LocalDate Id = LocalDate.of(ano, mes, dia);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	private boolean esBisiesto() {

		GregorianCalendar nombre = new GregorianCalendar();
		return nombre.isLeapYear(ano);

	}
	@Override
	public String toString() {
		return (dia<10?"0"+dia:""+ dia) + "-" + (mes<10?"0"+mes :mes ) + "-" + ano;
		
	}
	
	 public void diaSiguiente () {
		 LocalDate Id = LocalDate.of(ano, mes, dia);
		 LocalDate diasiguiente = Id.plusDays(1);
		 ano = diasiguiente.getYear();
		 mes = diasiguiente.getMonthValue();
		 dia = diasiguiente.getDayOfMonth();
		 System.out.println(dia + "/" + mes + "/" + ano);
	 }
}
