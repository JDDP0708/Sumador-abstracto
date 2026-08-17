package co.edu.udistrital.model;


/**
 * Clase que representa la suma dentro de las operaciones matematicas
 * 
 * @author Juan David Diaz Perez
 */
public class Addition extends Operation {

    @Override
    public double execute(double a, double b) {
        return a + b;
    }
    
}
