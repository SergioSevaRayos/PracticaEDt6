package practicaT6;
import java.io.FileWriter;
import java.util.*;
import java.io.PrintWriter;

/*
 * Aquí contemplamos una de las opciones a la hora de capturar 
excepciones
 * En esta parte lo hacemos con la estructura try + catch y añadimos la 
opción de ejecución
 * obligatoria con la sentencia finally.
 */

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


	// TODO Configurar bucles para comprobar los datos introducidos. (Hacer un menú para seleccionar el dato a introducir)
	
	public static void inDNI() {
		// Recolección del dato "DNI"
		sc.nextLine(); // Limpiamos el buffer de entrada
		System.out.print("\nIntroduce el DNI del paciente: ");
		DNI = sc.nextLine();
		
		if (DNI != null && DNI.matches("\\d{8}[A-Za-z]")) {
			System.out.println("DNI correcto");
			menu();
		}else {
			System.out.print("DNI incorrecto, vuelve a introducirlo: ");
			inDNI();
		}
	}
	
	public static void inNombre() {
		// Recolección del dato "nombre"
		op = 1;
		sc.nextLine(); // Limpiamos el buffer de entrada
		System.out.println("\nIntroduce el nombre del paciente: ");
		nombre = sc.nextLine();
		
		if (nombre != "") {
			menu();
		}else {
			nombre = sc.nextLine();
		}
	}
	
	public static void inEdad() {
		// Recolección del dato "edad"
		op = 1;
		System.out.println("\nIntroduce la edad del paciente: ");
		edad = sc.next();

		if (edad != null && edad.matches("^[0-9]+$")) {
			System.out.println("Edad correcta");
			menu();
		}else {
			System.err.println("Edad incorrecta, vuelve a introducirla");
			inEdad();
		}

	}

	public static void inCalle() {
		// Recolección del dato "calle"
		op = 1;
		System.out.println("\nIntroduce la calle del paciente: ");
		calle = sc.nextLine();
		if (calle != "") {
			menu();
		} else {
			calle = sc.nextLine();
		}
		menu();
		
	}
	
	public static void inLocalidad() {
		// Recolección del dato "localidad"
		op = 1;
		System.out.println("Introduce la localidad del paciente: ");
		localidad = sc.nextLine();
		if (localidad != "") {
			menu();
		} else {
			localidad = sc.nextLine();
		}
		menu();
	}
	
	public static void inCodPostal() {
		// Recolección del dato "cod_postal"
		op = 1;
		System.out.println("\nIntroduce el cod_postal del paciente: ");
		cod_postal = sc.nextLine();
		
		if (cod_postal != "" ) {
			menu();
		} else {
			cod_postal = sc.nextLine();
		}
		menu();

	}
	
	public static void iniciaDatos() {
		DNI = "";
		nombre = "";
		edad = "";
		calle = "";
		localidad = "";
		cod_postal = "";
		op = 0;
	}
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

	
	public static void menu() {
		while (op <= 0 || op >2) {
			System.out.println("\t\t\t  MENU");
			System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''");
			System.out.println("1. Agregar cliente");
			System.out.println("2. Nueva visita");
			System.out.println("");
			System.out.println("0. Salir");
			System.out.println("");

			if(sc.hasNextInt()) { // Si el siguiente valor del scanner es un int
			    op = sc.nextInt(); // Lo leemos y lo asignamos a op
			} else {
			    sc.next(); // Limpiamos el buffer de entrada
			    System.err.println("\nError: Opcion incorrecta");
			    System.err.println("Error: Vuelve a elegir la opcion");
			}

			if (op < 0 || op > 2) {
			    System.err.println("\nError: Opcion incorrecta");
			    System.err.println("Error: Vuelve a elegir la opcion");
			}
		}
		switch (op) {
		case 1:
			op = 0;
			while (op <= 0 || op >6 ) {
				muestraDatos();

				System.out.println("\t\t    AGREGAR CLIENTE");
				System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''");
				System.out.println("1. DNI");
				System.out.println("2. Nombre");
				System.out.println("3. Edad");
				System.out.println("4. Calle");
				System.out.println("5. Localidad");
				System.out.println("6. Codigo postal");
				System.out.println("");
				System.out.println("0. Salir");
				System.out.println("");
				if (op < 0 || op > 6) {
					System.err.println("\nError: Opcion incorrecta");
					System.err.println("Error: Vuelve a elegir la opcion");
				}
				op = sc.nextInt();
				switch (op) {
				case 0:
					menu();
					break;
				case 1:
					System.out.println("DNI");
					inDNI();
					break;
				case 2:
					System.out.println("Nombre");
					inNombre();
					break;
				case 3:
					System.out.println("Edad");
					inEdad();
					break;
				case 4:
					System.out.println("Calle");
					inCalle();
					break;
				case 5:
					System.out.println("Localidad");
					inLocalidad();
					break;
				case 6:
					System.out.println("Codigo postal");
					inCodPostal();
					break;
				}
			}

		}
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
	
	public String toString(String DNI, String nombre, int edad, String calle, String localidad, int cod_postal) {
		//CANT.\tPRODUCTO\t PRECIO UD\tTOTAL\n
		return DNI + "\t" +  nombre + "\t\t" + edad + "\t\t" + calle + "\t\t" + localidad + "\t\t" + cod_postal;
	}

	//---------------------------------------------- Fin 
	
	public static void main(String[] args) {
		iniciaDatos();
		muestraDatos();
		menu();
	}
	
}