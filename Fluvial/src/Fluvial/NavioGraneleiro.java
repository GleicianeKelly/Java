package Fluvial;

public class NavioGraneleiro extends Navio {

	
	
	private int quantidadeEscotilhas;

	public NavioGraneleiro(int id, String nome, int quantidadePoroes, float capacidadeCarga, int quantidadeEscotilhas) {
		super(id, nome, quantidadePoroes, capacidadeCarga);
		this.quantidadeEscotilhas = quantidadeEscotilhas;
	}

	public int getQuantidadeEscotilhas() {
		return quantidadeEscotilhas;
	}

	public void setQuantidadeEscotilhas(int quantidadeEscotilhas) {
		this.quantidadeEscotilhas = quantidadeEscotilhas;
	}

	@Override
	public String toString() {
		return "\nNavioGraneleiro " +
				"\nId: " + this.getId() +
				"\nNome: " + this.getNome() + 
				"\nQuantidade de porões: " + this.getQuantidadePoroes() + 
				"\nCapacidade de Carga: " + this.getCapacidadeCarga() +
				 "\nQuantidade Escotilhas: " + this.getQuantidadeEscotilhas();
	}

	
	
	
	
}
