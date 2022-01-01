package provaPOO;

public class Colaborador {

	
	private int id;
	private String nome;
	private double salarioHora;
	
	
	
	
	public Colaborador(int id, String nome, double salarioHora) {

		this.id = id;
		this.nome = nome;
		this.salarioHora = salarioHora;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public double getSalarioHora() {
		return salarioHora;
	}




	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}




	@Override
	public String toString() {
		return "\nColaborador: " +
			"\nId: " + this.getId() +
			"\nNome:  " + this.getNome();
			//"\nSalário Hora: " + this.getSalarioHora();
	}
	
	
	
	
	
	
}
