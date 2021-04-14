import java.util.Arrays;
public class NoDuplicates {
	public static void main(String[] args) {
		int[] anum = new int[50];
	     
	      for (int i = 0; i < 50; i++) {
	         anum[i] = (1) + (int)(Math.random()* (30 - 1 + 1));
	      }
	      Arrays.sort(anum);
	      System.out.println("Original = "+ Arrays.toString(anum));
	      int dupe = anum[0];
	      boolean found = false;
	      System.out.print("Sorted = ");
	      for (int i = 0; i < anum.length; i++) {
	      if (dupe == anum[i] && !found) {
	      found = true;
	      
	      
	    } 
	      else if (dupe != anum[i]) {
	      
	    	  System.out.print(" " + dupe);
	     dupe = anum[i];
	      found = false;
	    }
	}
	System.out.print(" "+dupe);
	
	}
}
