/*
 lee un numero por teclado que pida el precio de un producto(puede tener decimales)
y caclcule el precio final con IVA. el IVA sera una constante que sera del 21%.
 */
package parcial1;

import java.util.Scanner;

public class parcial1prog2 {

    private static Scanner sc;

	public static void main(String[] args) {
    	 sc = new Scanner(System.in);
        
        double a, b;
        double IVA = 0.21;
        
        System.out.println("introduzca el precio del producto");
       a = sc.nextDouble();
        
        b = a + a * IVA;
         System.out.println("Precio + el IVA es: " +b);
        
    }
}
