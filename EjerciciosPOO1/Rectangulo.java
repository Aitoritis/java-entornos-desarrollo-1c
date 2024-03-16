/* ---------------------------------------------------------------------------
EJERCICIO 1
Crea la clase Rectángulo en JAVA, la cual almacenará la base y la altura (ambos
pueden llevar decimales). Estos atributos serán privados y se pedirán en el 
constructor.
Además, la clase tendrá los métodos necesarios para calcular el área 
(base*altura),el perímetro (2*(b+h)) del rectángulo. Ambos métodos devuelven el
valor calculado. 
------------------------------------------------------------------------------*/
package poo;

 public class Rectangulo {
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return base * altura;
    }

    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Método para representar la información del rectángulo en texto
    public String mostrarRectangulo() {
        return "Rectángulo con base " + base + " y altura " + altura + "\nÁrea: " + calcularArea() + "\nPerímetro: " + calcularPerimetro();
    }
}
