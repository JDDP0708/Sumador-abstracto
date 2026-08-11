/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udistrital;

import co.edu.udistrital.model.Addition;
import co.edu.udistrital.model.Operation;
import co.edu.udistrital.view.AbstractInputOutputFactory;
import co.edu.udistrital.view.Input;
import co.edu.udistrital.view.Output;
import co.edu.udistrital.view.SwingManufacturer;

/**
 *
 * @author Estudiantes
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AbstractInputOutputFactory abstractFactoryInputOutput = new SwingManufacturer();

        Input input = abstractFactoryInputOutput.getInput();
        Output output = abstractFactoryInputOutput.getOutput();
        Operation operation = new Addition();

        output.showInfo("Bienvenidos al sumador a continuacion se pediran los datos.");

        output.showInfo("Escriba el primer operando");
        double firstOperand = input.getInfo();
        output.showInfo("Escriba el segundo operando");
        double secondOperand = input.getInfo();

        double result = operation.execute(firstOperand, secondOperand);

        output.showInfo("El resultado de la suma es: " + result);
        output.showInfo("Gracias por usar el sumador.");
    }

}
