package Fluvial;

public class NavioContainer extends Navio {

	
	
	private int quantidadeGuindastes;
	private int quantidadeCamaras;
	
	public NavioContainer(int id, String nome, int quantidadePoroes, float capacidadeCarga, int quantidadeGuindastes,
			int quantidadeCamaras) {
		super(id, nome, quantidadePoroes, capacidadeCarga);
		this.quantidadeGuindastes = quantidadeGuindastes;
		this.quantidadeCamaras = quantidadeCamaras;
	}
	
	
	public int getQuantidadeGuindastes() {
		return quantidadeGuindastes;
	}


	public void setQuantidadeGuindastes(int quantidadeGuindastes) {
		this.quantidadeGuindastes = quantidadeGuindastes;
	}


	public int getQuantidadeCamaras() {
		return quantidadeCamaras;
	}


	public void setQuantidadeCamaras(int quantidadeCamaras) {
		this.quantidadeCamaras = quantidadeCamaras;
	}


	@Override
	public String toString() {
		return "\nNavioContainer " +
				"\nId: " + this.getId() +
				"\nNome: " + this.getNome() + 
				"\nQuantidade de porões: " + this.getQuantidadePoroes() + 
				"\nCapacidade de Carga: " + this.getCapacidadeCarga() +
				"\nQuantidade guindastes: " + this.getQuantidadeGuindastes() +
				"\nQuantidade câmaras " + this.getQuantidadeCamaras();
		
	}
	
	
	
	
	
	
	
	
	
}
