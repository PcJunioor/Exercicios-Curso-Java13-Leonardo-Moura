package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Voc� precisa digitar as palavras m�gicas: ");
			System.out.println("quer Sair? ");
			texto = entrada.nextLine();
						
		} while (!texto.equalsIgnoreCase("POR FAVOR"));
		
		System.out.println("saindo...");

		entrada.close();
		
	
	}

}
