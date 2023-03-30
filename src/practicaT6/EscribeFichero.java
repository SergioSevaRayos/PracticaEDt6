package practicaT6;
import java.io.FileWriter;
import java.util.Scanner;
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
	
	//---------------------------------------------- Inicio 
	static String DNI; // Variable para almacenar el DNI
	static String nombre; // Variable para almacenar nombre
	static int edad; // Variable para almacenar la edad
	static String calle; // Variable para almacenar la calle
	static String localidad; // Variable para almacenar la localidad
	static int cod_postal; // Variable para almacenar el código postal
	static int op; // Variable para la selección de las diferentes opciones
	static Scanner sc = new Scanner(System.in); // Variable para escanear las diferentes opciones
	static boolean esEntero = false;

	// TODO Configurar bucles para comprobar los datos introducidos
	public static void insertarPacientes() {
		op = 0;
		System.out.println("\nIntroduce el DNI del paciente: ");
		DNI = sc.next();
		
		System.out.println("\nIntroduce el nombre del paciente: ");
		nombre = sc.next();
		
		

		while (!esEntero) {
            try {
                System.out.print("Introduzca un número entero: ");
                edad = sc.nextInt();
                esEntero = true;
            } catch (Exception e) {
                System.out.println("El valor introducido es incorrecto. Por favor, inténtelo de nuevo.");
                sc.next();  // Limpia buffer de entrada para evitar un bucle infinito
            }
        }
		
		System.out.println("\nIntroduce la calle del paciente: ");
		calle = sc.next();
		System.out.println("\nIntroduce la localidad del paciente: ");
		localidad = sc.next();
		System.out.println("\nIntroduce el cod_postal del paciente: ");
		cod_postal = sc.nextInt();
		
		tryCatch();
		menu();
	}
	
	public static void menu() {
		while (op <= 0 || op >2 ) {
			System.out.println("\tMENU");
			System.out.println("---------------------");
			System.out.println("1. Agregar cliente");
			System.out.println("2. Nueva visita");
			System.out.println("");
			System.out.println("0. Salir");
			System.out.println("");
			op = sc.nextInt();
			if (op < 0 || op > 2) {
				System.err.println("\nError: Opcion incorrecta");
				System.err.println("Error: Vuelve a elegir la opcion");
			}
		}
		switch (op) {
		case 1:
			System.out.println("Agregar cliente");
			insertarPacientes();
			
		default:
			break;
		}
		
		//sc.close();
	}
	public static void tryCatch() {
		try {
			// Añadir flag a true para no machacar contenido del
			fichero = new FileWriter(ruta, false);
			pw = new PrintWriter(fichero);
			
			//---------------------------------------------- Inicio 
			pw.println(DNI + "," + nombre + "," + edad + "," + calle + "," + localidad + "," + cod_postal);
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

	//---------------------------------------------- Fin 
	
	public static void main(String[] args) {
		menu();
	}
	
}