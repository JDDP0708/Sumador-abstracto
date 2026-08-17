package co.edu.udistrital;

import co.edu.udistrital.view.ConsoleManufacturer;
import co.edu.udistrital.view.FileManufacturer;
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

        Client client = new Client();

        client.setInputOutput(new SwingManufacturer());

        client.send("Bienvenidos al multiplicador, se pediran en orden el numero a multiplicar y por que entero hacerlo");

        double result = client.multiplicate(Double.parseDouble(client.get()), Integer.parseInt(client.get()));

        client.send("El resultado de la multiplicacion es: " + result);
        client.send("Gracias por usar el multiplicador.");
    }

}
