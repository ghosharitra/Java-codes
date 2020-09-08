class Complex{

int real;
int img;

public Complex(int real,int img){
this.real=real;
this.img=img;
}
/*
public void add(Complex c1,Complex c2){
real=c1.real+c2.real;
img=c1.img+c2.img;
}
*/
public Complex add(Complex c2){
Complex c3=new Complex(0,0);
c3.real=real+c2.real;
c3.img=img+c2.img;
return c3;
}



}

class ComplexTest{
public static void main(String args[]){
Complex c1=new Complex(10, 20);
Complex c2=new Complex(30, 40);
//Complex c3=new Complex(0, 0);
//c3.add(c1, c2);
Complex c3=c1.add(c2);
System.out.println(c3.real +" + "+c3.img+"i");
}
}