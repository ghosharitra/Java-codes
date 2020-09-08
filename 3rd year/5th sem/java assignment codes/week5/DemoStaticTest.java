import java.util.Scanner;
class DemoStatic{

private static int a;

public DemoStatic(int a){
this.a=a;
}
public int getNo(){
return a;
}
public static void statfunc(){
System.out.println("static funtion can be called without object creation. The number is: "+a);
}
static{
System.out.println("static block is executed first. The number is set to 0");
a=5;

}
}

class DemoStaticTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
DemoStatic.statfunc();
System.out.print("enter a number for obj 1: ");
DemoStatic obj1=new DemoStatic(scan.nextInt());
System.out.println("number of  obj 1 is: "+obj1.getNo());
DemoStatic.statfunc();
System.out.print("enter a number for obj 2: ");
DemoStatic obj2=new DemoStatic(scan.nextInt());
System.out.println("number of  obj 1 is: "+obj1.getNo());
System.out.println("number of  obj 2 is: "+obj2.getNo());
DemoStatic.statfunc();
}}