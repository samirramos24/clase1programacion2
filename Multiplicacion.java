package operacion;

public class Multiplicacion {
	public class multiplicacion extends Operacion {	
		
		private float t;
		private char sig;
		private String oper;
		
		
	public multiplicacion (float numero1, float numero2) {
				super(numero1, numero2);
			}
		
		public float getRes () {
			t = num1 * num2;
			return t;
		}
		public String getOperation() {
			oper="multipliación";
			return oper;
		}
		public char getSign() {
			sig='*';
			return sig;
		}
	}
}
