package poo;

public class TestCafetera {

          // Método principal para probar la clase
    public static void main(String[] args) {
        Cafetera miCafetera = new Cafetera();
        miCafetera.cantidadCafe(); // Salida: Queda 0 cc de café en la cafetera

        miCafetera.echarCafe(500);
        miCafetera.cantidadCafe(); // Salida: Queda 500 cc de café en la cafetera

        miCafetera.llenarCafetera();
        miCafetera.cantidadCafe(); // Salida: Queda 1000 cc de café en la cafetera

        miCafetera.servirTaza(300);
        miCafetera.cantidadCafe(); // Salida: Queda 700 cc de café en la cafetera

        miCafetera.vaciarCafetera();
        miCafetera.cantidadCafe(); // Salida: Queda 0 cc de café en la cafetera
    }

}
