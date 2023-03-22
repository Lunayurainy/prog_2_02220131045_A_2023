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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                        Scanner entrada = new Scanner(System.in);
        boolean añoValido =false;
        int mesValido= 0;
        System.out.print("ingresa un dia: ");
        int dias= entrada.nextInt();
        System.out.print("ingresa un mes: ");
        int mes= entrada.nextInt();
        System.out.print("ingresa un año: ");
        int año= entrada.nextInt();
        if (año%400!=0){
            añoValido=true;
        }else{
            añoValido=false;
        }   
        if (añoValido==true){
            if(mes==1|| mes==3 || mes==5 || mes==8 || mes==10 || mes==12 ){
                mesValido=1;
            } else  if(mes==4|| mes==6 || mes==9 || mes==11 ){
                mesValido=2;
            }else if(mes==2 ){
                mesValido=3;
            }
            if(mes==1){
                if(dias>=1 || dias<=31){
                    System.out.print("la fecha es valida.");

                }
            }else 
            if(mes==2){
                if(dias>=1 || dias<=30){
                    System.out.print("la fecha es valida.");

                }
            }else 
            if(mes==3){
                if(dias>=1 || dias<=28){
                    System.out.print("la fecha es valida.");    
                }
            }
            
        }else{
            if(mes==1|| mes==3 || mes==5 || mes==8 || mes==10 || mes==12 ){
                mesValido=1;
            } else  if(mes==4|| mes==6 || mes==9 || mes==11 ){
                mesValido=2;
            }else if(mes==2 ){
                mesValido=3;
            }
            
            if(mes==1){
                if(dias>=1 || dias<=31){
                    System.out.print("la fecha es valida.");

                }
            }else 
            if(mes==2){
                if(dias>=1 || dias<=30){
                    System.out.print("la fecha es valida.");
                }
            }else 
            if(mes==3){
                if(dias>=1 || dias<=28){
                    System.out.print("la fecha es valida.");
                }
            }
        }
        
        
   
    }
    
}
