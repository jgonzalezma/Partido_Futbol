import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;






public class PartidoFutbol {
		
		private String EquipoLocal;
		private String equipoVisitante;
		private int golesLocal;
		private int golesVisitante;
		private int golesTotal;
		
		
	
		public String getEquipoVisitante() {
			return equipoVisitante;
		}


		public void setEquipoVisitante(String equipoVisitante) {
			this.equipoVisitante = equipoVisitante;
		}


		public int getGolesVisitante() {
			return golesVisitante;
		}


		public void setGolesVisitante(int golesVisitante) {
			this.golesVisitante = golesVisitante;
		}


		public int getGolesTotal() {
			return golesTotal;
		}


		public void setGolesTotal() {
		golesTotal = getGolesLocal() + getGolesVisitante();
		}

		public void Partido(){
			
		}
		
	
		public String getEquipoLocal() {
			return EquipoLocal;
		}
		public void setEquipoLocal(String equipoLocal) {
			EquipoLocal = equipoLocal;
		}
		public String getEquipoVisita() {
			return equipoVisitante;
		}
		public void setEquipoVisita(String equipoVisita) {
			equipoVisitante = equipoVisita;
		}
		public int getGolesLocal() {
			return golesLocal;
		}
		public void setGolesLocal(int GolesLocal) {
			golesLocal = GolesLocal;
		}
		public int getGolesVisita() {
			return golesVisitante;
		}
		public void setGolesVisita(int partes) {
			golesVisitante = partes;
		}
		
		public void mostarInfo(){
			System.out.println(getEquipoLocal() + " " + getGolesLocal() + " " + getEquipoVisitante() + " " + getGolesVisita());
			
		}


		public String getStringGuardado() {
			return this.getEquipoLocal() + ": " + this.getEquipoVisita() + ": " + this.getGolesLocal() + ": " + this.getGolesVisita();
			
			
		}
		
		}


		
	


		
		
	





