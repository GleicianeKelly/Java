package provaPOO;

import java.util.Date;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProvaAldo {
	

	static Colaborador colaborador1 = new Colaborador(123, "Gleice", 8.00f);
	static Colaborador colaborador2 = new Colaborador(456, "Marcelo", 7.00f);
	static Colaborador colaborador3 = new Colaborador(789, "Laura", 9.00f);
	static Colaborador colaborador4 = new Colaborador(321, "Fátima", 8.00f);

	static Projeto projeto1 = new Projeto(222, "Foco", 34.0f);
	static Projeto projeto2 = new Projeto(333, "Objetivo", 34.0f);

	static List<Colaborador> listaColaborador = new ArrayList<Colaborador>();
	static List<Projeto> listaProjetos = new ArrayList<Projeto>();
	static List<Tarefa> listaTarefas = new ArrayList<Tarefa>();

	static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {

		listaColaborador.add(colaborador1);
		listaColaborador.add(colaborador2);
		listaColaborador.add(colaborador3);
		listaColaborador.add(colaborador4);

		listaProjetos.add(projeto1);
		listaProjetos.add(projeto2);

		int opcao;

		while (true) {

			System.out.println("Digite 0 para sair");
			System.out.println("Digite 1 registrar tarefa");
			System.out.println("Digite 2 consultar projeto");
			System.out.println("Digite 3 Consultar tarefas colaborador");
			opcao = ler.nextInt();

			if (opcao == 0) {
				System.out.println("Programa finalizado!! ");
				break;
			}

			switch (opcao) {

			case 1:
				registarTarefa();
				break;

			case 2:
				consultarProjeto();
				break;

			case 3:
				consultarTarefasColaborador();
				break;

			default:
				System.out.println("Número digitado está incorreto! ");
				break;
			}

		}

	} 

	public static Projeto encontrarProjeto(int id) {

		for (Projeto projeto : listaProjetos) {
			if (projeto.getId() == id) {
				return projeto;
			}
		}

		return null;
	}

	public static Colaborador encontrarColaborador(int id) {
		for (Colaborador colaborador : listaColaborador) {
			if (colaborador.getId() == id) {
				return colaborador;
			}
		}
		return null;
	}

	public static Tarefa encontrarTarefa(int id) {
		for (Tarefa tarefa : listaTarefas) {
			if (tarefa.getColaborador().getId() == id) {
				return tarefa;
			}
		}
		return null;
	}

	public static void registarTarefa() throws ParseException {
		System.out.println("** Registrar tarefa ** ");
		System.out.println("***********************");

		while (true) {

			int id1, id2;
			double horas;
			Character tipo;

			System.out.println(" **Consultar Projeto** ");
			System.out.println("Digite o Id do projeto: ");
			id1 = ler.nextInt();

			Projeto projetoEncontrado = encontrarProjeto(id1);

			if (projetoEncontrado == null) {
				System.out.println("Projeto inexistente");
				return;
			}

			System.out.println("***************************");
			System.out.println(" **Encontrar colaborador** ");
			System.out.println("Digite o Id do colaborador: ");
			id2 = ler.nextInt();

			Colaborador colaboradorEncontrado = encontrarColaborador(id2);

			if (colaboradorEncontrado == null) {
				System.out.println("Colaborador inexistente");
				return;
			}

			System.out.println("Digite uma data ");
			System.out.println("Ex: 01/01/2022");
			String data = ler.next();
			Date dataFormatada = formato.parse(data);

			System.out.println("Digite o número de hrs trabalhadas: ");
			horas = ler.nextDouble();

			if (horas <= 0) {
				System.out.println("Número de horas inválido!! ");
				return;
			}

			System.out.println("Digite o tipo de tarefa: ");
			tipo = ler.next().charAt(0);

			if (tipo.equals('C') || tipo.equals('D') || tipo.equals('E')) {

				Tarefa tarefa = new Tarefa(colaboradorEncontrado, dataFormatada, horas, tipo);

				System.out.println(tarefa.calcularValorTarefa());

				listaTarefas.add(tarefa);

				projetoEncontrado.computarCusto(tarefa);

			} else {
				System.out.println("Tarefa inexistente!! ");
				continue;
			}

			System.out.println("Deseja encerrar? ");
			System.out.println("Digite " + "S" + " para sair ou " + "N" + " para permanecer ");
			String sair = ler.next();

			if (sair.equalsIgnoreCase("s")) {
				System.out.println("Programa finalizado!! ");
				return;
			} else {
				continue;
			}
			
			

		}

	}

	public static void consultarProjeto() {
		System.out.println(" **Consultar projeto** ");

		if (listaProjetos.isEmpty()) {
			System.out.println("Não existe nenhum projeto na lista! ");
			return;
		}

		while (true) {

			int id;

			System.out.println("Digite o Id do projeto: ");
			id = ler.nextInt();

			Projeto projetoEncontrado = encontrarProjeto(id);

			if (projetoEncontrado == null) {
				System.out.println("Projeto não existe!! ");
				return;
			}

			System.out.println(projetoEncontrado.toString());

			System.out.println("Deseja encerrar? ");
			System.out.println("Digite " + "S" + " para sair ou " + "N" + " para permanecer ");
			String sair = ler.next();

			if (sair.equalsIgnoreCase("s")) {
				System.out.println("Programa finalizado!! ");
				return;
			} else {
				continue;
			}

		}
	}

	public static void consultarTarefasColaborador() {
		System.out.println(" **Consultar colaborador ** ");

		if (listaColaborador.isEmpty()) {
			System.out.println("Não existe nenhum colaborador na lista!! ");
			return;
		}

		while (true) {

			int id;

			System.out.println("Digite o Id do colaborador: ");
			id = ler.nextInt();

			Colaborador colaboradorEncontrado = encontrarColaborador(id);

			if (colaboradorEncontrado == null) {
				System.out.println("Colaborador não encontrado!! ");
				return;
			}

			Tarefa tarefaEncontrada = encontrarTarefa(id);

			if (tarefaEncontrada == null) {
				System.out.println("Nenhuma tarefa cadastrada! ");
				return;
			}

			System.out.println(colaboradorEncontrado.toString());
			System.out.println("Dados da tarefa do colaborador: " + colaboradorEncontrado.getNome());
			System.out.println("Id tarefa: " + tarefaEncontrada.getId());
			System.out.println("Data: " + formato.format(tarefaEncontrada.getData()));
			System.out.println("Número de horas: " + tarefaEncontrada.getNrHoras());
			System.out.println("Tipo: " + tarefaEncontrada.getTipo());
			System.out.printf("\nValor total é de %.2f", tarefaEncontrada.calcularValorTarefa());

			System.out.println("\nDeseja encerrar? ");
			System.out.println("Digite " + "S" + " para sair ou " + "N" + " para permanecer ");
			String sair = ler.next();

			if (sair.equalsIgnoreCase("s")) {
				System.out.println("Programa finalizado!! ");
				return;
			} else {
				continue;
			}
		}
	}

}   
