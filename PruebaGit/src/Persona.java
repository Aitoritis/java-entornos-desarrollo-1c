import java.util.*;

public class Persona {

	/**
	 * Default constructor
	 */
	public Persona() {
	}

	private String dni;

	private String nombre;

	private String apellido;

	private int edad;

	/**
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public void Persona(String dni, String nombre, String apellido, int edad) {
		
	}

	/**
	 * Modifica el DNI de la persona
	 * 
	 * @param dni
	 */
	public void setDni(String dni) {
		
		this.dni = dni;
		
	}

	/**
	 * Devuelve el DNI de la persona
	 * 
	 * @return
	 */
	public String getDni() {

		return "";

	}

	/**
	 * Modifica el nombre de la persona
	 * 
	 * @param nombre
	 */

	public void setNombre(String nombre) {
		
		this.nombre = nombre;

	}

	/**
	 * Devuelve el nombre de la persona
	 * 
	 * @return
	 */

	public String getNombre() {

		return "";

	}

	/**
	 * Modifica el apellido de la persona
	 * 
	 * @param apellido
	 */

	public void setApellido(String apellido) {
		
		this.apellido = apellido;

	}

	/**
	 * Devuelve el apellido de la persona
	 * 
	 * @return
	 */

	public String getApellido() {

		return "";

	}

	/**
	 * Modifica la edad de la persona
	 * 
	 * @param edad
	 */

	public void setEdad(int edad) {

		this.edad = edad;
		
	}

	/**
	 * Devuelve la edad de la persona
	 * 
	 * @return
	 */

	public int getEdad() {

		return 0;

	}

	@Override
	public String toString() {
		
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
		
	}

}