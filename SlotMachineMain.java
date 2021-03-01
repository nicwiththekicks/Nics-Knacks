import java.util.Scanner;
public class SlotMachineMain {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); 
	
		
		System.out.println("Would you like to play the slot machine?");
	    System.out.println("(1 = YES, 2 = NO)");
	   SlotMachine.input = myObj.nextInt();
	while(SlotMachine.input == 1) {
		SlotMachine.startSlots((int) (Math.random() * (10-1) + 1),(int) (Math.random() * (10-1) + 1),(int) (Math.random() * (10-1) + 1));
		
	}
	if (SlotMachine.input == 2) {
		if(SlotMachine.winnings >= 1) {
		System.out.println("Congratulations! you have won a total of: $" + SlotMachine.winnings); }
		else if(SlotMachine.winnings < 0) {
		System.out.println("Thank you for playing! Unfortunately you have lost: $" + SlotMachine.winnings);	}
		else {
		System.out.println("You've neither won nor lost anything...");	
		myObj.close();
		
		}
	}
	}
	}


