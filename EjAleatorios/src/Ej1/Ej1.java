package Ej1;

public class Ej1 {

	public static void main(String[] args) {

		int sumaTotal = 0;

		for (int i = 0; i < 3; i++) {

			int dado = (int) (Math.random() * 6 + 1);

			System.out.println(i + 1 + ". " + dado);

			sumaTotal += dado;

		}
		
		System.out.println("La suma total es " + sumaTotal);

	}

}
