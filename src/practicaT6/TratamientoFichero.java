package practicaT6;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;


/*
 * Aquí contemplamos una de las opciones a la hora de capturar 
 * excepciones.
 * En esta parte lo hacemos con la estructura try + catch y añadimos la 
 * opción de ejecución obligatoria con la sentencia finally.
 */

/**
 * 
 * @author Sergio Seva Rayos
 * @version 1.0
 *
 */
public class TratamientoFichero {
	// Variables para leer los ficheros pacientes
	static String rutaPac = "C:/Users/sergi/git/PracticaEDt6/Pacientes.txt";
	static String rutaVis = "C:/Users/sergi/git/PracticaEDt6/Visitas.txt";
	
	// Variables para escribir en los ficheros
	static PrintWriter pw = null;
	static FileWriter fichero = null;
	
	
	// Variables para gestionar los pacientes
	static String DNI; // Variable para almacenar el DNI
	static String nombre; // Variable para almacenar nombre
	static String edad; // Variable para almacenar la edad
	static String calle; // Variable para almacenar la calle
	static String localidad; // Variable para almacenar la localidad
	static String cod_postal; // Variable para almacenar el código postal
	
	// Variables para formato de fecha
	static  Date fecha = new Date(); // Variable para generar la fecha y la hora
	static SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy"); // Variable para darle el formato a la fecha
	static SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss"); // Variable para darle el formato a la hora
	
	// Variables para gestionar las visitas
	static String fechaCons = formatoFecha.format(fecha); // Variable para la fecha
	static String horaCons = formatoHora.format(fecha); // Variable para almacenar la hora de la consulta 
	static String h = horaCons;
	static String f = fechaCons;
	static double peso; // Variable para almacenar el peso
	static double altura; // Variable para almacenar la altura
	static double IMC; // Variable para almacenar el índice de masa corporal
	static final String kg = "kg"; // Variable para indicar la unidad de medida del peso
	static final String m = "m"; // Variable para indicar la unidad de medida de la altura
	
	
	// Variables generales
	static int op = 0; // Variable para la selección de las diferentes opciones
	static Scanner sc = new Scanner(System.in); // Variable para escanear las diferentes opciones

	/**
	* Método para la introducción del dato "DNI", mediante este método nos aseguramos
	* que los datos introducidos son correctos
	*/
	public static void inDNI() {
		// Recolección del dato "DNI"
		sc.nextLine(); // Limpiamos el buffer de entrada
		System.out.println("FORMATO: El DNI contiene 8 caracteres numericos y uno alfabetico al final");
		System.out.println("Ej. 99999999y");
		System.out.print("\nIntroduce el DNI del paciente: ");
		DNI = sc.nextLine();
		
		// Mediante esta sentencia comprobamos que el "DNI" tiene el formato correcto
		if (DNI != null && DNI.matches("\\d{8}[A-Za-z]")) {
			System.out.println("");
			compruebaDNI();
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
		System.out.println("FORMATO: El nombre consta de caracteres alfabeticos sin numeros ");
		System.out.println("Ej. Pepe Ventana Armario");
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
		System.out.println("FORMATO: La edad se compone de caracteres numericos");
		System.out.println("Ej. 34");
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
		System.out.println("FORMATO: La calle consta de caracteres alfanumericos");
		System.out.println("Ej. Calle Santa Pola 4");
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
		System.out.println("FORMATO: El nombre consta de caracteres alfabeticos sin numeros ");
		System.out.println("Ej. Lorca");
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
		System.out.println("FORMATO: El codigo postal consta de caracteres alfanumericos");
		System.out.println("Ej. 03349");
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
	 * Método para la introducción de la variable "peso"
	 */
	public static void inPeso() {
		// Recolección del dato "peso"
		op = 2;
		System.out.println("FORMATO: El peso consta de caracteres numericos");
		System.out.println("Ej. 90");
		System.out.println("\nIntroduce el peso del paciente: ");
		peso = sc.nextDouble();
		
		// Mediante esta sentencia nos aseguramos que el peso tiene el formato correcto
		if (peso != 0) {
			System.out.println("Peso correcto");
			menu();
		}else {
			System.err.println("Peso incorrecto, vuelve a introducirlo");
			inPeso();
		}

	}

	/**
	 * Método para la introducción de la variable "altura"
	 */
	public static void inAltura() {
		// Recolección del dato "altura"
		op = 2;
		System.out.println("FORMATO: La altura consta de caracteres numericos y se separan por una coma");
		System.out.println("Ej. 1,90");
		System.out.println("\nIntroduce la altura del paciente: ");
		altura = sc.nextDouble();
		
		// Mediante esta sentencia nos aseguramos que la altura tiene el formato correcto
		if (altura != 0) {
			System.out.println("Altura correcta");
			menu();
		}else {
			System.err.println("Altura incorrecta, vuelve a introducirla");
			inAltura();
		}
	}
	
	/**
	* Método para la introducción del dato "DNI" en las visitas, mediante este método nos aseguramos
	* que los datos introducidos son correctos
	*/
	public static void inDNIvisita() {
		// Recolección del dato "DNI"
		op = 2;
		sc.nextLine(); // Limpiamos el buffer de entrada
		System.out.println("FORMATO: El DNI contiene 8 caracteres numericos y uno alfabetico al final");
		System.out.println("Ej. 99999999y");
		System.out.print("\nIntroduce el DNI del paciente: ");
		DNI = sc.nextLine();
		
		// Mediante esta sentencia comprobamos que el "DNI" tiene el formato correcto
		if (DNI != null && DNI.matches("\\d{8}[A-Za-z]")) {
			System.out.println("DNI correcto");
			menu();
		}else {
			System.out.print("DNI incorrecto, vuelve a introducirlo: ");
			inDNIvisita();
		}
	}
	
	//________________________________________________________________________________________________________
			private static void calcIMC() {
				op = 2;
				IMC = peso / (altura * altura); // Variable para almacenar el índice de masa corporal
				menu();
			}

	
	/**
	 * Método para preparar las variables para la recolección de datos 
	 */
	public static void iniciaDatosPac() {
		DNI = "";
		nombre = "";
		edad = "";
		calle = "";
		localidad = "";
		cod_postal = "";
		op = 0;
	}
	
	/**
	 * Método para preparar las variables para la recolección de datos 
	 */
	public static void iniciaDatosVis() {
		DNI = "";
		horaCons = "";
		fechaCons = "";
		peso = 0;
		altura = 0;
		IMC = 0;
		op = 0;
	}

	/**
	 * Método para mostrar los datos que se van agregando
	 */
	private static void muestraDatosPac() {
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
	 * Método para mostrar los datos que se van agregando
	 */
	private static void muestraDatosVis() {
		System.out.println("_______________________________________________________");
		System.out.println("\t\t\tRESUMEN");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("DNI: " + DNI);
		System.out.println("Peso: "+ peso + kg);
		System.out.println("Altura: "+ altura + m);
		System.out.println("IMC: " + ((double)Math.round(IMC * 100d) / 100d));
		System.out.println("Hora Consulta: " + h);
		System.out.println("Fecha consulta: "+ f);
		System.out.println("_______________________________________________________");
	}

	/**
	 * Método a través del cual gestionamos el menú
	 */
	public static void menu() {
		while (op <= 0 || op >2) {
			System.out.println("\t\t\t  MENU");
			System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''");
			System.out.println("1. Agregar paciente");
			System.out.println("2. Nueva visita");
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
				muestraDatosPac();
				System.out.println("\t\t    AGREGAR PACIENTE");
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
				
				// Mediante esta sentencia comprobamos que se introduce la opción de forma correcta, y si no, que vuelva introducirla
				if(sc.hasNextInt()) { 
				    op = sc.nextInt(); 
				} else {
				    sc.next(); 
				    System.err.println("\nError: Opcion incorrecta");
				    System.err.println("Error: Vuelve a elegir la opcion");
				}
				if (op < 0 || op > 8) {
					System.err.println("\nError: Opcion incorrecta");
					System.err.println("Error: Vuelve a elegir la opcion");
				}
				
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
						tryCatchPaci();
						iniciaDatosPac();
						menu();
					}else {
						System.err.println("ERROR");
						menu();
					}
					break;
				case 8:
					iniciaDatosPac();
					System.out.println("Borrando datos....");
					break;
				}
			}
			
		case 2:
			op = 0;
			while (op <= 0 || op >6 ) {
				muestraDatosVis();
				System.out.println("\t\t    AGREGAR VISITA");
				System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''");
				System.out.println("1. DNI");
				System.out.println("2. Peso");
				System.out.println("3. Altura");
				System.out.println("4. Calcular IMC");
				if (IMC != 0) {
					System.out.println("5. Guardar");
				}
				System.out.println("6. Borrar datos");
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
				if (op < 0 || op > 6) {
					System.err.println("\nError: Opcion incorrecta");
					System.err.println("Error: Vuelve a elegir la opcion");
				}
				
				// Aquí se establecen las diferentes opciones de la recolección de datos
				switch (op) {
				case 0:
					menu();
					break;
				case 1:
					inDNIvisita();
					break;
				case 2:
					inPeso();
					break;
				case 3:
					inAltura();
					break;
				case 4:
					calcIMC();
					menu();
					break;
				case 5:
					if (IMC != 0) {
						System.out.println("Guardando.....");
						tryCatchVisi();
						iniciaDatosVis();
						menu();
					}else {
						System.err.println("ERROR");
						menu();
					}
					break;
				case 6:
					iniciaDatosVis();
					System.out.println("Borrando datos....");
					break;
				}
			}
			break;
		}
	}
	
	/**
	 * Método por el cual guardamos los datos de los pacientes en un documento .txt
	 */
	public static void tryCatchPaci() {
		try {
			// Añadir flag a true para no machacar contenido del
			fichero = new FileWriter(rutaPac, true);
			pw = new PrintWriter(fichero);
			
			//---------------------------------------------- Inicio 
			pw.println(DNI + ", " + nombre + ", " + edad + ", " + calle + ", " + localidad + ", " + cod_postal);
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
	
	/**
	 * Método por el cual guardamos los datos de las consultas en un documento .txt
	 */
	public static void tryCatchVisi() {
		try {
			// Añadir flag a true para no machacar contenido del
			fichero = new FileWriter(rutaVis, true);
			pw = new PrintWriter(fichero);
			
			//---------------------------------------------- Inicio 
			pw.println(DNI + ", " + f + ", " + h + ", " + peso + kg + ", " + altura + m + ", " + ((double)Math.round(IMC * 100d) / 100d));
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
	
	// TODO Comentar el código
	/**
	 * Método por el cual se comprueba la unicidad del paciente
	 */
	public static void compruebaDNI() {
		try (BufferedReader br = new BufferedReader(new FileReader(rutaPac))) {
		      String linea;

		      while ((linea = br.readLine()) != null) {
	
		        if (linea.contains(DNI)) {
		          System.err.println("El paciente ya esta registrado");
		          iniciaDatosPac();
		          return;
		        }
		      }

		      System.out.println("Se procedera a insertar un nuevo paciente");
		    } catch (IOException e) {

		      System.out.println("Error al leer el archivo: " + rutaPac);
		      e.printStackTrace();
		    }
		  }
		
	public static void main(String[] args) throws IOException {
		iniciaDatosPac();
		iniciaDatosVis();
		menu();
		
	}
	
}