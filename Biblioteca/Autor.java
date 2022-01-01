package Biblioteca;

public class Autor {

	
	private int id;
	private String nome;
	private String email;
	
	public Autor(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "\nIdentificador: " + this.id +
			   "\nNome         : " + this.nome +
			   "\nE-mail       : " + this.email;

	}
}