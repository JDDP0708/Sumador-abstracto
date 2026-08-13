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
    
    private AbstractInputOutputFactory abstractFactoryInputOutput;
    private Input input;
    private Output output;
    private Operation operation;

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
    
    public double operate(double firstOperand, double secondOperand){
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
