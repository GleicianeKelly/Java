package HashCode;

public class HashCode {
	public static void main (String args[]) {
		
		
		Client c1 = new Client("Gleiciane", "gleicianekelly1189@gmail.com");
		Client c2 = new Client("Laura", "lauraliz@gmail.com");	
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2));
		
		
		
	}
}
