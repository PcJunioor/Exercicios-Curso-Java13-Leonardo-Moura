package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// offer e add adicionam elementos na fila
		// diferen�a � o comportamento quando a fila est� cheia
		fila.add("Ana"); //joga uma exce��o quando ta cheio
		fila.offer("Bia"); //joga false
		fila.offer("Rafael");
		fila.offer("Lucas");
		fila.offer("Joao");
		fila.offer("Bia");
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		
	}

}
