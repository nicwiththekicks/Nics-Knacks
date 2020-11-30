import java.lang.Math ;

public class Fraction {
private int num ;
private int den; 

public Fraction() {
num = 1 ;	
den = 2 ;
	}

public Fraction(int n, int d) {
num = n;
den = d;
}

public int getNum() {
return num;	
}
	
public int getDen() {
return den;}

public static void addFraction(Fraction x, Fraction y) {
System.out.print(x.num + "/" + x.den + " + " + y.num + "/" + y.den + " = ");
int newNum = (x.num * y.den) + (y.num * x.den);
int newDen = x.den * y.den;
System.out.println(newNum + "/" + newDen);
}

public static void subFraction(Fraction x, Fraction y) {
System.out.print(x.num + "/" + x.den + " - " + y.num + "/" + y.den + " = ");
int newNum = (x.num * y.den) - (y.num * x.den);
int newDen = x.den * y.den;
System.out.println(newNum + "/" + newDen); 
}

public static void multFraction(Fraction x, Fraction y) {
System.out.print(x.num + "/" + x.den + " * " + y.num + "/" + y.den + " = ");
int newNum = x.num * y.num;
int newDen = x.den * y.den;
System.out.println(newNum + "/" + newDen);	
}
public static void divFraction(Fraction x, Fraction y) {
System.out.print(x.num + "/" + x.den + " / " + y.num + "/" + y.den + " = ");
int newNum = x.num * y.den;
int newDen = x.den * y.num;
System.out.println(newNum + "/" + newDen);
}
} 