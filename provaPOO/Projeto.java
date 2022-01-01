package provaPOO;

public class Projeto {

	
	
	private int id;
	private String nome;
	private double custo;
	
	
	
	
	public Projeto(int id, String nome, double custo) {
		super();
		this.id = id;
		this.nome = nome;
		this.custo = 0;
	}


	public int getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getCusto() {
		return custo;
	}



	public void setCusto(double custo) {
		this.custo = custo;
	}



	public void computarCusto(Tarefa tarefa) {
		if(tarefa.getTipo().equals('D') || tarefa.getTipo().equals('E')){
			
			this.setCusto(tarefa.getValor());
		}
		
	}


	@Override
	public String toString() {
		return "\nProjeto " + 
	           "\nId: " + this.getId() + 
	           "\nNome: " + this.getNome() + 
	           "\nCusto: " + this.getCusto();
	}

	
	
}
