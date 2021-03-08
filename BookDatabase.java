

import java.util.Scanner;


public class BookDatabase {
	static Scanner myScanner = new Scanner(System.in);
	
	
	public static void addBook() {
       while (Book.repeat ==1) {
    	   System.out.println("Please enter a book.");
    	   System.out.println("What is the title of the book?");
    	Book.title = myScanner.nextLine();
    	System.out.println("Who is the author?");
    	Book.author = myScanner.nextLine();
    	System.out.println("What is the genre?");
    	Book.genre = myScanner.nextLine();
    	System.out.println("How many pages are there?");
    	Book.pages = myScanner.nextInt();
    	Book.bookNumber += 1;
    	System.out.println("Would you like to enter another book? 1 - YES, 2 - NO");
    	Book.repeat = myScanner.nextInt();
    	myScanner.nextLine();
    	
    }
       if (Book.repeat == 2) {
    	   Book.returnBook();
       }
	}
	public static void main(String[] args) {
		BookDatabase.addBook();
	}
		}
    	
    		
		
		

		
		
		


