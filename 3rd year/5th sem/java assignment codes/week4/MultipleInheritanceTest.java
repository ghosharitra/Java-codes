import java.util.Scanner;
class PureBase{
private int a;
public PureBase(int a){
this.a=a;    
}
public void print(){
System.out.println(a);    
}
}

class SubAndBase extends PureBase{
private int b;
public SubAndBase(int a,int b){
super(a);    
this.b=b;    
}
public void print(){
super.print();
System.out.println(b);    
}
}


class PureSub extends SubAndBase{
private int c;
public PureSub(int a,int b,int c){
super(a,b);    
this.c=c;    
}
public void print(){
super.print();
System.out.println(c);    
}
}

class MultipleInheritanceTest{

public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("enter three no.: ");    
PureSub p=new PureSub(scan.nextInt(),scan.nextInt(),scan.nextInt());
p.print();
}
}
