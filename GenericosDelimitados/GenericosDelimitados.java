package GenericosDelimitados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericosDelimitados {

	public static void main (String args[]) {
	
		
		List<Products> list = new ArrayList<>();
		
		
		String path = "";//Coloca o diret�rio onde est� o arquivo
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Products(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Products x = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(x);
			
		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		

		
		
		
	}
	
}
