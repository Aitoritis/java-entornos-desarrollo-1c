package Model;

import java.util.*;

public class Circulo {
	
    public double radio;

    /**
     * Default constructor
     */
	
    public Circulo() {
    	
    	this.radio = 1;
    	
    }
    

    /**
     * @param radio
     */
    
    public void setRadio(double radio) {
    	
    	this.radio = radio;
    	
    }

    public double getRadio() {

        return this.radio;
        
    }

    /**
     * @param radio
     */
    
    public double area(double radio) {
    	
    	double area = 3.14 * (radio * radio);
    	
		return area;
    	
    }
    
    public double perimetro(double radio) {
    	
    	double perimetro = 2 * 3.14 * radio;
    	
    	return perimetro;
    	
    }

}