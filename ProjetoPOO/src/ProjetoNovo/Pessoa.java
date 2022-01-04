package ProjetoNovo;
public class Pessoa {

	
	private int id;
	private String nome;
	private int idade;
	private float altura;
	
	
	
	public Pessoa(int id, String nome, int idade, float altura) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}



	public int getId(){
		return id;
	}
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}



	@Override
	public String toString() {
		return "\nId: " + this.getId()+ 
			   "\nNome: " + this.getNome() +
			   "\nIdade: " + this.getIdade() + 
			   "\nAltura: " + this.getAltura();
	}
	
	
}
