package practicaT6;
import java.io.FileWriter;
import java.util.*;
import java.io.PrintWriter;

/*
 * Aquí contemplamos una de las opciones a la hora de capturar 
 * excepciones.
 * En esta parte lo hacemos con la estructura try + catch y añadimos la 
 * opción de ejecución obligatoria con la sentencia finally.
 */

// TODO Tengo que configurar la forma de comprobar que la unicidad del "DNI"

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
	static String edad; // Variable para almacenar la edad
	static String calle; // Variable para almacenar la calle
	static String localidad; // Variable para almacenar la localidad
	static String cod_postal; // Variable para almacenar el código postal
	static int op = 0; // Variable para la selección de las diferentes opciones
	static Scanner sc = new Scanner(System.in); // Variable para escanear las diferentes opciones
	
	/**
	 * Método para la introducción del dato "DNI", mediante este método nos aseguramos
	 * que los datos introducidos son correctos
	 */
	public static void inDNI() {
		// Recolección del dato "DNI"
		sc.nextLine(); // Limpiamos el buffer de entrada
		System.out.print("\nIntroduce el DNI del paciente: ");
		DNI = sc.nextLine();
		
		// Mediante esta sentencia comprobamos que el "DNI" tiene el formato correcto
		if (DNI != null && DNI.matches("\\d{8}[A-Za-z]")) {
			System.out.println("DNI correcto");
			menu();
		}else {
			System.out.print("DNI incorrecto, vuelve a introducirlo: ");
			inDNI();
		}
	}
	
	/**
	 * Método para la introducción del dato "nombre", mediante este método nos aseguramos
	 * que los datos introducidos son correctos
	 */
	public static void inNombre() {
		// Recolección del dato "nombre"
		op = 1;
		sc.nextLine(); // Limpiamos el buffer de entrada
		System.out.println("\nIntroduce el nombre del paciente: ");
		nombre = sc.nextLine();
		
		// Mediante esta sentencia nos aseguramos que el menú aparece una vez se ha introducido el dato
		if (nombre != "") {
			menu();
		}else {
			nombre = sc.nextLine();
		}
	}
	
	/**
	 * Método para la introducción del dato "edad", mediante este método nos aseguramos
	 * que los datos introducidos son correctos
	 */
	public static void inEdad() {
		// Recolección del dato "edad"
		op = 1;
		System.out.println("\nIntroduce la edad del paciente: ");
		edad = sc.next();

		// Mediante esta sentencia nos aseguramos que la edad tiene el formato correcto
		if (edad != null && edad.matches("^[0-9]+$")) {
			System.out.println("Edad correcta");
			menu();
		}else {
			System.err.println("Edad incorrecta, vuelve a introducirla");
			inEdad();
		}
	}
	
	/**
	 * Método para la introducción del dato "calle", mediante este método nos aseguramos
	 * que los datos introducidos son correctos
	 */
	public static void inCalle() {
		// Recolección del dato "calle"
		op = 1;
		System.out.println("\nIntroduce la calle del paciente: ");
		calle = sc.nextLine();
		
		// Mediante esta sentencia nos aseguramos que el menú aparece una vez se ha introducido el dato
		if (calle != "") {
			menu();
		} else {
			calle = sc.nextLine();
		}
		menu();
	}
	
	/**
	 * Método para la introducción del dato "localidad", mediante este método nos aseguramos
	 * que los datos introducidos son correctos
	 */
	public static void inLocalidad() {
		// Recolección del dato "localidad"
		op = 1;
		System.out.println("Introduce la localidad del paciente: ");
		localidad = sc.nextLine();
		
		// Mediante esta sentencia nos aseguramos que el menú aparece una vez se ha introducido el dato
		if (localidad != "") {
			menu();
		} else {
			localidad = sc.nextLine();
		}
		menu();
	}
	
	/**
	 * Método para la introducción del dato "código postal", mediante este método nos aseguramos
	 * que los datos introducidos son correctos
	 */
	public static void inCodPostal() {
		// Recolección del dato "cod_postal"
		op = 1;
		System.out.println("\nIntroduce el cod_postal del paciente: ");
		cod_postal = sc.nextLine();
		
		// Mediante esta sentencia nos aseguramos que el menú aparece una vez se ha introducido el dato
		if (cod_postal != "" ) {
			menu();
		} else {
			cod_postal = sc.nextLine();
		}
		menu();
	}
	
	/**
	 * Método para preparar las variables para la recolección de datos 
	 */
	public static void iniciaDatos() {
		DNI = "";
		nombre = "";
		edad = "";
		calle = "";
		localidad = "";
		cod_postal = "";
		op = 0;
	}

	/**
	 * Método para mostrar los datos que se van agregando
	 */
	private static void muestraDatos() {
		System.out.println("_______________________________________________________");
		System.out.println("\t\t\tRESUMEN");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("DNI: " + DNI);
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+ edad);
		System.out.println("Calle: " + calle);
		System.out.println("Localidad: "+ localidad);
		System.out.println("Codigo postal: " + cod_postal);
		System.out.println("_______________________________________________________");
	}

	/**
	 * Método a través del cual gestionamos el menú
	 */
	public static void menu() {
		while (op <= 0 || op >2) {
			System.out.println("\t\t\t  MENU");
			System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''");
			System.out.println("1. Agregar cliente");
			//System.out.println("2. Nueva visita");
			System.out.println("");
			System.out.println("0. Salir");
			System.out.println("");

			// Mediante esta sentencia comprobamos que se introduce la opción de forma correcta, y si no, que vuelva introducirla
			if(sc.hasNextInt()) { 
			    op = sc.nextInt(); 
			} else {
			    sc.next(); 
			    System.err.println("\nError: Opcion incorrecta");
			    System.err.println("Error: Vuelve a elegir la opcion");
			}
			
			// Mediante esta sentencia informamos que la opción elegida no esta dentro del rango
			if (op < 0 || op > 2) {
			    System.err.println("\nError: Opcion incorrecta");
			    System.err.println("Error: Vuelve a elegir la opcion");
			}
		}
	
		// Aquí se establecen las diferentes opciones del menú
		switch (op) {
		case 1:
			op = 0;
			while (op <= 0 || op >8 ) {
				muestraDatos();
				System.out.println("\t\t    AGREGAR CLIENTE");
				System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''");
				System.out.println("1. DNI");
				System.out.println("2. Nombre");
				System.out.println("3. Edad");
				System.out.println("4. Calle");
				System.out.println("5. Localidad");
				System.out.println("6. Codigo postal");
				if (DNI != "" && nombre != "" && edad != "" && calle != "" && localidad != "" && cod_postal != "") {
					System.out.println("7. Guardar");
				}
				System.out.println("8. Borrar datos");
				System.out.println("");
				System.out.println("0. Salir");
				System.out.println("");
				if (op < 0 || op > 8) {
					System.err.println("\nError: Opcion incorrecta");
					System.err.println("Error: Vuelve a elegir la opcion");
				}
				op = sc.nextInt();
				
				// Aquí se establecen las diferentes opciones de la recolección de datos
				switch (op) {
				case 0:
					menu();
					break;
				case 1:
					inDNI();
					break;
				case 2:
					inNombre();
					break;
				case 3:
					inEdad();
					break;
				case 4:
					inCalle();
					break;
				case 5:
					inLocalidad();
					break;
				case 6:
					inCodPostal();
					break;
				case 7:
					if (DNI != "" && nombre != "" && edad != "" && calle != "" && localidad != "" && cod_postal != "") {
						System.out.println("Guardando.....");
						tryCatch();
						iniciaDatos();
						menu();
					}else {
						System.err.println("ERROR");
						menu();
					}
					break;
				case 8:
					iniciaDatos();
					System.out.println("Borrando datos....");
					break;
				}
			}
			
//		case 2:
//			menu();
//			break;
		}
	}
	
	public static void tryCatch() {
		try {
			// Añadir flag a true para no machacar contenido del
			fichero = new FileWriter(ruta, true);
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
		iniciaDatos();
		muestraDatos();
		menu();
	}
	
}