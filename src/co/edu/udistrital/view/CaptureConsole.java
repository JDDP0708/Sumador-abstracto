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
public class CaptureConsole {

    private final Scanner sc;

    public CaptureConsole() {
        sc = new Scanner(System.in);
    }
    
    public String readInfo(String message) {
        System.out.print(message + ": ");
        String data = sc.nextLine();
        
        System.out.println("");
        return data;
    }
}
