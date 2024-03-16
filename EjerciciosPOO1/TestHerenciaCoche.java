package poo;

public class TestHerenciaCoche {
    public static void main(String[] args) {
        CocheDeportivo cocheDeportivo = new CocheDeportivo(10, 4.5,"v8","rojo", 4.5, 2.4, 3, true, 100);
        CocheFamiliar cocheFamiliar = new CocheFamiliar("Toyota", "Camry", 5, true);
        System.out.println("Información del Coche Deportivo:");
        cocheDeportivo.mostrarInformacionCocheDeportivo();

        System.out.println("\nInformación del Coche Familiar:");
        cocheFamiliar.mostrarInformacionCocheFamiliar();
    }
}
