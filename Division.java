package operacion;

public class Division {
	public class division extends Operacion {	
		
		private float t;
		private char sig;
		private String oper;
		
	public division (float numero1, float numero2) {
				super(numero1, numero2);
			}
		
		public float getRes () {
			t = num1 / num2;
			return t;
		}
		public String getOperation() {
			oper="división";
			return oper;
		}
		public char getSign() {
			sig='/';
			return sig;
		}
	}
}
