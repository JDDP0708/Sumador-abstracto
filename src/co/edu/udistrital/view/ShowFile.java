package co.edu.udistrital.view;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Estudiantes
 */
public class ShowFile implements Output {

    private BufferedWriter writer;

    public ShowFile() {
        try {
            writer = new BufferedWriter(new FileWriter("output.txt"));
        } catch (IOException e) {
            System.err.println("Error al crear el archivo de salida: " + e.getMessage());
        }
    }

    @Override
    public void showInfo(String message) {
        try {
            if (writer != null) {
                writer.write(message);
                writer.newLine(); 
                writer.flush();  
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
