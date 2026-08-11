/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.view;

/**
 *
 * @author Estudiantes
 */
public class ShowConsole implements Output {
    @Override
    public void showInfo(String message) {
        System.out.println(message);
    }
}
