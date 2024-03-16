package poo;

public class TestPunto {
// Método principal para probar la clase
   public static void main(String[] args) {
        Punto punto = new Punto(3, 4);
        punto.mostrar(); // Salida: Punto (3,4)

        punto.moverHorizontal(2);
        punto.mostrar(); // Salida: Punto (5,4)

        punto.moverVertical(-3);
        punto.mostrar(); // Salida: Punto (5,1)
    }
}

   
