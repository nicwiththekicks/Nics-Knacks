import java.lang.Math ;
public class FractionTest {
	public static void main(String[] args) {
	
		Fraction frac1 = new Fraction(4,2);
        Fraction frac2 = new Fraction(2,2);
	
        Fraction.addFraction(frac1.getNum(), frac1.getDen(), frac2.getNum());
        Fraction.subFraction(frac1.getNum(), frac1.getDen(), frac2.getNum());
        Fraction.multFraction(frac1.getNum(), frac1.getDen(), frac2.getNum());
        Fraction.divFraction(frac1.getNum(), frac1.getDen(), frac2.getNum());
        
}
}