package Treino;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ClasseCalendar {

	public static void main(String[] args) throws ParseException{
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//Fomato de hora UTC (Diferente do Brasil)
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		//Intanciar o Calendar
		Calendar cal = Calendar.getInstance();
		
		//Passamos o objeto dentro do calend�rio
		cal.setTime(d);
		
		/*Adicionar o que quisermos a nosso calend�rio
		 *ex: hour_of_day acrescenta nesse exemplo a baixo
		 *4 horas a mais da hora que est� no calend�rio
		 */
		cal.add(Calendar.HOUR_OF_DAY, 4);
		
		/*Para imprimir, pega o objeto d que foi instanciado com
		 *a data e chama o obg do calend�rio pegando com o get. 
		 */
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		
		//Como pegar os minutos de um objeto Date		
		int minutes = cal.get(Calendar.MINUTE);
		
		System.out.println("Minutos: " + minutes);
		
		/*Pegar o m�s, adicionar 1 pois o m�s em java
		 * come�a com 0		
		 */
		int mes = 1 + cal.get(Calendar.MONTH);
		
		System.out.println(mes);
		
		
	}

}
