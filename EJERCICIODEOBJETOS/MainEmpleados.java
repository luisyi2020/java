package EJERCICIODEOBJETOS;

import java.util.ArrayList;
import java.util.List;

public class MainEmpleados {
	static List<Empleado> empleados; //tipo lista entro <> llama a los elementos de la clase anterior
	public static void setUpEmpleados() {
		double sueldo= 1234;
		int cont=1; 

		empleados= new ArrayList<>();
		empleados.add(new Empleado("12345678A"));
		empleados.add(new Empleado("12345678B"));
		empleados.add(new Empleado("12345678C"));
		empleados.add(new Empleado("12345678D"));
		empleados.add(new Empleado("12345678E"));
		empleados.add(new Empleado("12345678F"));
		for (Empleado empleado : empleados) {
			empleado.setNombre((cont % 2 == 0) ? "Puta" :"Madre");
			empleado.setSueldo(sueldo);
			empleado.setHoras_extras((cont% 2  == 0)? 4:2);
			empleado.setCasado((cont% 2 == 0 ) ? true : false);
			empleado.setHijos((cont % 2== 0)? 2 : 0);
			empleado.RetencionesIRPF();
			
			
		}

		
		

	}
	
	public static void test() {
		
	}

}
