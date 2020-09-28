
/**
 *Author: Nicolas Dmitriev
 *Date: Sep 28, 2020
 *Description: This program will create a new Shark Mail address for students using their input.
 */

import java.util.Scanner ;

public class EmailAddress {

	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("What is your First name? ");
	String FirstName = keyboard.nextLine();
	
	System.out.println("What is your Middle name? ");
	String MiddleName = keyboard.nextLine();
    
	System.out.println("What is your Last name? ");
	String LastName = keyboard.nextLine();
	
	System.out.println("What is your date of birth? (xx-xx-xxxx)");
	String Age = keyboard.nextLine();
	
	String Email = LastName.toLowerCase() + FirstName.toUpperCase().substring(0,1) + MiddleName.toUpperCase().substring(0,1)  ;
	System.out.println("Email: " + Email + "@sharkmail.com");
	
	String Password = Age.substring(0,2) + Age.substring(3,5) + Age.substring(6,10) ;
	System.out.println("Temp Password: " + Password);
	
	System.out.println("*** This temporary password is very insecure. Please change it immediately! ***");

	
	} 	
}
