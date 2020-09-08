import java.util.Scanner;

class DivisibleByFive{
 public static void main(String args[]){
    int a;
    System.out.print("enter a number: ");
    Scanner obj=new Scanner(System.in);
    a=obj.nextInt();
    if(a%5==0){
        System.out.println("it is divisible by five");   
    }
    else{
        System.out.println("it is not divisible by five");
    }
 }   
}