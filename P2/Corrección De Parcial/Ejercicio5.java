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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Ingrese los lados: ");
        int base = sc.nextInt();

        for (int i = 0; i < base; i++) {
            for (int j = 0; j <= i && j < base; j++) {
                System.out.print("* ");
            }
            System.out.println();
    }
    }
}
