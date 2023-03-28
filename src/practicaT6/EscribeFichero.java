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
/**
 * 
 * @author Sergio Seva Rayos
 * @version 1.0
 *
 */
public class EscribeFichero {
	static PrintWriter pw = null;
	static String ruta = "C:/Users/sergi/git/PracticaEDt6/Pacientes.txt";
	static FileWriter fichero = null;
	
	public static void main(String[] args) {
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
			// Pacientes 
			Paciente.pacientesDefecto();
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