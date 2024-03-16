/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

class ProductoRefrigerado extends Producto {
    private String codigoSupervision;

    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String codigoSupervision) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervision = codigoSupervision;
    }

    public String getCodigoSupervision() {
        return codigoSupervision;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Código de Supervisión: " + codigoSupervision);
    }
}
