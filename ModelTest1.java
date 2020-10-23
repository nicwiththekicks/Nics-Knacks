
public class ModelTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Model die1 = new Model();
Model die2 = new Model();
		
die1.getRoll();		
die2.getRoll();		

die1.rollDie1();
die2.rollDie2();	

int max = die2.getRoll() + die1.getRoll() ;

System.out.println("Your total roll is "+ max);	
	}

}
