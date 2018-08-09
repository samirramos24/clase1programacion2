package banco;

import java.util.Locale;
import java.util.Scanner;

public class caja {
 
		private static Scanner scanner;

	public static void main(String[] args) {
		
		String Nom = " ",continuar, Ape = " " ;
		int sel = 0;
		double cantidad = 0;
		
		Cuenta MC = new Cuenta (Nom, Ape, cantidad);
		scanner = new Scanner(System.in);
		Scanner scan = scanner.useLocale(Locale.US);
		
		do {
		System.out.println("Programa que maneja una cuenta de banco\n");
		System.out.print("¿Que desea realizar?\n1. Inicializar Cuenta\n2. Ingresar dinero a la cuenta\n3. Retirar dinero de la Cuenta\n4. Mostrar la Informacion de la Cuenta\n\nSeleccione: ");
		sel = scan.nextInt();
		switch(sel) {
		case 1:
			System.out.print("\nIngrese el nombre y apellido del portador de la Cuenta: ");
			Nom = scan.next();
			Ape = scan.next();
			MC.setTitular(Nom, Ape);
			System.out.print("Ingrese el valor que posee la cuenta: ");
			cantidad = scan.nextDouble();
			MC.setCantidad(cantidad);
			break;
		case 2:
			if (Nom.equals(" ") && Ape.equals(" ")&& cantidad==0)
				System.out.println("No ha inicializado la cuenta");
			else {
				System.out.print("\nIngrese la cantidad a ingresar a la cuenta: ");
				cantidad = scan.nextDouble();
				MC.Ingresar(cantidad);
				}
			break;
		case 3:
			if (Nom.equals(" ") && Ape.equals(" ")&& cantidad==0)
				System.out.println("No ha inicializado la cuenta");
			else {
				System.out.print("\nIngrese la cantidad a retirar de la cuenta: ");
				cantidad = scan.nextDouble();
				MC.Retirar(cantidad);
				}
			break;
		case 4:
			if (Nom.equals(" ") && Ape.equals(" ")&& cantidad==0)
				System.out.println("No ha inicializado la cuenta");
			else {
			Nom = MC.getNTitular();
			Ape = MC.getApeTitular();
			cantidad = MC.getCantidad();
			MC.getString();
			}
			break;
		default:
			System.out.println("Seleccion Invalida");
			break;
		}
		System.out.print("\n¿Desea regresar al menu? (S/N): ");
		continuar=scan.next();
		} while (continuar.equals("S")||continuar.equals("s")||continuar.equals("Si")||continuar.equals("si")||continuar.equals("SI")||continuar.equals("sI"));
		scan.close();
		
	}


	}


