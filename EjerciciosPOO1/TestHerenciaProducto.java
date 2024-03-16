package poo;

public class TestHerenciaProducto {
    public static void main(String[] args) {
        ProductoFresco productoFresco1 = new ProductoFresco("2023-11-30", "A123", "2023-11-25", "España");
        ProductoRefrigerado productoRefrigerado1 = new ProductoRefrigerado("2023-12-15", "B456", "123ABC");
        ProductoCongelado productoCongelado1 = new ProductoCongelado("2024-01-10", "C789", -18.5);

        System.out.println("Información del Producto Fresco:");
        productoFresco1.mostrarInformacion();
        System.out.println("\nInformación del Producto Refrigerado:");
        productoRefrigerado1.mostrarInformacion();
        System.out.println("\nInformación del Producto Congelado:");
        productoCongelado1.mostrarInformacion();
    }
}