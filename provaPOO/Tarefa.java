package provaPOO;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Tarefa {

	
	static int contador = 1;
	
	private int id;
	private Colaborador colaborador;
	private Date data;
	private double nrHoras;
	private Character tipo;
	private double valor;
	
	
	
	public Tarefa(Colaborador colaborador, Date dataFormatada, double nrHoras, Character tipo) {
		
		this.id += contador++;
		this.colaborador = colaborador;
		this.data = dataFormatada;
		this.nrHoras = nrHoras;
		this.tipo = tipo;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}
	
	public Colaborador getColaborador() {
		return colaborador;
	}
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getNrHoras() {
		return nrHoras;
	}
	public void setNrHoras(double nrHoras) {
		this.nrHoras = nrHoras;
	}
	public Character getTipo() {
		return tipo;
	}
	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double calcularValorTarefa() {
		
		this.setValor(this.nrHoras * this.colaborador.getSalarioHora());
		
		return this.getValor();
	}
	
	
	
	
	
}
