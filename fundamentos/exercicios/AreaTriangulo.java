package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[] args) {
		
		System.out.println("Digite a base do Tri�ngulo: ");
		Scanner entrada = new Scanner (System.in);
		double base = entrada.nextDouble();
		
		System.out.println("Digite a altura do Tri�ngulo: ");
		double altura = entrada.nextDouble();
		double area = (base * altura) / 2;
		System.out.println("�rea do Tri�ngulo: " + area);
		
		entrada.close();
		
		
	}

}
