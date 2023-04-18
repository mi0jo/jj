public class Exer3 {
	public static void main (String [] args) {
			
			float cAltura = 0.80f;
			float jAltura = 0.60f;
			int a = 0;
			
			while (jAltura <= cAltura) {
				jAltura = jAltura + 0.09f;
				cAltura = cAltura + 0.06f;
				a = a + 1;
			}
	 System.out.printf("Serão necessários %d anos para Juca ser maior que Chico", a);
	}
}
