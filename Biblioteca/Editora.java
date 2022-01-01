package Biblioteca;

public class Editora {

	
static private int sequencial = 0;
	
	private int codigo;
	private String razaoSocial;
	private String contato;
	private String telefone;
	
	public Editora(String razaoSocial, String contato, String telefone) {
		this.codigo = ++sequencial;
		this.razaoSocial = razaoSocial;
		this.contato = contato;
		this.telefone = telefone;
	}
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "\nCódigo       : " + this.codigo +
			   "\nRazão Social : " + this.razaoSocial +
			   "\nContato      : " + this.contato +
			   "\nTelefone     : " + this.telefone;
	}
	
}