package App;

import Model.Rectangulo;

public class mainRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(2, 3);
		
		int area1 = r1.getArea();
		int perimetro2 = r2.getPerimetro();
		
		System.out.println(area1);
		System.out.println(perimetro2);
		
	}

}
