/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.model.Operation;
import co.edu.udistrital.view.CaptureConsole;
import co.edu.udistrital.view.ShowConsole;

/**
 *
 * @author Estudiantes
 */
public class Controller {
    
   private final CaptureConsole captureConsole;
   private final ShowConsole showConsole;
   private final Operation operation;

    public Controller(CaptureConsole captureConsole, ShowConsole showConsole, Operation operation) {
        this.captureConsole = captureConsole;
        this.showConsole = showConsole;
        this.operation = operation;
    }
   
   public void run(){
       
       showConsole.showInfo("Bienvenidos al sumador a continuacion se pediran los datos.");
       
       double firstOperand = Double.parseDouble(captureConsole.readInfo("Escriba el primer operando"));
       double secondOperand = Double.parseDouble(captureConsole.readInfo("Escriba el primer operando"));
       
       double result = operation.execute(firstOperand, secondOperand);
       
       showConsole.showInfo("El resultado de la suma es: " + result);
       showConsole.showInfo("Gracias por usar el sumador.");
   }
}
