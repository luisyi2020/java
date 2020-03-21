package com.luis.maven.ejercios.poo;

import java.util.ArrayList;
import java.util.List;

public class EjercicioPeluoPOOEmpresa {
		private String cif;
		private String nombre;
		private List<EjercicioPOOpeluo> listaTrabajadores;
		private static int totalTrabajadores;
		public EjercicioPeluoPOOEmpresa() {
			listaTrabajadores = new ArrayList<>();
				}
		public EjercicioPeluoPOOEmpresa(String cif, String nombre, List<EjercicioPOOpeluo> listaTrabajadores) {
			super();
			this.cif = cif;
			this.nombre = nombre;
			this.listaTrabajadores = listaTrabajadores;
			totalTrabajadores = totalTrabajadores+ listaTrabajadores.size();
		}
		public String getCif() {
			return cif;
		}
		public void setCif(String cif) {
			this.cif = cif;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public List<EjercicioPOOpeluo> getListaTrabajadores() {
			return listaTrabajadores;
		}
		public void setListaTrabajadores(List<EjercicioPOOpeluo> listaTrabajadores) {
			this.listaTrabajadores = listaTrabajadores;
		}
		public static int getTotalTrabajadores() {
			return totalTrabajadores;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((cif == null) ? 0 : cif.hashCode());
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
			EjercicioPeluoPOOEmpresa other = (EjercicioPeluoPOOEmpresa) obj;
			if (cif == null) {
				if (other.cif != null)
					return false;
			} else if (!cif.equals(other.cif))
				return false;
			return true;
		}
		//metodo que añade una lista de personas a la lista de trabajadores, devolvera el numero de las personas que no existian y 
	public int  darAltaTrabajadores(List<EjercicioPOOpeluo> listaAnydir) {
		int contador= 0 ;
		for (EjercicioPOOpeluo ejercicioPOOpeluo : listaAnydir) {
			if (darAltaTrabajadores(ejercicioPOOpeluo)) {
				contador++:
			}
			
		}
		
		
	}
		
		
	public boolean darAltaTrabajadores (EjercicioPOOpeluo personaAnyadir) {
		if (!listaTrabajadores.contains(personaAnyadir)){
		listaTrabajadores.contains(personaAnyadir);
		EjercicioPeluoPOOEmpresa.totalTrabajadores++;
		return true;
		}else {
			return false;
		}
		
		
		public boolean darBajaTrabajadores (EjercicioPOOpeluo personaBaja) {
			if (listaTrabajadores.contains(personaBaja)) {
				listaTrabajadores.remove(personaBaja);
				EjercicioPeluoPOOEmpresa.totalTrabajadores--;
				return true;
			}
			else {
				return false;
			}
		}
		
		
	}
	
		
		

}
