
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Ejercicio1 {
   public static void main(String[] args) {
        
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor ingrese el primer numero: ");
        int numero1 = entrada.nextInt();
        
        System.out.print("Por favor ingrese el segundo numero: ");
        int numero2 = entrada.nextInt();
        
        if (numero1 > numero2) {
            System.out.println("El numero " + numero1 + " es mayor que el numero " + numero2);
        } 
       
else if (numero1 < numero2) {
            System.out.println("El numero " + numero2 + " es mayor que el numero " + numero1);
        } 
       
else {
            System.out.println( "Los numeros " + numero1 + " y " + numero2 + " son iguales");
    }


   }
}