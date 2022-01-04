package Treino;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AtividadesUdemy {
	static List<String> nome = new ArrayList<>();
		
	public static void main(String[] args) {


		
	
		nome.add("Gleice");
		nome.add("Laura");
		nome.add("Letícia");
		nome.add("Marcos");
		nome.add("Fatima");
		nome.add("Ana");
		nome.add("Maria");
		nome.add(2, "Marcelo"); //Adiciona na posição que eu quiser
		
		for (String names : nome) {

			System.out.println(names);
		}
		
		
		System.out.println(nome.size()); //Tamanho da lista
		
		//nome.remove(2); //ou nome.remove("Marcelo");
		
		/*Esse removeIf remove todos da lista que eu quero que 
		 * comece com determinada letra, se chama de predicado.
		 * pega um valor x (do tipo String) e me retorna se esse
		 * valor é verdadeiro ou falso.
		 * pega x tal que (->) x na posição de charAt 0
		 * seja igual a M
		 * Exclui todas palavras da lista que comece com 
		 * letra M
		 */
		 nome.removeIf(x -> x.charAt(0) == 'M');
		
		
		//Para achar o índice na lista
		System.out.println("Index of Laura: " + nome.indexOf("Laura"));
		
		/*Filtrar na lista tal que todos que comecem
		 * com a letra M apareçam.
		 * pega a lista e converte para stream, chama a função filter
		 * que vai receber um predicado (Uma letra com aspas simples),
		 * esse filter vai me devolver um stream filtrado com esse predicado,
		 * esse stream não é compatível com list, pega ele e converte
		 * ele pra lista. Chama a função collect e coloca entre 
		 * parêntesis Collectors.toList(); 
		 * Resumindo converte para stream, faz a operação
		 * lambda que depois volta ele pra lista.
		 * 
		 */
		
		List<String> result = nome.stream().filter
		(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		
		
		for(String name : result) {
					
			System.out.println(result);
		}
		
		/*String que recebe a lista, converte para stream,
		 * filtra para uma expressão lambda de predicado,
		 * e pergunta se tem S no find firts, se encontrar
		 * retorna o que tem na lista que começa com a letra s
		 * senão retorna null.
		 * 
		 */
		String name = nome.stream().filter
		(x -> x.charAt(0) == 'S').findFirst().orElse(null);
		
		System.out.println(name);
		
		
	}
	
	//Descobrir a posição na lista
	public static Integer kk(int id) {
		for(String num : nome){
			if(nome.contains(id)) {
				return nome.indexOf(num);
			}
		}return null;
	}

}
