import java.util.Scanner;
public class Bumbum {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		//1. imprimir um saldo e imprimir o saldo com reajunte de 10%
		
		System.out.printf("Informe seu saldo: ");
		float num = sc.nextFloat();
		System.out.printf("%.3f + 10 por cento = %.2f\n", num, (num*1.1));
		
		
		//2.faça um programa que leia três numeros inteiros, e em seguida calcule a sua media
		System.out.printf("Inoforme a nota 1\n");
		int nota1 = sc.nextInt();
		
		System.out.printf("Inoforme a nota 2\n");
		int nota2 = sc.nextInt();
		
		System.out.printf("Inoforme a nota 3\n");
		int nota3 = sc.nextInt();
		
		float media = (nota1 + nota2 + nota3) /3;
		System.out.printf("A media é %2f", media);
		
		//3.faça um programa que leia três variaveis(representando uma data) e em seguida escreva por extenso
		
		int dia = 4, mes = 4, ano = 2023; //declara de variaveis do  do mesmo tipo na mesma linha
		String data = dia + "de";
		switch (mes) {
			case 1:
				data += "janeiro";
				break; 
			case 2: 
				data += "fevereiro";
				break;
			case 3: 
				data += "março";
				break;
			case 4: 
				data += "abril";
				break;
			case 5: 
				data += "maio";
				break;
			case 6: 
				data += "junho";
				break;
			case 7: 
				data += "julho";
				break;
			case 8: 
				data += "agosto";
				break;
			case 9: 
				data += "setembro";
				break;
			case 10: 
				data += "outubro";
				break;
			case 11: 
				data += "novembro";
				break;
			case 12: 
				data += "dezembro";
				break;
				
				
			
		}
		//conectanto a preposição  de com o valor da variavel ano 
		data += "de" + ano;
		System.out.printf(data);
		
	}
} 
