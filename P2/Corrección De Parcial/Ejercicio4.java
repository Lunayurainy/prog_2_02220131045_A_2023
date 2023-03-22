/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.ejerciciosdelparcial;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
         System.out.print("ingresa los numeros que quieres ver: ");
        int numeros= entrada.nextInt();
        int fibonacci[]= new int[numeros];
        fibonacci[0]=0;
        fibonacci[1]=1;
        for(int i =0; i<numeros; i++){
            if (i<=1){
                System.out.print(i);
            }else{
                fibonacci[i]= fibonacci[i-1]+fibonacci[i-2];
                 System.out.print(fibonacci[i]);
            }
        }
        
    }
    
}
