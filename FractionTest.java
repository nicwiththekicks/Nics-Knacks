import java.lang.Math ;
public class FractionTest {
	public static void main(String[] args) {
	
		Fraction frac1 = new Fraction(1,4);
        Fraction frac2 = new Fraction(2,3);
	
        Fraction.addFraction(frac1,frac2); 
        Fraction.subFraction(frac1, frac2);
        Fraction.multFraction(frac1, frac2);
        Fraction.divFraction(frac1, frac2);
 }
}