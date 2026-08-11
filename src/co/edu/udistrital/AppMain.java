/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udistrital;

import co.edu.udistrital.controller.Controller;
import co.edu.udistrital.model.Addition;
import co.edu.udistrital.view.CaptureConsole;
import co.edu.udistrital.view.ShowConsole;

/**
 *
 * @author Estudiantes
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller controller = new Controller(new CaptureConsole(), new ShowConsole(), new Addition());
        controller.run();
    }
    
}
