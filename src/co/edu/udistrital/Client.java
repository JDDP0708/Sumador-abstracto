/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital;

import co.edu.udistrital.model.Addition;
import co.edu.udistrital.model.Operation;
import co.edu.udistrital.view.AbstractInputOutputFactory;
import co.edu.udistrital.view.ConsoleManufacturer;
import co.edu.udistrital.view.Input;
import co.edu.udistrital.view.Output;

/**
 *
 * @author Estudiantes
 */
public class Client {
    
    AbstractInputOutputFactory abstractFactoryInputOutput;
    Input input;
    Output output;
    Operation operation;

    public Client() {
        this.abstractFactoryInputOutput = new ConsoleManufacturer();
        this.input = this.abstractFactoryInputOutput.getInput();
        this.output = this.abstractFactoryInputOutput.getOutput();
        this.operation = new Addition();
    }
        
    public void send(String message){
        output.showInfo(message);
    }
    
    public double get(){
        return input.getInfo();
    }
    
    public double add(double firstOperand, double secondOperand){
        return operation.execute(firstOperand, secondOperand);
    }
    
    public void setInputOutput(AbstractInputOutputFactory abstractInputOutputFactory) {
        this.abstractFactoryInputOutput = abstractInputOutputFactory;
        updateInputOutput();
    }
    
    private void updateInputOutput(){
        this.input = this.abstractFactoryInputOutput.getInput();
        this.output = this.abstractFactoryInputOutput.getOutput();
    }
    
    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
