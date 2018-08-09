package parcial2;

import java.util.Random;

public class Persona {

	private int		Edad;
	private String	Cedula;
	private char	Sexo;
	private char	letraCed;
	private float	Peso;
	private float	Altura;
	private int 	numCed;
	private String Nombre;
	
	public Persona()
	{
		this.Nombre ="";
		this.Edad=0;
		this.Cedula="";
		this.Sexo=' ';
		this.Peso=0;
		this.Altura=0;
	}
	
	public Persona(String Nombre, int Edad, char Sexo) // Constructor Nombre, Edad y Sexo, lo demas 
	{
		this.Nombre=Nombre;
		this.Edad=Edad;
		this.Cedula="";
		this.Sexo=Sexo;
		this.Peso=0;
		this.Altura=0;
	}
	
	public Persona(String Nombre, int Edad, char Sexo, float Peso, float Altura) //Constructor con todos los Atributos
	{
		this.Nombre=Nombre;
		this.Edad=Edad;
		this.Cedula="";
		this.Sexo=Sexo;
		this.Peso=Peso;
		this.Altura=Altura;
	}
	
	public int CalcularIMC() {
		double PI;
		int valor;
		PI=(this.Peso/(Math.pow(this.Altura, 2)));
		if (PI<20)
			valor = -1;
		else if (PI>=20&&PI<=25)
			valor = 0;
		else
			valor = 1;
		return valor;
	}
	
	public boolean esMayordeEdad() {
		if (this.Edad>=18)
			return true;
		else
			return false;
	}
	
	public char comprobarSexo(char Sexo){
		if(Sexo=='H'||Sexo=='h'||Sexo=='M'||Sexo=='m')
			System.out.println("El sexo ingresado es correcto");
		else 
			this.Sexo='H';
		return this.Sexo;
	}
	
	public String generaCedula() {
		Random rng = new Random();
		String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
		this.numCed = rng.nextInt(90000000)+10000000;
	    int modulo = this.numCed % 23;
	    this.letraCed = letrasDNI.charAt(modulo);
	    this.Cedula+=this.numCed;
	    this.Cedula+=this.letraCed;
		return this.Cedula;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre=Nombre;
	}
	
	public void setEdad(int Edad) {
		this.Edad=Edad;
	}
	
	public void setSexo(char Sexo) {
		this.Sexo=Sexo;
	}
	
	public void setPeso(float Peso) {
		this.Peso=Peso;
	}
	
	public void setAltura(float Altura) {
		this.Altura=Altura;
	}
	
	public String toString() {
		String Info;
		Info = ("Nombre:\t"+this.Nombre+"\nEdad:\t"+this.Edad+"\nSexo:\t"+this.Sexo+"\nCedula:\t"+this.Cedula+"\nPeso:\t"+this.Peso+"\nAltura:\t"+this.Altura);
		return Info;
	}

}

