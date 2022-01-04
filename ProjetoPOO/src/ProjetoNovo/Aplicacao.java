package ProjetoNovo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
public class Aplicacao {
	
	static List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
		
		int opcao = 0;
		
		while(true) {
			
			System.out.println("**Cadastro de pessoas **");
			System.out.println("Digite 1 para cadastrar pessoa");
			System.out.println("Digite 2 para remover pessoa");
			System.out.println("Digite 3 para consultar pessoa");
			System.out.println("Digite 4 para posicao na lista");
			System.out.println("Digite 5 para listar pessoas");
			System.out.println("Digite 0 para sair");
			opcao = ler.nextInt();
			
			switch(opcao) {
			
			case 0:
				System.out.println("Programa encerrado!!");
				break;		
			case 1:
				armazenarPessoa();
				break;
			case 2:
				removerPessoa();
				break;
			case 3:
				consultarPessoa();
				break;
			case 4:
				posicaoNaLista();
				break;
			case 5:
				listarPessoas();
				break;
			default:
				System.out.println("Digite um número válido!!");
				break;			
			}
			
			
		}
		
		
	}
	
	public static Pessoa pesquisarPessoa(int id) {
		for(Pessoa pessoa : listaPessoa) {
			if(pessoa.getId()== id) {
				return pessoa;
			}
		}
		return null;
	}
	public static int encontrarPosicao(Pessoa posicaoEncontrada) {
		if(listaPessoa.contains(posicaoEncontrada)) {
			return listaPessoa.indexOf(posicaoEncontrada);
		}
		return 0;		
	}
	
	public static void armazenarPessoa(){
		System.out.println("**Armazenar pessoa**");
		
		while(true) {
			String nome;
			int idade;
			float altura;
			int id = 0;
			String opcao;
			
			try {
				System.out.println("Digite o Id: ");
				id = ler.nextInt();
				ler.nextLine();
			}
			catch(Exception e) {
				System.out.println("Digite um número válido!!");
			}
			
			Pessoa pessoaEncontrada = pesquisarPessoa(id);
			
			if(pessoaEncontrada != null) {
				System.out.println("Pessoa já cadastrada");
				return;
			}
			
			System.out.println("Digite o nome: ");
			nome = ler.nextLine();
			try {
				System.out.println("Digite a idade: ");
				idade = ler.nextInt();
			}
			catch(Exception e){
				System.out.println("Digite um número válido!");
				ler.nextLine();
				continue;
			}
			try {
				System.out.println("Digite a altura: ");
				System.out.println("Ex: 1,67");
				altura = ler.nextFloat();
			}
			catch(InputMismatchException erro){
				System.out.println("Digite uma altura válida!! ");
				ler.nextLine();
				continue;
			}
			
			Pessoa pessoa = new Pessoa(id, nome, idade, altura);
			
			listaPessoa.add(pessoa);
			
			System.out.println(listaPessoa);
			
			System.out.println("Deseja sair? S ou N");
			opcao = ler.next();
			
			if(opcao.equalsIgnoreCase("s")) {
				System.out.println("Cadastro finalizado!!");
				return;
			}
			else {
				continue;
			}
		}
			
	}
	
	public static void removerPessoa() {

		System.out.println("**Remover pessoa**");
		
		if(listaPessoa.isEmpty()) {
			System.out.println("Lista vazia, impossível excluir!! ");
			return;
		}
		while(true) {
			int id;
			String opcao;
			
			try {
				System.out.println("Digite o Id: ");
				id = ler.nextInt();
			}
			catch(Exception e){
				System.out.println("Digite um número válido!!");
				ler.nextLine();
				continue;
			}
			
			Pessoa pessoaEncontrada = pesquisarPessoa(id);
			
			if(pessoaEncontrada == null) {
				System.out.println("Pessoa não cadastrada!");				
				continue;
			}
			
			listaPessoa.remove(pessoaEncontrada);
			
			System.out.println("Pessoa removida com sucesso!!");
			System.out.println("Lista atualizada!");
			System.out.println(listaPessoa.toString());
			
			System.out.println("Deseja sair? S ou N");
			opcao = ler.next();
			
			if(opcao.equalsIgnoreCase("s")) {
				System.out.println("Cadastro finalizado!!");
				return;
			}
			else {
				continue;
			}
			
		}
		
	}
	
	public static void consultarPessoa() {
		System.out.println("Consultar pessoa!!");
		
		if(listaPessoa.isEmpty()) {
			System.out.println("");
		}
		while(true) {
			int id;
			String opcao;
			
			try {
				System.out.println("Digite o Id: ");
				id = ler.nextInt();
			}
			catch(Exception e){
				System.out.println("Digite um número válido!!");
				ler.nextLine();
				continue;
			}
			
			Pessoa pessoaEncontrada = pesquisarPessoa(id);
			
			if(pessoaEncontrada == null) {
				System.out.println("Pessoa não encontrada!! ");
				continue;
			}
			else {
				for(Pessoa pessoa : listaPessoa) {
					if(pessoa.getId() == id) {
						System.out.println(pessoa);
					}
				}
			}
				
			System.out.println("Deseja sair? S ou N");
			opcao = ler.next();
			
			if(opcao.equalsIgnoreCase("s")) {
				System.out.println("Cadastro finalizado!!");
				return;
			}
			else {
				continue;	
			}
			
			
		}
			
		
		
	}
		
	public static void posicaoNaLista(){
		System.out.println("Imprimir posição lista!!");
		
		if(listaPessoa.isEmpty()) {
			System.out.println("");
		}
		while(true) {
			int id;
			String opcao;
			
			try {
				System.out.println("Digite o Id: ");
				id = ler.nextInt();
			}
			catch(Exception e){
				System.out.println("Digite um número válido!!");
				ler.nextLine();
				continue;
			}
			
			Pessoa pessoaEncontrada = pesquisarPessoa(id);
			
			if(pessoaEncontrada == null) {
				System.out.println("Pessoa não encontrada!! ");
				continue;
			}
			
			int posicaoEncontrada = encontrarPosicao(pessoaEncontrada); 
			System.out.println(posicaoEncontrada);
				
			System.out.println("Deseja sair? S ou N");
			opcao = ler.next();
			
			if(opcao.equalsIgnoreCase("s")) {
				System.out.println("Cadastro finalizado!!");
				return;
			}
			else {
				continue;	
			}
			
			
		}
			
	}
	
	public static void listarPessoas() {
		System.out.println("Listar todas pessoas da lista!");
		if(listaPessoa.isEmpty()) {
			System.out.println("Lista vazia, impossível listar!! ");
			return;
		}
		
		for(Pessoa pessoa : listaPessoa) {
			System.out.println(pessoa.toString());
		}
			
		
		while(true) {
			
			String opcao = "";
			if(opcao.equalsIgnoreCase("s")) {
				System.out.println("Cadastro finalizado!!");
				return;
			}
			else {
				continue;	
			}

		}
		
		
	}

	
}	

