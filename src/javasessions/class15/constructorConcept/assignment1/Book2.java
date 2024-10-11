package javasessions.class15.constructorConcept.assignment1;

//Class and Objects
//Assignment 2:
public class Book2 {
	String title;
	String author;
	int pageCount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Create three Book objects and initialize their properties with different values.
		//2.Print the details of each book and the total number of books.
		//3.Modify the pageCount attribute of one book and print the updated details.
		//4.Create another Book object and update the total number of books.
		//5.Print the details of the new book and the updated total number of books.
		
		int totalNumBooks=0;
		
		//1.
		Book2 bookObj1=new Book2();
		bookObj1.title="The Secret Mountain";
		bookObj1.author="Enid Blyton";
		bookObj1.pageCount=100;
		++totalNumBooks;
		
		//1
		Book2 bookObj2=new Book2();
		bookObj2.title="The Secret of the Moon Castle";
		bookObj2.author="Enid Blyton";
		bookObj2.pageCount=110;
		++totalNumBooks;
		
		//1
		Book2 bookObj3=new Book2();
		bookObj3.title="The Secret Island";
		bookObj3.author="Enid Blyton";
		bookObj3.pageCount=105;
		++totalNumBooks;
		
		//2.
		System.out.println(bookObj1.title+" "+bookObj1.author+" "+bookObj1.pageCount);
		System.out.println(bookObj2.title+" "+bookObj2.author+" "+bookObj2.pageCount);
		System.out.println(bookObj3.title+" "+bookObj3.author+" "+bookObj3.pageCount);
		
		//3
		bookObj1.pageCount=111;
		System.out.println(bookObj1.title+" "+bookObj1.author+" "+bookObj1.pageCount);
		
		//4.
		Book2 bookObj4=new Book2();
		bookObj4.title="The Secret Valley";
		bookObj4.author="Enid Blyton";
		bookObj4.pageCount=99;
		++totalNumBooks;
		
		System.out.println(bookObj4.title+" "+bookObj4.author+" "+bookObj4.pageCount);
		
		//5.
		System.out.println(totalNumBooks);
	}

}
