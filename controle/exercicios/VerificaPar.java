package controle.exercicios;

import java.util.Scanner;

public class VerificaPar {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um n�mero de 0 a 10: ");
		int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			System.out.println("ok...n�mero v�lido");
			
			if(numero % 2 == 1 )
				System.out.printf("%d � �mpar", numero);
			else
				System.out.printf("%d � par", numero);
				
			
		}
		else
			System.out.println("N�mero inv�lido!!");
		

		entrada.close();
	}

}
