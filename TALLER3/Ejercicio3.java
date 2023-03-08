
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Ejercicio3 {
    public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor ingrese el primer numero: ");
        int numero1 = entrada.nextInt();
        
        System.out.print("Por favor ingrese el segundo numero: ");
        int numero2 = entrada.nextInt();
        if (numero2!=0){
            System.out.print(numero1/numero2);
        }
        else {
            System.out.println("No se puede dividir por 0 ");
        }
    }
}
