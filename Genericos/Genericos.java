package Genericos;

import java.util.Scanner;




public class Genericos {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService();
		
		System.out.println("Quantos valores? ");
		int valor = sc.nextInt();
		
		for(int i = 0; i < valor; i++) {
			System.out.println("Digite um número: ");
			int numero = sc.nextInt();
			ps.addValue(numero);
		}
		
		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
		
		
	}
}
