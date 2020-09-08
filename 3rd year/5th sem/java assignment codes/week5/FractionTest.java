import java.util.Scanner;
class Fraction{
private int numerator,denominator;

public Fraction(){
numerator=5;
denominator=3;
}
public Fraction(int numerator,int denominator){
this.numerator=numerator;
this.denominator=denominator;
}

public Fraction(Fraction obj){
numerator=obj.numerator;
denominator=obj.denominator;
}
        
public int getNumerator(){
return numerator;
}
public int getDenominator(){
return denominator;
}
}

class FractionTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int x,y;
System.out.print("enter numerator and denominator: ");
x=scan.nextInt();
y=scan.nextInt();
Fraction a=new Fraction();
Fraction b=new Fraction(x,y);
Fraction c=new Fraction(a);
Fraction d=new Fraction(b);

System.out.println("1st fractional value: "+a.getNumerator()+"/"+a.getDenominator());
System.out.println("2nd fractional value: "+b.getNumerator()+"/"+b.getDenominator());
System.out.println("3rd fractional value: "+c.getNumerator()+"/"+c.getDenominator());
System.out.println("4th fractional value: "+d.getNumerator()+"/"+d.getDenominator());
}}