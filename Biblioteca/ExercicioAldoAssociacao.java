package Biblioteca;

public class ExercicioAldoAssociacao {

	public static void main(String[] args) {
		
		
		Editora editora1 = new Editora("Saraiva", "Maria", "99999");
		//System.out.println(editora1.toString());

		Editora editora2 = new Editora("Atlas", "Jose", "99999");
		//System.out.println(editora2.toString());

		Editora editora3 = new Editora("Campus", "Carlos", "99999");
		//System.out.println(editora3.toString());

		
		Autor autor1 = new Autor(101, "Carlos", "carlinhos@mail.com");
		//System.out.println(autor1.toString());
		
		Autor autor2 = new Autor(102, "Chivo", "xico@mail.com");
		//System.out.println(autor2.toString());

		Autor autor3 = new Autor(103, "Vera", "verinha@mail.com");
		//System.out.println(autor3.toString());

		Autor autor4 = new Autor(104, "Marcia", "mama@mail.com");
		//System.out.println(autor4.toString());

		Autor autor5 = new Autor(105, "Tadeu", "deu@mail.com");
		//System.out.println(autor5.toString());

		Autor autor6 = new Autor(106, "Chico", "xico@mail.com");
		//System.out.println(autor6.toString());

		
		Livro livro1 = new Livro(5001, "Estude POO", "123-321", editora3);
		livro1.inseriAutor(autor1);
		livro1.inseriAutor(autor5);

		Livro livro2 = new Livro(5002, "Aprenda POO", "456-654", editora1);
		livro2.inseriAutor(autor2);
		livro2.inseriAutor(autor3);
		livro2.inseriAutor(autor4);

		Livro livro3 = new Livro(5003, "Saiba POO", "987-789", editora3);
		livro3.inseriAutor(autor5);
		livro3.inseriAutor(autor6);

		livro3.removeAutor(autor5);
		
		Livro livro4 = new Livro(5004, "Conheça POO", "333-444", editora2);
		Livro livro5 = new Livro(5005, "Programe POO", "222-444", editora1);
		
		
		

		
		//livro1.listaAutores();
		
		System.out.println(livro1);
		System.out.println(livro2);
		System.out.println(livro3);
		System.out.println(livro4);
		System.out.println(livro5);
		
		
		
	}

}