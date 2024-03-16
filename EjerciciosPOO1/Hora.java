package poo;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor que permite construir la hora indicando los tres atributos
    public Hora(int horas, int minutos, int segundos) {
        if (esHoraValida(horas, minutos, segundos)) {
            this.horas = horas % 24;
            this.minutos = minutos % 60;
            this.segundos = segundos % 60;
        } else {
            System.out.println("Hora no válida. Se mantendrán los valores anteriores.");
        }
    }

    // Constructor que permite construir la hora indicando solo las horas y los minutos
    public Hora(int horas, int minutos) {
        this(horas, minutos, 0);
    }

    // Constructor que permite construir la hora indicando solo las horas
    public Hora(int horas) {
        this(horas, 0, 0);
    }

    // Método para mostrar la hora en un momento dado
    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d%n", this.horas, this.minutos, this.segundos);
    }

    // Método auxiliar para validar la hora
    private boolean esHoraValida(int horas, int minutos, int segundos) {
        return horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60;
    }

}
