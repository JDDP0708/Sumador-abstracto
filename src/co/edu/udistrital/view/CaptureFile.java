/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Estudiantes
 */
public class CaptureFile implements Input {

    @Override
    public String getInfo() {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            return br.readLine();    
        } catch (IOException e) {
            return null;
        }
    }
    
}
