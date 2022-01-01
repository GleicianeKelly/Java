package Biblioteca;
import java.util.ArrayList;
import java.util.List;
public class Livro {

	
	private int codigo;
	private String titulo;
	private String isbn;
	private Editora editora;
	private List<Autor> autores;
	
	public Livro(int codigo, String titulo, String isbn, Editora editora) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.isbn = isbn;
		this.editora = editora;
		this.autores = new ArrayList<Autor>();
	}
	
	public void inseriAutor(Autor autor) {
		this.autores.add(autor);
	}
	
	public void removeAutor(Autor autor) {
		this.autores.remove(autor);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void listaAutores() {
		for (Autor autor: this.autores) {
			System.out.println(autor.getId());
		}

	}
	
	@Override
	public String toString() {
		String resposta = "\nCódigo : " + this.codigo +
			   "\nTitulo : " + this.titulo +
			   "\nEditora: " + this.editora +
			   "\nAutor  : ";

		for (Autor autor: this.autores) {
			
			resposta = resposta + "\n" + autor.getId()+ " - " + 
		                               String.format("%-20s",autor.getNome()) + " - " +
					                   autor.getEmail();
			
			//resposta = resposta + autor.toString();			
		}

		
			   
		return resposta;
	}

	
	
}