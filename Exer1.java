import java.util.Scanner;
public class Exer1{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("INFORME SEU SEXO: \n");
        String sexo = sc.nextLine();
        
        System.out.printf("INFORME SUA ALTURA: \n");
        float altura = sc.nextFloat();
        float peso = 0;
        
        if (sexo.equalsIgnoreCase ("M")){
            peso = (72.7f * altura)-58f;
            System.out.printf("SEU PESO IDEAL É DE %.2f", peso);
        }
        else if (sexo.equalsIgnoreCase ("f")){
            peso = (62.1f *altura)-44.7f;
            System.out.printf ("SEU PESO IDEAL É DE %.2f", peso);
        }
    }
}
