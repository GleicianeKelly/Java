package Fluvial;
import java.util.ArrayList;
import java.util.List;
public class ExercicioAldoHeranca {
	
	
	
	static List<NavioGraneleiro> listaGraneleiro = new ArrayList<NavioGraneleiro>();
	static List<NavioContainer> listaNavioContainer = new ArrayList<NavioContainer>();
	public static void main(String[] args) {
		
		
		 NavioGraneleiro graneleiro1 = new NavioGraneleiro(10, "Estrela do Mar", 4, 50000f, 4);
		    NavioGraneleiro graneleiro2 = new NavioGraneleiro(25, "Cruzeiro do Sul", 3, 80000f, 6);

		    listaGraneleiro.add(graneleiro1);
		    listaGraneleiro.add(graneleiro2);
		        
		      
		    NavioContainer container1 = new NavioContainer(33, "Bela e a Fera", 2, 100000f, 2, 30);
		    NavioContainer container2 = new NavioContainer(48, "Arrecifes", 2, 120000f, 2, 30);
		        
		    listaNavioContainer.add(container1);
		    listaNavioContainer.add(container2);
		    
		    
		        System.out.println(listaGraneleiro.toString());
		        System.out.println("**************************");
		        System.out.println(listaNavioContainer.toString());
		    
		

	}

}
