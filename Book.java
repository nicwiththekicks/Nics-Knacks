
public class Book {

	public static int repeat = 1;
	public static int bookNumber = 0;
	public static String title; 
    public static String author;
    public static String genre;
    public static int pages;
    public static void returnBook() {
		if (bookNumber == 1) {
		System.out.println("There is currently " + bookNumber + " book in the database.");
	}
		else {
			System.out.print("There are currently " + bookNumber + " books in the database." );
		}
    }
}
