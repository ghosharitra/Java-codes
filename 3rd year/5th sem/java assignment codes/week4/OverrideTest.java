import java.util.Scanner;
class Base1Class{
public static void print(){
System.out.println("this is base class");    
}
}
class Sub1Class extends Base1Class{
public static void print(){
    System.out.println("this is sub class");
}
}

class OverrideTest{

public static void main(String args[]){
Scanner scan=new Scanner(System.in); 
Base1Class s=new Sub1Class();
s.print();
}
}
