package Modelo;

public abstract class Algoritmos {
	
	/**
	 * Devuelve el sumatorio del numero especificado
	 * 
	 * @param numero 	el numero del que queremos calcular el sumatorio
	 * @return			el sumatorio del numero especificado
	 */
	
	public static int sumatorio(int numero) {
		
		int suma = 0;
		
		if (numero < 0) {
			
			throw new IllegalArgumentException("El número debe ser igual o superior a 0");
			
		}
		
		for (int i = 1; i <= numero; i++) {
			
			suma += i;
			
		}
		
		return suma;
		
	}
	
	public static int factorial(int numero) {
		
		int total = 1;
		
		for(int i = 1; i <= numero; i++) {
			
			total *= i;
			
		}
		
		return total;
		
	}

}
