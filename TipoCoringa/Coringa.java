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
	 * N�o � poss�vel adicionar dados numa lista no m�todo
	 * do tipo coringa pq a lista � de qualquer tipo
	 * e o compilador n�o sabe de qual tipo � a lista.
	 */
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	
	
	
	
}
