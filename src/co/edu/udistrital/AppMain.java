/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udistrital;

/**
 *
 * @author Estudiantes
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Client client = new Client();

        client.send("Bienvenidos al sumador a continuacion se pediran los datos.");

        client.send("Escriba el primer operando");
        double firstOperand = client.get();
        client.send("Escriba el segundo operando");
        double secondOperand = client.get();

        double result = client.add(firstOperand, secondOperand);

        client.send("El resultado de la suma es: " + result);
        client.send("Gracias por usar el sumador.");
    }

}
