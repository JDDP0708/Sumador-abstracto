package co.edu.udistrital.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Estudiantes
 */
public class CaptureFile implements Input {

    private BufferedReader br;

    public CaptureFile() {
        try {
            br = new BufferedReader(new FileReader("input.txt"));
        } catch (IOException e) {
            System.err.println("Error al abrir el archivo de entrada: " + e.getMessage());
        }
    }

    @Override
    public String getInfo() {
        try {
            if (br != null) {
                return br.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return null;
    }
}
