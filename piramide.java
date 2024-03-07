

package com.mycompany.ejercicio2;


public class piramide {

    public static void main(String[] args) {
  
     
        int a =10;


        for (int altura = 1; altura <= a; altura++) {
        
            for (int blancos = 1; blancos <= a - altura; blancos++) {
                System.out.print(" ");
            }
          
            for (int asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
    }
}
}