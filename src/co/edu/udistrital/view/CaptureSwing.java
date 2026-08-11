package co.edu.udistrital.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class CaptureSwing implements Input {

    @Override
    public double getInfo(String message) {
        String inputString = JOptionPane.showInputDialog(message);
        
        return Double.parseDouble(inputString);
    }
    
}
