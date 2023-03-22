/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.ejerciciosdelparcial;

import java.util.Scanner;

/**
 *
 * @author LunaYurainy
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce el tiempo en segundos: ");
        int tiempoEnSegundos = input.nextInt();
        
        int dias = tiempoEnSegundos / 86400;
        int horas = (tiempoEnSegundos % 86400) / 3600;
        int minutos = ((tiempoEnSegundos % 86400) % 3600) / 60;
        int segundos = ((tiempoEnSegundos % 86400) % 3600) % 60;
        
        System.out.println(tiempoEnSegundos + " segundos son:");
        System.out.println(dias + " dias, " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
        
        input.close();
        
    }
}      
 