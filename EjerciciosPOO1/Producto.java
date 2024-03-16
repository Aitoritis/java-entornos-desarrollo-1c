
package poo;

class Producto {
    private String fechaCaducidad;
    private String numeroLote;

    public Producto(String fechaCaducidad, String numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void mostrarInformacion() {
        System.out.println("Fecha de Caducidad: " + fechaCaducidad);
        System.out.println("Número de Lote: " + numeroLote);
    }
}