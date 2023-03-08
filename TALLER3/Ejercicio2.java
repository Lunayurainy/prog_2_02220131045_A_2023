
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Ejercicio2 {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble(); 
        
        if(num%2==0){
            System.out.print(num + " es par");
        }else {
            System.out.print(num + " es impar");
        }
   }
}
