import java.util.Scanner;

class MilesToKilometer{
 public static void main(String args[]){
   
    double a;

    System.out.print("enter a number in miles: ");
    Scanner s=new Scanner(System.in);
    a=s.nextDouble();
    
    a=a*1.60934;

    System.out.println(a+" kilometers");
 }   
}