package poo;

public class CocheDeportivo extends Coche {
    int velocidadMaxima;
    double aceleracion;
    String tipoMotor;

    public CocheDeportivo(int velocidadMaxima, double aceleracion, String tipoMotor, String color, double anchura, double altura, int numPuertas, boolean estaArrancado, int gasolina) {
        super(color, anchura, altura, numPuertas, estaArrancado, gasolina);
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracion = aceleracion;
        this.tipoMotor = tipoMotor;
    }

    

    public void mostrarInformacionCocheDeportivo() {
        super.toString();
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Aceleración (0-100 km/h): " + aceleracion + " segundos");
        System.out.println("Tipo de Motor: " + tipoMotor);
    }
}

