//package practicaT6;
//
//import java.util.Scanner;
//
///**
// * Clase para la gestión de los datos de los pacientes
// * 
// * @author Sergio Seva Rayos
// * @version 1.0
// */
//public class Paciente {
//	// Atributos
//	static String DNI = ""; // Variable para almacenar el DNI
//	static String nombre = ""; // Variable para almacenar nombre
//	static int edad = 0; // Variable para almacenar la edad
//	static String calle = ""; // Variable para almacenar la calle
//	static String localidad = ""; // Variable para almacenar la localidad
//	static int cod_postal = 0; // Variable para almacenar el código postal
//	static int op; // Variable para la selección de las diferentes opciones
//	static Scanner sc = new Scanner(System.in); // Variable para escanear las diferentes opciones
//
//
//	/**
//	 * 
//	 * @param DNI almacena el DNI
//	 * @param nombre almacena el nombre
//	 * @param edad almacena la edad
//	 * @param calle almacena la calle
//	 * @param localidad almacena la localidad
//	 * @param cod_postal almacena el código postal
//	 */
//	public Paciente(String d, String n, int e, String c, String l, int co) {
//		// Constructor
//		d = DNI; // Almacena DNI	
//		n = nombre; // Almacena nombre 
//		e = edad; // Almacena edad 
//		c = calle; // Almacena calle
//		l = localidad; // Almacena localidad
//		co = cod_postal; // Almacena código postal
//	}
//	
//	
//	public static void main(String[] args) {
//		menu();
//
//	}
//	
//	/**
//	 * Método para instanciar los 3 pacientes iniciales
//	 * 
//	 */
////	public static void pacientesDefecto() {
////		// Pacientes
////		
////		// Paciente 1
////		//Instanciación del paciente 1
////		Paciente paciente1 = new Paciente("48640477y","Sergio Seva Rayos",34,"Santa Pola 5","San Isidro",3349);
////		//Escritura en fichero del paciente 1
////		EscribeFichero.pw.println(paciente1.DNI+ "," + paciente1.nombre + "," + paciente1.edad + "," + paciente1.calle + "," + paciente1.localidad + "," + paciente1.cod_postal);
////		
////		// Paciente 2
////		//Instanciación del paciente 2
////		Paciente paciente2 = new Paciente("22222222r","Pepe Casi Llega",39,"Aparicio 45","Callosa",3629);
////		//Escritura en fichero del paciente 2
////		EscribeFichero.pw.println(paciente2.DNI+ "," + paciente2.nombre + "," + paciente2.edad + "," + paciente2.calle + "," + paciente2.localidad + "," + paciente2.cod_postal);
////					
////		// Paciente 3
////		//Instanciación del paciente 3
////		Paciente paciente3 = new Paciente("45334333t","Juan Ade Arco",56,"Real 23","Alicante",1389);
////		//Escritura en fichero del paciente 3
////		EscribeFichero.pw.println(paciente3.DNI+ "," + paciente3.nombre + "," + paciente3.edad + "," + paciente3.calle + "," + paciente3.localidad + "," + paciente3.cod_postal);
////	}
////	
//	/**
//	 * TODO Tengo que implementar la funcionalidad para que guarde los datos introducidos en el fichero
//	 */
//	public static void insertarPacientes() {
//		op = 0;
//		System.out.println("\nIntroduce el DNI del paciente: ");
//		Paciente.DNI = sc.next();
//		System.out.println("\nDNI: " + DNI);
//		EscribeFichero.pw.println(DNI);
//		menu();
//	}
//	
//	public static void menu() {
//		while (op <= 0 || op >2 ) {
//			System.out.println("\tMENU");
//			System.out.println("---------------------");
//			System.out.println("1. Agregar cliente");
//			System.out.println("2. Nueva visita");
//			System.out.println("");
//			System.out.println("0. Salir");
//			System.out.println("");
//			op = sc.nextInt();
//			if (op < 0 || op > 2) {
//				System.err.println("\nError: Opcion incorrecta");
//				System.err.println("Error: Vuelve a elegir la opcion");
//			}
//		}
//		switch (op) {
//		case 1:
//			System.out.println("Agregar cliente");
//			insertarPacientes();
//
//		default:
//			break;
//		}
//		
//		//sc.close();
//	}
//	
//}
//
//






