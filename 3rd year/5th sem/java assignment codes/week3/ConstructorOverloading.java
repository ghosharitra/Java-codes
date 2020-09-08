import java.util.Scanner;
class Constuctor{
private int a;
public Constuctor(int a){
this.a=a;
}
public Constuctor(){
this.a=10;
}
public void getVal(){
System.out.println(a);    
}
}
class ConstructorOverloading{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int a=scan.nextInt();
Constuctor b =new Constuctor();
Constuctor c =new Constuctor(a);
b.getVal();
c.getVal();
}
}