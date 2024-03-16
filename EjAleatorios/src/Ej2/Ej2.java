package Ej2;

public class Ej2 {

	public static void main(String[] args) {

		String palos[] = { "picas", "corazones", "diamantes", "treboles" };
		
		String picas[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		
		int carta = (int) (Math.random() * 13 + 1);
		
		int palo = (int) (Math.random() * 4 + 1);
		
		System.out.print(picas[carta] + " de ");
		
		System.out.println(" " + palos[palo]);

	}

}
