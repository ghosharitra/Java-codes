import java.util.Scanner;
class Complex{
private int r,i;

public Complex(int r,int i){
this.r=r;
this.i=i;
}

public Complex add(Complex b){
Complex temp = new Complex(0,0);
temp.r=r + b.r;
temp.i=i + b.i;
return temp;
} 
public int getReal(){
return this.r;    
}
public int getImg(){
return this.i;    
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
Complex c=a.add(b);
r=c.getReal();
i=c.getImg();
System.out.println(r+" + "+i+"i");
}   
}