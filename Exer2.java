import java.util.Scanner;
public class Exer2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.printf("INFORME SEU PESO \n");
		float peso = sc.nextFloat();
		
		System.out.printf("INFORME SUA ALTURA \n");
		float altura = sc.nextFloat();
		float imc = peso/ (altura*altura);
			System.out.printf("SEU IMC É DE %.2f\n", imc);
		
		if (imc < 18.5f) {
			System.out.printf("Magreza \n");
		}
		else if (imc >= 18.5f && imc <= 24.9f){
			System.out.printf("Normal \n");
		}
		else if (imc >= 25.0f && imc <= 29.9f){
				System.out.printf("Sobrepeso, obsidade grau 1\n");
		}
		else if (imc >= 30.0f && imc <= 39.9f){
			System.out.printf("Obesidade, grau 2\n");
		}
		else if (imc > 40.0f){
				 System.out.printf("Obesidade grave, grau 3\n");
		}
		
	}
}
