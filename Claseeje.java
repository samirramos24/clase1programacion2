package parcial2;

import java.util.Scanner;

public class Claseeje {

	public static void main(String[] args) {
		String Nombre;
		int Edad, i, PI[];
		boolean ME[];
		ME = new boolean[4];
		PI = new int[4];
		float Peso, Altura;
		char Sexo;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		Nombre = scan.next();
		System.out.print("Ingrese su edad: ");
		Edad = scan.nextInt();
		System.out.print("Ingrese su sexo (H/M): ");
		Sexo = scan.next(".").charAt(0);
		System.out.print("Ingrese su Peso (kg): ");
		Peso = scan.nextFloat();
		System.out.print("Ingrese su Altura (m): ");
		Altura = scan.nextFloat();
		
		
		Persona P1 = new Persona(Nombre, Edad, Sexo, Peso, Altura);
		Persona P2 = new Persona(Nombre, Edad, Sexo);
		Persona P3 = new Persona ();
		
		P1.generaCedula();
		P2.generaCedula();
		P3.generaCedula();
		
		P3.setNombre("Juana");
		P3.setEdad(15);
		P3.setSexo('M');
		P3.setPeso((float) 54.12);
		P3.setAltura((float) 1.49);
		
		PI[1]=P1.CalcularIMC();
		PI[2]=P2.CalcularIMC();
		PI[3]=P3.CalcularIMC();
		
		i=1;
		System.out.println("\nPeso de las personas:");
		while (i<=3) {
			if (PI[i]==-1)
				System.out.println("La persona "+i+" esta por debajo de su peso ideal");
			else if (PI[i]==1)
				System.out.println("La persona "+i+" esta en sobrepeso");
			else if (PI[i]==0)
				System.out.println("La persona "+i+" esta en su peso ideal");
			i++;
		}
		
		ME[1]=P1.esMayordeEdad();
		ME[2]=P2.esMayordeEdad();
		ME[3]=P3.esMayordeEdad();
		
		i=1;
		System.out.println("\nMayoria de edad de las personas:");
		while (i<=3) {
			if (ME[i]==true)
				System.out.println("La persona "+i+" es mayor de edad");
			else if (ME[i]==false)
				System.out.println("La persona "+i+" es menor de edad");
			i++;
		}
	
		System.out.println("\nPersona 1:\n"+P1.toString());
		System.out.println("\nPersona 2:\n"+P2.toString());
		System.out.println("\nPersona 3:\n"+P3.toString());
		
		scan.close();
	}

}