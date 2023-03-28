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
	String DNI = ""; // Variable para almacenar el DNI
	String nombre = ""; // Variable para almacenar nombre
	int edad = 0; // Variable para almacenar la edad
	String calle = ""; // Variable para almacenar la calle
	String localidad = ""; // Variable para almacenar la localidad
	int cod_postal = 0; // Variable para almacenar el código postal
	static int op; // Variable para la selección de las diferentes opciones
	static Scanner sc = new Scanner(System.in); // Variable para escanear las diferentes opciones


	/**
	 * 
	 * @param DNI almacena el DNI
	 * @param nombre almacena el nombre
	 * @param edad almacena la edad
	 * @param calle almacena la calle
	 * @param localidad almacena la localidad
	 * @param cod_postal almacena el código postal
	 */
	public Paciente(String DNI, String nombre, int edad, String calle, String localidad, int cod_postal) {
		// Constructor
		this.DNI = DNI; // Almacena DNI	
		this.nombre = nombre; // Almacena nombre 
		this.edad = edad; // Almacena edad 
		this.calle = calle; // Almacena calle
		this.localidad = localidad; // Almacena localidad
		this.cod_postal = cod_postal; // Almacena código postal
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
	
	/**
	 * TODO Tengo que implementar la funcionalidad para que guarde los datos introducidos en el fichero
	 */
	public static void insertarPacientes() {

		op = 0;
		System.out.println("\nIntroduce el DNI del paciente: ");
		String DNI = sc.next();
//		EscribeFichero.pw.println(paciente[i].DNI);
		
		System.out.println("\nIntroduce el nombre del paciente: ");
		String nombre = sc.next();
//		EscribeFichero.pw.println(paciente[i].nombre);
		
		System.out.println("\nIntroduce la edad del paciente: ");
		int edad = sc.nextInt();
//		EscribeFichero.pw.println(paciente[i].edad);
		
		System.out.println("\nIntroduce la calle del paciente: ");
		String calle = sc.next();
//		EscribeFichero.pw.println(paciente[i].calle);
		
		System.out.println("\nIntroduce la localidad del paciente: ");
		String localidad = sc.next();
//		EscribeFichero.pw.println(paciente[i].localidad);
		
		System.out.println("\nIntroduce el codigo postal del paciente: ");
		int cod_postal = sc.nextInt();
//		EscribeFichero.pw.println(paciente[i].cod_postal);
		
		System.out.println(DNI + nombre + edad + calle + localidad + cod_postal);
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
	
}








