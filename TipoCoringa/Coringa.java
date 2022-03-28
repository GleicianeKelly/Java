package TipoCoringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coringa {
	public static void main (String args[]) {
		
		
		List<Integer> list = Arrays.asList(1, 2, 3);
		
		printList(list);
		
		
	}
	
	/*
	 * Não é possível adicionar dados numa lista no método
	 * do tipo coringa pq a lista é de qualquer tipo
	 * e o compilador não sabe de qual tipo é a lista.
	 */
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	
	
	
	
}
