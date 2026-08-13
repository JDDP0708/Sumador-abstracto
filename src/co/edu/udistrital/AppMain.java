/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udistrital;

import co.edu.udistrital.view.ConsoleManufacturer;
import co.edu.udistrital.view.SwingManufacturer;

/**
 *
 * @author Estudiantes
 */
public class AppMain {

    private static void prueba(Client client) {
        client.send("Bienvenidos al sumador a continuacion se pediran los datos.");

        double result = client.operate(Double.parseDouble(client.get()), Double.parseDouble(client.get()));

        client.send("El resultado de la suma es: " + result);
        client.send("Gracias por usar el sumador.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Client client = new Client();

        client.setInputOutput(new SwingManufacturer());

        prueba(client);
        
        client.setInputOutput(new ConsoleManufacturer());
        
        prueba(client);
    }

}
