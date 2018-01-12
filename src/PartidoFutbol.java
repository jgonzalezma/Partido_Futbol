import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;






public class PartidoFutbol {
		
		private String EquipoLocal;
		private String EquipoVisita;
		private int GolesLocal;
		private int GolesVisita;
		
		
	
		public void Partido(){
			
		}
		
	
		public String getEquipoLocal() {
			return EquipoLocal;
		}
		public void setEquipoLocal(String equipoLocal) {
			EquipoLocal = equipoLocal;
		}
		public String getEquipoVisita() {
			return EquipoVisita;
		}
		public void setEquipoVisita(String equipoVisita) {
			EquipoVisita = equipoVisita;
		}
		public int getGolesLocal() {
			return GolesLocal;
		}
		public void setGolesLocal(int golesLocal) {
			GolesLocal = golesLocal;
		}
		public int getGolesVisita() {
			return GolesVisita;
		}
		public void setGolesVisita(int partes) {
			GolesVisita = partes;
		}
		
		public void mostarInfo(){
			System.out.println("El equipo local es " + getEquipoLocal() + " y ha marcado " + getGolesLocal()
			+ " y " +  "El equipo visita es " + getEquipoVisita() + " y ha marcado " + getGolesVisita());
			
		}


		public String getStringGuardado() {
			return this.getEquipoLocal() + ": " + this.getEquipoVisita() + ": " + this.getGolesLocal() + ": " + this.getGolesVisita();
			
			
		}
		
		

		
	 
		
			
		}

		
	


		
		
	





