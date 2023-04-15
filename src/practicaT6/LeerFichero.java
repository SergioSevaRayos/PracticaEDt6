package practicaT6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * En este método contemplamos otra opción de captura de excepciones con la llamada en la
 * definición de un procedimmiento definido como estático con la palabra 
 * reservada Throws seguida de las excepciones a capturar
 */

/**
 * 
 * @author Sergio Seva Rayos
 * @version 1.0
 *
 */
public class LeerFichero {
	public static void muestraContenido(String archivo) throws 
	FileNotFoundException, IOException {
		String cadena;
		FileReader f = new FileReader(archivo);
		BufferedReader b = new BufferedReader(f);
		while ((cadena = b.readLine()) != null) {
			System.out.println(cadena);
		}
		if (TratamientoFichero.DNI == b.readLine()) {
			System.out.println("El DNI existe");
		}
		b.close();
	}
	
	public static void main(String[] args) throws IOException {
		String rutaPacientes = "C:/Users/sergi/git/PracticaEDt6/Pacientes.txt";
		String rutaVisitas = "C:/Users/sergi/git/PracticaEDt6/Visitas.txt";
		muestraContenido(rutaPacientes);
		System.out.println("");
		muestraContenido(rutaVisitas);
	}
}
