package Ej1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Introduce un numero: ");
			
			array[i] = sc.nextInt();
			
		}
		
		for (int i = 9; i >= 0; i--) {
			
			System.out.println(array[i]);
			
		}
		
	}
	
}
