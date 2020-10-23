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

public void showFraction() {
System.out.println("The value of this fraction is " + num);
}

//I had no idea how to calculate least common denominator. As a result the mathematical operations look rough.
public static void addFraction(int a,int b, int c) {
 b = (a+c); 
 System.out.println("(4 / 2) + (2 / 2) = " + b + " / 2");
}
public static void subFraction(int a, int b, int c) {
b = (a-c);	
System.out.println("(4 / 2) - (2 / 2) = " + b + " / 2");
}
public static void multFraction(int a, int b, int c) {
b=(a*c);
System.out.println("(4 / 2) * (2 / 2) = " + b + " / 2");	
}
public static void divFraction(int a, int b, int c) {
b = (a/c);
System.out.println("(4 / 2) / (2 / 2) = " + b + " / 2");
}
} 