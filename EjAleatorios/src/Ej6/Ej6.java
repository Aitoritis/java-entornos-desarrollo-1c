package Ej6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numRandom = (int) (Math.random() * (100 + 1));

		int intentos = 0;

		while (intentos <= 5) {

			System.out.print("Introduce un numero: ");

			int num = sc.nextInt();

			intentos++;

			if (num < numRandom) {

				System.out.println("El numero es mayor");

			} else if (num > numRandom) {

				System.out.println("El numero es menor");

			} else {

				System.out.println("Acertaste");

				break;

			}

		}

		System.out.println("Te quedaste sin intentos");

	}

}
