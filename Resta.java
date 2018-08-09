package operacion;

public class Resta {
	public class resta extends Operacion {	
		
		private float t;
		private char sig;
		private String oper;
		
	 public resta (float numero1, float numero2) {
				super(numero1, numero2);
			}
		
		public float getRes () {
			t = num1 - num2;
			return t;
		}
		public String getOperation() {
			oper="resta";
			return oper;
		}
		public char getSign() {
			sig='-';
			return sig;
		}
	}
}
