package javasessions.class15.constructorConcept.assignment1;

//Class and Objects
//Assignment 2:
public class Book {
	String title;
	String author;
	int pageCount;

	//to keep track of the total number of books
	 static int totalBooks=0; 
	 
	public Book(String title, String author, int pageCount) {
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
		++totalBooks;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Create three Book objects and initialize their properties with different values.
		//2.Print the details of each book and the total number of books.
		//3.Modify the pageCount attribute of one book and print the updated details.
		//4.Create another Book object and update the total number of books.
		//5.Print the details of the new book and the updated total number of books.
		
		//1.
		Book bookObj1=new Book("The Secret Mountain","Enid Blyton",100);
		//2.
		System.out.println(bookObj1.title+" "+bookObj1.author+" "+bookObj1.pageCount);
		//3
		bookObj1.pageCount=111;
		System.out.println(bookObj1.title+" "+bookObj1.author+" "+bookObj1.pageCount);
		
		//1.
		Book bookObj2=new Book("The Secret of the Moon Castle","Enid Blyton",110);
		//2.
		System.out.println(bookObj2.title+" "+bookObj2.author+" "+bookObj2.pageCount);
		
		//1.
		Book bookObj3=new Book("The Secret Island","Enid Blyton",150);
		//2.
		System.out.println(bookObj3.title+" "+bookObj3.author+" "+bookObj3.pageCount);
		
		//4.
		Book bookObj4=new Book("The Secret Valley","Enid Blyton",99);
		//5.
		System.out.println(bookObj4.title+" "+bookObj4.author+" "+bookObj4.pageCount);
		//5.
		System.out.println(totalBooks);
		
	}

}
