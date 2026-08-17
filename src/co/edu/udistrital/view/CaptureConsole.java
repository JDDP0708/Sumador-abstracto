package co.edu.udistrital.view;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Estudiantes
 */
public class CaptureConsole implements Input {

    private final Scanner sc;

    public CaptureConsole() {
        sc = new Scanner(System.in);
    }
    
    @Override
    public String getInfo() {
        String data = sc.nextLine();
        return data;
    }
}
