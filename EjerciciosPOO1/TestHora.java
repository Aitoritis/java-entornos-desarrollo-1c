package poo;

public class TestHora {

   // Método principal para probar la clase
    public static void main(String[] args) {
        Hora hora1 = new Hora(12, 30, 45);
        hora1.mostrarHora(); // Salida: 12:30:45

        Hora hora2 = new Hora(8, 45);
        hora2.mostrarHora(); // Salida: 08:45:00

        Hora hora3 = new Hora(18);
        hora3.mostrarHora(); // Salida: 18:00:00

        // Intentar establecer una hora no válida
        new Hora(25, 70, 80).mostrarHora(); // Salida: Hora no válida. Se mantendrán los valores anteriores.
    }
}
