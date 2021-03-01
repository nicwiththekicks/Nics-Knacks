import java.util.Scanner;
public class SlotMachine {
	static Scanner myObj = new Scanner(System.in);  
	public static int input;
	    
	static int winnings = 0;
	static int spins = 0;
	public static void startSlots(int slot1,int slot2,int slot3) {
		
		    System.out.println(slot1 + " " + slot2 + " " + slot3 );
			 
		    if(slot1 == slot2 || slot1 == slot3 || slot2 == slot3) {
		    	System.out.println("You win $25" );
		    	winnings = winnings + 25;
		    	spins = spins + 1;
		    }
		    	else if(slot1 == slot2 && slot1 == slot3) {
		    	System.out.println("You win $1000");
		    	winnings = winnings + 1000;
		    	spins = spins + 1;
		    	}
		    	else {
		    		System.out.println("You lose $15");
		    		winnings = winnings - 15;
		    		spins = spins + 1;
		    	
		    	}
		    System.out.println("Your total is: $" + winnings);
		    System.out.println("You have spun " + spins + " times");
		    System.out.println();
		    System.out.println("Would you like to play again?");
		    System.out.println("(1 = YES, 2 = NO)");
		    input = myObj.nextInt();
	    }
	
}

	