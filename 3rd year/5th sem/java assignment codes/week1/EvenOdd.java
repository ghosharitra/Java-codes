import java.util.Scanner;

class EvenOdd{
 public static void main(String args[]){
    int a;
    System.out.print("enter a number: ");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    if(a%2==0){
        System.out.println("it is even");   
    }
    else{
        System.out.println("it is odd");
    }
 }   
}