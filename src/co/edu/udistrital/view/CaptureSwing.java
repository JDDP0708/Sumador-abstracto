package co.edu.udistrital.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class CaptureSwing implements Input {

    @Override
    public String getInfo() {
        
        String inputString = JOptionPane.showInputDialog("");
        
        return inputString;
    }
    
}
