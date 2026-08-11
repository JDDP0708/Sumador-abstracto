package co.edu.udistrital.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class CaptureSwing implements Input {

    @Override
    public double getInfo() {
        
        String inputString = JOptionPane.showInputDialog("");
        
        return Double.parseDouble(inputString);
    }
    
}
