package br.com.aulaJava;
import java.util.ArrayList;
import java.util.List;

public class PessoaTeste {

	
	static List<Pessoa> listaPessoa = new ArrayList<Pessoa>();	
	public static void main(String[] args) {
		
	
		adicionarItensLista();
		listarItensdaLista();
		
		
	}
	
	
	public static void adicionarItensLista() {
		
		System.out.println("");
		Pessoa pessoaA = new Pessoa();
		Pessoa pessoaB = new Pessoa();
		
		
		pessoaA.setId(1);
		pessoaA.setNome("Pedro");
		pessoaA.setEndereco("Rua das Andradas, 100");
		listaPessoa.add(pessoaA);
		
		pessoaB.setId(2);
		pessoaB.setNome("Maria");
		pessoaB.setEndereco("Rua das Andradas, 250");
		listaPessoa.add(pessoaB);
		
		System.out.println("Processo de inserção na "
				+ "lista executado com sucesso!");
		
		System.out.println(listaPessoa);
		
	}
	
	public static void listarItensdaLista() {
		
		System.out.println(" ");
		
		for(int i = 0; i < listaPessoa.size(); i++) {
			System.out.println("Id: " + listaPessoa.get(i).getId() +
					" Nome: " + listaPessoa.get(i).getNome() + 
					" Endereço: " + listaPessoa.get(i).getEndereco());
		}
		System.out.println("Processo de leitura da lista executado "
				+ "com sucesso! ");
	}
	
	
	
	

}
