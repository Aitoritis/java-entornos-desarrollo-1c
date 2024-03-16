package Ej5;

public class Ej5 {

	public static void main(String[] args) {

		int numMayor = 0;
		int numMenor = 0;
		int suma = 0;
		int num = 0;

		for (int i = 0; i < 50; i++) {

			num = (int) (Math.floor (Math.random() * (100 - 199 + 1)) + 199);

			System.out.print(num + " ");

			if (num > numMayor) {

				numMayor = num;

			}

			if (i == 0) {

				numMenor = num;

			}

			if (num < numMenor) {

				numMenor = num;

			}
			
			suma += num;

		}
		
		
		
		System.out.println();
		
		System.out.println("\nEl número mayor es " + numMayor);
		
		System.out.println("\nEl número menor es " + numMenor);
		
		System.out.println("\nLa media es " + suma / 50);

	}

}
