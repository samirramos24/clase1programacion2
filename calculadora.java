/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class calculadora {
    private static String r;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        int a, b, c;
        
        
        System.out.println("Operaciones Matemaicas\n");
        System.out.println("1. suma\n");
        System.out.println("2. resta\n");
        System.out.println("3. multiplicacion\n");
        System.out.println("4. division\n");
        
           System.out.println("elija la operacion que desea realizar de acuerdo a su numero\n");
        opcion = leer.nextInt();
         
         System.out.println("escribar el primer numero\n");
          a = leer.nextInt();
            System.out.println("escriba el segundo numero\n");
            b = leer.nextInt();
            
      
        
     switch(opcion){
             case 1:
                 c = a+b;
                 System.out.println("el resultado es"+c);
                 break;
             case 2:
             c = a-b;
                 System.out.println("el resultado es: "+c);
                 break;
             case 3:
             c = a*b;
                 System.out.println("el resultado es: "+c);
                 break;
             case 4:
             c= a/b;
               System.out.println("el resultado es: " +c);
             break;
             default:
                System.out.println("error"); 
                 break;
             
        
        }
     }
    }

