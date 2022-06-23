package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	// ERROS D�O PQ N�O EST�O SENDO DADOS HETEROG�NEOS
	@SuppressWarnings({ "rawtypes", "unchecked" })
	
	
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		// N�O ACEITA TIPOS PRIMITIVOS (converte para Classe)
		conjunto.add(1.2);  // double -> Double
		conjunto.add(true); //boolean -> Boolean
		conjunto.add(1); //int -> Integer
		conjunto.add('x');
		System.out.println("tamanho: " + conjunto.size());
		conjunto.add('x');
		System.out.println("tamanho: " + conjunto.size());
		System.out.println(conjunto.remove('x'));
		System.out.println("tamanho: " + conjunto.size());
		System.out.println(conjunto.contains(1));
		// OUTRA FORMA DE IMPLEMENTAR O SET
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		
		// UNI�O DE 2 CONJUNTOS
		// conjunto.addAll(nums); 
		
		// INTERSE��O DE 2 CONJUNTOS
		conjunto .retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
		
		
	}

}
