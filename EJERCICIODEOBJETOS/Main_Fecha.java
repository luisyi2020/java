package EJERCICIODEOBJETOS;

import java.util.ArrayList;
import java.util.List;

public class Main_Fecha {

	public static void main(String[] args) {
		int dia = 2;
		int mes = 3;
		int ano = 2020;

		List<Fecha2> fechas = new ArrayList<>();
		fechas.add(new Fecha2(2, 3, 2001));
		fechas.add(new Fecha2(2, 2, 1996));
		fechas.add(new Fecha2(2, 1, 2020));

		for (Fecha2 fecha2 : fechas) {
			System.out.println(fecha2.fechaCorrecta() ? fecha2 : "Valor incorrecto");
		}
	}

}
