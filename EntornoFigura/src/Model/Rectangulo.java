package Model;
import java.util.*;

/**
 * 
 */
public class Rectangulo {

	private int base;
    private int altura;
	
    /**
     * Default constructor
     */
    
    public Rectangulo(int base, int altura) {

    	this.base = base;
    	this.altura = altura;
    	
    }

    /**
     * @param base 
     * @param altura
     */
    
    public Rectangulo() {

    	this.base = 1;
    	this.altura = 1;
    	
    }

    public void setBase(int base) {

    	this.base = base;
    	
    }

    public int getBase() {

        return this.base;
        
    }

    public void setAltura(int altura) {

    	this.altura = altura;
    	
    }
    
    public int getAltura() {
    	
        return this.altura;
        
    }

    /**
     * @param base 
     * @param altura
     */
    
    public int getArea() {

    	int area = base * altura;
    	
    	return area;
    	
    }

    /**
     * @param base 
     * @param altura
     */
    
    public int getPerimetro() {

    	int perimetro = (2 * base) + (2 * altura);
    	
		return perimetro;
    	
    }

}