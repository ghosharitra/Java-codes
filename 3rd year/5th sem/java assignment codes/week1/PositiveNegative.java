import java.util.Scanner;

class PositiveNegative{
 public static void main(String args[]){
    int a;
    System.out.print("enter a number: ");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    if(a<0){
        System.out.println("it is negative");   
    }
    else{
        System.out.println("it is positive");
    }
 }   
}