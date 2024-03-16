package poo;

public class Punto {
    private int X;
    private int Y;

    // Constructor
    public Punto(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    // Método para desplazar horizontalmente
    public void moverHorizontal(int cantidad) {
        this.X += cantidad;
    }

    // Método para desplazar verticalmente
    public void moverVertical(int cantidad) {
        this.Y += cantidad;
    }

    // Método para mostrar las coordenadas del punto
    public void mostrar() {
        System.out.println("Punto (" + this.X + "," + this.Y + ")");
    }

}