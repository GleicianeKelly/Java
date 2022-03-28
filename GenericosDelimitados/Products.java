package GenericosDelimitados;

public class Products implements Comparable<Products>{

	
	private String nome;
	private Double preco;
	
	
	public Products(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "Nome: " + this.getNome() + ", " + String.format("%.2f", this.getPreco());
	}


	@Override
	public int compareTo(Products other) {
		
		return preco.compareTo(other.getPreco());
	}
	
	
}
