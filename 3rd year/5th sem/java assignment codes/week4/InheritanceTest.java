import java.util.Scanner;
class BaseClass{
private int a;
public BaseClass(int a){
this.a=a;    
}
public void print(){
System.out.println(a);    
}
}
class SubClass extends BaseClass{
private int b;
public SubClass(int a,int b){
super(a);    
this.b=b;    
}
public void print(){
super.print();
System.out.println(b);    
}
}

class InheritanceTest{

public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("enter two no.: ");    
SubClass s=new SubClass(scan.nextInt(),scan.nextInt());
s.print();
}
}
