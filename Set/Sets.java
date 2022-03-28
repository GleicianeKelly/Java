package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main (String args[]) {
	
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		//União
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//Intersecção(Apenas os em comum)
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		
		//Diferença (Exclui os em comum) 
		Set<Integer> e = new TreeSet<>(a); 
		e.removeAll(b);
		System.out.println(e);
		
		//HashSet não ordena na lista porém é mais rápido
		Set<String> set = new HashSet<>();
		//Ordena na lista
		Set<String> set1 = new TreeSet<>();
		/*
		 * Velocidade intermediária e os elementos
		 * ficam na ordem em que são adicionados
		 */
		Set<String> set3 = new LinkedHashSet<>();
		
		set.add("Gleice");
		set.add("kelly");
		set.add("Marcelo");
		
		System.out.println(set.contains("Gleice"));
		
		set.removeIf(x -> x.length() <= 5);
		
		set.removeIf(x -> x.charAt(0) == 'M');
		
		for(String p : set) {
			System.out.println(p);
		}
		
		
	}
	
}
