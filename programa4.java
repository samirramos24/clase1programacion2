	        /*
	        Pedir numeros al usuario cuando meta un -1 se terminara el programa.
	       al terminar mostrara lo siguiente:
	       -mayor numero indroducido
	       -menor numero introducido
	       -suma de todos los numeros
	       -suma de los numeros positivos
	       -suma de los numeros negativos
	       -media de la suma(la primera que se pide)
	       el numero -1 no cotara como numero.
	        */
package parcial1;

   import java.util.Scanner;

	       public class programa4{
	       	 
	       		private static Scanner sn;

				public static void main(String[] args) {
	       		  
	       		       int num = 0;
	       	        int menor = 0;
	       	        int mayor = 0;
	       	        int sum = 0, sumpo = 0, sumne = 0;
	       	        double med = 0;
	       	        int cont = -1;
	       	         int i = 0;
					
	       	     sn = new Scanner(System.in);
	       	  
		            do{ 
	       		            if (menor != 0 && mayor != 0) {
	       		                if (num > mayor) {
	       		                    mayor = num;
	       		                }
	       		                if (num < menor) {
	       		                    menor = num;
	       		               } 
	       		         }  else {
	       		                menor = num;
	       		                mayor = num;
	       		            }
	       		            
	       		         sum+=num;
	       		         
	       		         if(num>=0){
	       	                sumpo+=num;
	       	            }else{
	       	                sumne+=num;
	       	            }
		            
	       	           cont++;
	       	        i++;
	       	           System.out.print( i+ " Ingrese un numero: ");
		       		num = sn.nextInt();
		            
		            } while(num!=-1);
	       	 
		            med = (double) sum / cont;
	       		
	       	        System.out.println("El mayor numero ingresado fue: "+mayor);
	       	        System.out.println("El menor numero ingresado fue: "+menor);
	       	        System.out.println("La suma de todos los numeros es: "+sum);
	       	        System.out.println("La suma de los numeros positivos es: "+sumpo);
	       	        System.out.println("La suma de los numeros negativos es: "+sumne);
	       	        System.out.println("La media de la primera suma es: "+med);
	       		
	       	 
	       		}
}