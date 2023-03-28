package practicaT6;

import java.util.Scanner;

/**
 * Clase para la gestión de los datos de los pacientes
 * 
 * @author Sergio Seva Rayos
 * @version 1.0
 */
public class Paciente {
	// Atributos
	String DNI; // Variable para almacenar el DNI
	String nombre; // Variable para almacenar nombre
	int edad; // Variable para almacenar la edad
	String calle; // Variable para almacenar la calle
	String localidad; // Variable para almacenar la localidad
	int cod_postal; // Variable para almacenar el código postal
	static int op; // Variable para la selección de las diferentes opciones
	static Scanner sc = new Scanner(System.in); // Variable para escanear las diferentes opciones
	static Scanner scPaciente = new Scanner(System.in); // Variable para escanear los datos del cliente

	static String pacientes[];

	

	 
	
	/**
	 * Constructor para el almacenamiento de los datos de clientes
	 * 
	 * @param D Almacena DNI
	 * @param no Almacena nombre
	 * @param ed Almacena edad
	 * @param ca Almacena calle
	 * @param lo Almacena localidad
	 * @param cod Almacena código postal
	 */
	public Paciente(String D, String no, int ed, String ca, String lo, int cod) {
		// Constructor
		DNI = D; // Almacena DNI	
		nombre = no; // Almacena nombre 
		edad = ed; // Almacena edad 
		calle = ca; // Almacena calle
		localidad = lo; // Almacena localidad
		cod_postal = cod; // Almacena código postal
	}
	
	
	public static void main(String[] args) {
		menu();

	}
	
	/**
	 * Método para instanciar los 3 pacientes iniciales
	 * 
	 */
	public static void pacientesDefecto() {
		// Pacientes
		
		// Paciente 1
		//Instanciación del paciente 1
		Paciente paciente1 = new Paciente("48640477y","Sergio Seva Rayos",34,"Santa Pola 5","San Isidro",3349);
		//Escritura en fichero del paciente 1
		EscribeFichero.pw.println(paciente1.DNI+ "," + paciente1.nombre + "," + paciente1.edad + "," + paciente1.calle + "," + paciente1.localidad + "," + paciente1.cod_postal);
		
		// Paciente 2
		//Instanciación del paciente 2
		Paciente paciente2 = new Paciente("22222222r","Pepe Casi Llega",39,"Aparicio 45","Callosa",3629);
		//Escritura en fichero del paciente 2
		EscribeFichero.pw.println(paciente2.DNI+ "," + paciente2.nombre + "," + paciente2.edad + "," + paciente2.calle + "," + paciente2.localidad + "," + paciente2.cod_postal);
					
		// Paciente 3
		//Instanciación del paciente 3
		Paciente paciente3 = new Paciente("45334333t","Juan Ade Arco",56,"Real 23","Alicante",1389);
		//Escritura en fichero del paciente 3
		EscribeFichero.pw.println(paciente3.DNI+ "," + paciente3.nombre + "," + paciente3.edad + "," + paciente3.calle + "," + paciente3.localidad + "," + paciente3.cod_postal);
	}
	
	public static void insertarPacientes() {
		
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
			System.out.println("");
			
//			quiero introducir pacientes desde la clase scanner y almacenarlos en un array con leguaje java
		}
		
		//sc.close();
	}
	
}








