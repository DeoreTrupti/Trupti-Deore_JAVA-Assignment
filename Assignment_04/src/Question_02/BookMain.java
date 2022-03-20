package Question_02;

public class BookMain {
	public static void main(String gg[])
	{
	BookCollection bc=new BookCollection("Trupti B. Deore");
	Book b=new Book(19, "Java in depth", "jar");
	System.out.println("Book already exist :"+bc.hasBook(b));
	bc.toString();
	System.out.println("\n");
	
	bc.sort1();
	System.out.println("\n");
	bc.sort2();
	}
}

