package Models;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;

	/**
	 * Constructor de persona. Crea un objeto que representa a una persona
	 * 
	 * @param nombre   El nombre de la persona
	 * @param apellido Los apellidos de la persona
	 * @param edad     La edad de la persona. Debe estar entre 0 y 130
	 */

	public Persona(String nombre, String apellido, int edad) {

		if (edad < 0 || edad > 130) {

			throw new IllegalArgumentException("La edad debe estar entre 0 y 130.");

		}

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;

	}

	public String getNombre() {

		return nombre;

	}

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public String getApellido() {

		return apellido;

	}

	public void setApellido(String apellido) {

		this.apellido = apellido;

	}

	public int getEdad() {

		return edad;

	}

	public void setEdad(int edad) {

		this.edad = edad;

	}

	public String mostrarEdad() {
		
		String frase = "";

		if (this.edad < 18) {

			frase = "Menor de edad";

		} else if (this.edad > 17 && this.edad < 65) {

			frase = "Mayor de edad";

		} else {

			frase = "Jubilado";

		}
		
		return frase;

	}

}
