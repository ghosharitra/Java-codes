import java.util.*;
class Complex{
private int r,i;

public Complex(int r,int i){
this.r=r;
this.i=i;
}

public Complex mult(Complex b){
Complex t = new Complex(0,0);
t.r=r * b.r - i * b.i;
t.i=r * b.i + i * b.r;
return t;
} 
public int getReal(){
return r;    
}
public int getImg(){
return i;    
} 
}

class ComplexTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int r1,r2,r,i1,i2,i;
System.out.print("enter real and imaginary part of first complex no: ");
r1=scan.nextInt();
i1=scan.nextInt();
System.out.print("enter real and imaginary part of second complex no: ");
r2=scan.nextInt();
i2=scan.nextInt();    
Complex a = new Complex(r1,i1);
Complex b = new Complex(r2,i2);
Complex c=a.mult(b);
r=c.getReal();
i=c.getImg();
System.out.println(r+" + "+i+"i");
}   
}