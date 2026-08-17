/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class ShowSwing implements Output {

    @Override
    public void showInfo(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
