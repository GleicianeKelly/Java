package Treino;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {

	public static void main(String[] args) throws ParseException {
	
		
	//Instância de dia, mês e ano nesse fomato	
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");	
	
	//Instância dia, mês, ano e horas nesse formato
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	//o objeto x1 trás a data de hoje com o new Date();	
	Date x1 = new Date();
	
	//Faz a mesma coisa do new Date();
	Date x2 = new Date(System.currentTimeMillis());
	
	/*Colocar em objetos do tipo Date
	 * com o parse o valor da string
	 * chamando o objeto instanciado com o SimpleDateFormat
	 */
	Date y1 = sdf1.parse("25/06/2018");	
	Date y2 = sdf2.parse("25/06/2018 15:42:07");
	
	
	//Imprimir no mesmo formato do SimpleDateFormat
	System.out.println("y1: " + sdf2.format(y1));
	System.out.println("y2: " + sdf2.format(y2));
	
	//Imprimindo a data de hoje com o objeto do new Date(); 
	System.out.println("x1: " + sdf2.format(x1));
	
	//Imprimindo o currentTimeMillis
	System.out.println("x2: " + sdf2.format(x2));
	
	
	}

}
