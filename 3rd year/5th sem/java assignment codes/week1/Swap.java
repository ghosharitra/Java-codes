import java.util.Scanner;

class Swap{
 public static void main(String args[]){
    int a,b;
    System.out.print("enter 2 number: ");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("swapped numbers are "+a+" "+b);
 }   
}