package practicaT6;

/**
 * Clase para la gestión de los datos de los pacientes
 * 
 * @author Sergio Seva Rayos
 * @version 1.0
 */
public class Paciente {
	// Atributos
	static String DNI; // Variable para almacenar el DNI
	static String nombre; // Variable para almacenar nombre
	static int edad; // Variable para almacenar la edad
	static String calle; // Variable para almacenar la calle
	static String localidad; // Variable para almacenar la localidad
	static int cod_postal; // Variable para almacenar el código postal
	 
	
	/**
	 * Método para el almacenamiento de los datos de clientes
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

		
	}
	public static void InsertaPacientes() {
//		Paciente paciente1 = new Paciente("48640477y","Sergio Seva Rayos","Santa Pola","San Isidro",34);
	}
}
