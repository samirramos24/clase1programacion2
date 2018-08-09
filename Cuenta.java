package banco;

import java.text.DecimalFormat;

public class Cuenta {
		
		private String NTitular;
		private String ATitular;
		private double cantidad;
		
		public Cuenta (String NTitular, String ApeTitular, double cantidad) {
			this.NTitular = NTitular;
			this.ATitular = ApeTitular;
			this.cantidad = cantidad;
		}
		
		public void setTitular(String NTitular, String ApeTitular){
			this.NTitular=NTitular;
			this.ATitular=ApeTitular;
		}
		public String getNTitular() {
			return this.NTitular;
		}
		public String getApeTitular() {
			return this.ATitular;
		}
		public void setCantidad(double cantidad) {
			this.cantidad=cantidad;
		}
		public double getCantidad() {
			return this.cantidad;
		}
		public void Ingresar(double cantidad) {
			if (cantidad>=0)
				this.cantidad+=cantidad;
			else
				System.out.println("Ha ingresado una cantidad menor o igual a 0, no se ingresara nada a su cuenta");
		}
		public void Retirar (double cantidad) {
			
			DecimalFormat d = new DecimalFormat("0.00");
			d.setMaximumFractionDigits(2);
			
			if (cantidad>this.cantidad) {
				System.out.println("Ha retirado mas de la cantidad que hay en la cuenta (B/. "+d.format(this.cantidad)+"). Su cuenta quedara en B/. 0.00");
				this.cantidad=0;
			}
			else if (cantidad<=0)
				System.out.println("Ha ingresado una cantidad menor o igual a 0, no se retirara nada de la cuenta");
			else
				this.cantidad-=cantidad;
		}
		public void getString() {
			
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			System.out.println(this.NTitular+" "+this.ATitular+" la cantidad de dinero en su cuenta es de: B/. "+df.format(this.cantidad));
		}
		
}


