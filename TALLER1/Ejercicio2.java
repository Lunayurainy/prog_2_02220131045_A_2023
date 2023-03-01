
 package ejercicio.pkg2;
import java.util.*;
import java.util.Random;
import java.lang.*;
import java.io.*;





public class Ejercicio2 {
    
    static double studentCode = 10 , moda = 0;
    static ArrayList<Double> codes = new ArrayList<Double>();
    static int valueModa = 0;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
          double i = 0, total = 0 ;

          
          Random rnd = new Random();
            while(i < studentCode ) {
            double random = rnd.nextDouble(studentCode);
            double roundDbl = Math.round(random*100)/100;
            total += roundDbl;
            codes.add(roundDbl);
           
            i++;
    }
    
    HashMap m = validateData(codes);
    getModa(m);
    System.out.println("PROMEDIO.......... "+ total/studentCode); 
    System.out.printf("LA MODA ES %s PORQUE SE REPITE %d veces", Double.toString(moda) , valueModa);
              
              
       
    }
    
    private static HashMap validateData(ArrayList<Double> codes){
    HashMap<Double, Integer> m = new HashMap<>();
       for (double code: codes){			
           if (m.containsKey(code))					
            m.put(code,m.get(code)+1);
           else
            m.put(code,1);			
          }
          return m;
    }
    
    private static void  getModa(HashMap<Double, Integer> mapa){
        for (HashMap.Entry<Double, Integer> code : mapa.entrySet()) {
          if (code.getValue() > valueModa) {
            valueModa = code.getValue();
            moda = code.getKey();
          }
        }
    }
}