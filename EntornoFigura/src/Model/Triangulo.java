package Model;

import java.util.*;

public class Triangulo {

    public double base;
    public double altura;
	
    /**
     * Default constructor
     */
	
    public Triangulo() {
    	
    	this.base = 1;
    	this.altura = 1;
    	
    }

    /**
     * @param double
     */
    
    public void setBase(double base) {

    	this.base = base;
    	
    }
    
    public double getBase() {

        return this.base;
        
    }

    /**
     * @param base 
     * @param altura
     */
    
    public double area(double base, double altura) {

    	double area = (base * altura) / 2;
    	
    	return area;
    	
    }

}