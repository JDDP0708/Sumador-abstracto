/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.view;

/**
 *
 * @author Estudiantes
 */
public class FileManufacturer implements AbstractInputOutputFactory {

    @Override
    public Input getInput() {
        return new CaptureFile();
    }

    @Override
    public Output getOutput() {
        return new ShowFile();
    }
    
}
