package practicaT6;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * Aquí contemplamos una de las opciones a la hora de capturar 
excepciones
 * En esta parte lo hacemos con la estructura try + catch y añadimos la 
opción de ejecución
 * obligatoria con la sentencia finally.
 */

// TODO 
public class EscribeFichero {
	public static void main(String[] args) {
		String ruta = "C:/Users/sergi/git/PracticaEDt6/Pacientes.txt";
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			// Añadir flag a true para no machacar contenido del
			fichero = new FileWriter(ruta, false);
			pw = new PrintWriter(fichero);
			
			//---------------------------------------------- Inicio 
			/*Escribe mediante un bucle for un índice de 10 coches*/
//			for (int i = 0; i < 10; i++) {
//				pw.println("Coche " + i);
//				
//			}
			pw.println("DNI|NOMBRE|EDAD|CALLE|LOCALIDAD|COD. POSTAL|");
			Paciente paciente1 = new Paciente("48640477y","Sergio Seva Rayos",34,"Santa Pola 5","San Isidro",3349);
			pw.println(paciente1.DNI+ "," + paciente1.nombre + "," + paciente1.edad + "," + paciente1.calle + "," + paciente1.localidad + "," + paciente1.cod_postal);
			
			Paciente paciente2 = new Paciente("22222222r","Pepe Casi Llega",39,"Aparicio 45","Callosa",3629);
			pw.println(paciente2.DNI+ "," + paciente2.nombre + "," + paciente2.edad + "," + paciente2.calle + "," + paciente2.localidad + "," + paciente2.cod_postal);
			
			Paciente paciente3 = new Paciente("45334333t","Juan Ade Arco",56,"Real 23","Alicante",1389);
			pw.println(paciente3.DNI+ "," + paciente3.nombre + "," + paciente3.edad + "," + paciente3.calle + "," + paciente3.localidad + "," + paciente3.cod_postal);
			//---------------------------------------------- Fin   
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero) {
					fichero.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();

			} finally {
				try {
					// Nuevamente aprovechamos el finally para
					// asegurarnos que se cierra el fichero.
					if (null != fichero) {
						fichero.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}