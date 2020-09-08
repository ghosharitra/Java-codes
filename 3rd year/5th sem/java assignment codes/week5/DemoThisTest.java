import java.util.Scanner;
class DemoThis{

private int a;

public DemoThis(int a){
this.a=a;
}
public DemoThis(){
this(5);
}

public int getNo(){
return a;
}}

class DemoThisTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);

System.out.print("enter a number: ");

DemoThis obj1=new DemoThis(scan.nextInt());
DemoThis obj2=new DemoThis();
System.out.println("number is: "+obj1.getNo());
System.out.println("number is: "+obj2.getNo());
}}