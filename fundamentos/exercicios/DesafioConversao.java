package fundamentos.exercicios;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o sal�rio do J�o: ");
		String f1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o sal�rio do Z�: ");
		String f2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o sal�rio do Miguel: ");
		String f3 = entrada.nextLine().replace(",", ".");
		
		double s1 = Double.parseDouble(f1);
		double s2 = Double.parseDouble(f2);
		double s3 = Double.parseDouble(f3);
		
		double media = (s1 + s2 + s3)/3;
		System.out.println("A m�dia salarial �: "+ media);
		
		
		
		//System.out.println("frase 1 : "+ f1);
		
	
		entrada.close();
		
		
	}

}
