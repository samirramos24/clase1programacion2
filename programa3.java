/*
pide un numero por teclado e indica si el numero es primo o no primo.
 */
package parcial1;

import java.util.Scanner;

public class programa3 {
	 
	    private static Scanner sc;

		public static void main(String[] args) {
	 
	        sc = new Scanner(System.in);
	        
	        System.out.println("Introduce un numero");
	        int num = sc.nextInt();
	 
	        if (num <= 1) {
	            System.out.println("El numero " + num + " no es primo");
	        } else {
	 
	            int raiz = (int) Math.sqrt(num);
	            int contador = 0;
	 
	            for (int i = raiz; i > 1; i--) {
	                if (num % i == 0) {
	                    contador++;
	                }
	            }
	 
	            if (contador < 1) {
	                System.out.println("El numero " + num + " es primo");
	            } else {
	                System.out.println("El numero " + num + " no es primo");
	            }
	 
	        }
	    }
	}