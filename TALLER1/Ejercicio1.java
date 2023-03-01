/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               String Nombre ="";
                  
               if (args.length ==1){
                   Nombre = args [0];
               }
               
               if (Nombre.equals(Nombre)){
                  Scanner lecturaTeclado = new Scanner (System.in);
                  System.out.print("Introduzca su nombre:");
                  Nombre = lecturaTeclado.nextLine();
               }
               if (!Nombre.isEmpty()){
                   System.out.print("el nombre" +  Nombre + "invertida es: " + InvertirNombre(Nombre));
               } else {
                   System.out.println("No ha ingresado el nombre");
               }
        
    }
    //
    public static String InvertirNombre(String Nombre){
        String NombreInvertida ="";
        for (int x = Nombre.length()-1; x>= 0; x--){
               NombreInvertida = NombreInvertida + Nombre.charAt(x);}
        
        return NombreInvertida;
    
    }         
}