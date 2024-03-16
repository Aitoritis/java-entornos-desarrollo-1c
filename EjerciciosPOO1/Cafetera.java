package poo;

public class Cafetera {
    private final int capacidadMaxima;
    private int cantidadActual;

    // Constructor
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    // Método para echar café
    public void echarCafe(int cantidad) {
        if (cantidad > 0) {
            if (cantidad + this.cantidadActual <= this.capacidadMaxima) {
                this.cantidadActual += cantidad;
            } else {
                // Si la cantidad excede la capacidad, llenar la cafetera completamente
                this.cantidadActual = this.capacidadMaxima;
                System.out.println("La cafetera se ha llenado completamente. Se desecha el sobrante.");
            }
        }
    }

    // Método para llenar la cafetera
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
        System.out.println("La cafetera se ha llenado completamente.");
    }

    // Método para vaciar la cafetera
    public void vaciarCafetera() {
        this.cantidadActual = 0;
        System.out.println("Se ha vaciado la cafetera.");
    }

    // Método para servir una taza
    public void servirTaza(int capacidadTaza) {
        if (capacidadTaza > 0 && capacidadTaza <= this.cantidadActual) {
            this.cantidadActual -= capacidadTaza;
            System.out.println("Se ha servido una taza de " + capacidadTaza + " cc de café.");
        } else {
            System.out.println("No hay suficiente café para servir la taza solicitada.");
        }
    }
    // Método para mostrar la cantidad de café
    public void cantidadCafe() {
        System.out.println("Queda " + this.cantidadActual + " cc de café en la cafetera.");
    }


}
