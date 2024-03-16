
package poo;

class CocheFamiliar extends Coche {
    int capacidadPasajeros;
    boolean tieneMaletero;

    public CocheFamiliar(String marca, String modelo, int capacidadPasajeros, boolean tieneMaletero) {
        super(modelo, capacidadPasajeros, capacidadPasajeros, capacidadPasajeros, tieneMaletero, capacidadPasajeros);
        this.capacidadPasajeros = capacidadPasajeros;
        this.tieneMaletero = tieneMaletero;
    }

    public void mostrarInformacionCocheFamiliar() {
        super.toString();
        System.out.println("Capacidad de Pasajeros: " + capacidadPasajeros);
        System.out.println("Tiene Maletero Grande: " + (tieneMaletero ? "Sí" : "No"));
    }
}

