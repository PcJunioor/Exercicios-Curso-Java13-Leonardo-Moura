package arrays;

import java.util.Arrays;
import java.util.Scanner;

// CALCULAR MEDIA DE NOTAS DO ALUNO
// QUANTAS NOTAS SER�O INFORMADAS
// cRIAR UM ARRAY COM A QUANTIDADE DE NOTAS
// 2 LA�OS FOR >> 1 P/ARMAZENAR AS NOTAS E OUTRO P/SOMAR TODAS AS NOTAS E APRESENTAR A M�DIA



public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double total = 0;
		System.out.println("Quantidade de notas: ");
		int quantidade = entrada.nextInt();
		double[] notas = new double[quantidade];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Nota %d: ", (i + 1));
			notas[i] = entrada.nextDouble();
			
		}
		
		for(double nota: notas) {
			total += nota; 
		}
		System.out.println("Notas: " + Arrays.toString(notas));
		
		System.out.println("A m�dia �: " + total / quantidade);
		
		entrada.close();
	}

}
