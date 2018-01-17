import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList <PartidoFutbol> partidos = new ArrayList <PartidoFutbol>();
		
		partidos = crearLista("D:/Josu/Programación/partidosfutbol.txt");
		
		
		int opcion;
		
		
		final int LISTAR = 1;
		final int INSERTAR = 2;
		final int ELIMINAR = 3;
		final int SALIR = 4;
		
		do{
			System.out.println("---Menu---");
			System.out.println(LISTAR + "- Listar partidos de futbol.");
			System.out.println(INSERTAR + "- Agregar resultados de un partido de futbol.");
			System.out.println(ELIMINAR + " - Eliminar partido de futbol.");
			System.out.println(SALIR + " - Finalizar el programa.");
			
			Scanner lector = new Scanner(System.in);
			
			opcion = Integer.parseInt(lector.nextLine());
			
			switch(opcion){
			
			case INSERTAR:
				// pedir datos de partido
				System.out.println("Introduce el equipo local");
				String local = lector.nextLine();

				System.out.println("Introduce el equipo visita");
				String visita = lector.nextLine();

				System.out.println("Introduce goles local");
				int golL = lector.nextInt();
				
				System.out.println("Introduce goles visita");
				int golV = lector.nextInt();


				// crear partido
				PartidoFutbol pf1 = new PartidoFutbol();
				pf1.setEquipoLocal (local);
				pf1.setEquipoVisita (visita);
				pf1.setGolesLocal(golL);
				pf1.setGolesVisita(golV);
				
				// aniadirlo a la lista
				partidos.add(pf1);
				
				
				break;
				
			case LISTAR:
				GolesComparator gc = new GolesComparator();
				partidos.sort(gc);
				if (partidos.isEmpty()) {
					System.out.println("La lista esta vacía");
				} else {
					Iterator<PartidoFutbol> i = partidos.iterator();
					while (i.hasNext()) {
						PartidoFutbol p = i.next();
						p.mostarInfo();
					}
				}
				
				
				break;
				
			case ELIMINAR:
				System.out.println("Introduce un nombre de un equipo para eliminar el partido");
				String nombre = lector.nextLine();
				
				eliminarPartido(nombre, partidos);
				break;
				
			case SALIR:
				guardarLista(partidos, "D:/partidos.txt");

				System.out.println("Guardado y Saliendo.....");
				break;
			
			
			default:
				System.out.println("Opcion mal");
				break;
			}
			
		
			
		}while(opcion != SALIR);
		
			
	}


	
		
	
	
	

	//public static ArrayList <PartidoFutbol> crearLista(ArrayList<PartidoFutbol> partidos2) throws FileNotFoundException{ 
		//ArrayList <PartidoFutbol> Partidos = new ArrayList <PartidoFutbol>();
		
		//File f = new File("D:/partidos.txt");
		//Scanner lectorf = new Scanner(f);
		//while(lectorf.hasNextLine()){
			//String linea = lectorf.nextLine();
			//String partes [] = linea.split(":");
			//PartidoFutbol Partido = new PartidoFutbol();
			//Partido.setEquipoLocal(partes[0]);
			//Partido.setEquipoVisita(partes[1]);
			//Partido.setGolesLocal(Integer.parseInt(partes[2]));
			//Partido.setGolesVisita(Integer.parseInt(partes[3]));
			

			
			
			//System.out.println(linea);
			
		//}
		//return Partidos;
	
	private static ArrayList<PartidoFutbol> crearLista(String nombreFichero) {
		ArrayList<PartidoFutbol> lista = new ArrayList<PartidoFutbol>();

		File file = new File(nombreFichero);
		Scanner scan = null;
		try {
			scan = new Scanner(file);

			// por cada linea del texto añade una persona a la lista
			while (scan.hasNext()) {
				String linea = scan.nextLine();
				String[] partes = linea.split(":");

				PartidoFutbol p = new PartidoFutbol();
				p.setEquipoLocal(partes[0]);
				p.setEquipoVisita(partes[1]);
				p.setGolesLocal(Integer.parseInt(partes[2]));
				p.setGolesVisita(Integer.parseInt(partes[3]));

				lista.add(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return lista;
	}
	
	private static void eliminarPartido(String nombreFichero, ArrayList<PartidoFutbol> partidos) {
		Iterator<PartidoFutbol> i = partidos.iterator();
		while(i.hasNext()){
			PartidoFutbol p = i.next();
			if(p.getEquipoLocal().equals(nombreFichero) || (p.getEquipoVisita().equals(nombreFichero))){
				i.remove();
				System.out.println(p.getEquipoLocal() + " eliminado");
			}
		}
	}
	
	private static void guardarLista(ArrayList<PartidoFutbol> partidos, String nombreFichero) {

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(nombreFichero);

			PrintWriter printWriter = new PrintWriter(fileWriter);

			Iterator<PartidoFutbol> it = partidos.iterator();
			while (it.hasNext()) {
			PartidoFutbol partido = it.next();
				printWriter.println(partido.getStringGuardado());

			}
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
	
	
	}

	
		
	

	
		
	



		
		
	


