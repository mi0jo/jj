public class LacoRepeticao {
	public static void main (String args[]){
		//laço de repetição contado - usado para executar algo um determinado numero de vezez
		// 1 condição: inicialização de variavel
		// 2 condição: saida - ate quando o laço dev ser executado 
		// 3 condição: incremento da variavel
		
		for (int i=0; i<10; i=i+3) {
			System.out.printf("i=%d\n", i);
			}
	 // exemplo while
	 boolean status = true;
	 
	 // variavel de controle para a condição de saida 
	 int i=0;
	 while (status == true){
		 System.out.printf("Executando o laço de repetição while pela %d vez\n", i);
		 
		 // criando uma condição de saida pro laço de repetição 
		 if (i==100)
			status = false;
			i++;
	 }
	}
	
}
