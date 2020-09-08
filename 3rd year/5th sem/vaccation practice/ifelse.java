import java.util.Scanner;

class IfElse{

 public static void main(String args[]){
    int a;
    System.out.print("enter a number: ");
    Scanner obj=new Scanner(System.in);
    a=obj.nextInt();
    if(a%2==0){
        System.out.println("it is even");   
    }
    else{
        System.out.println("it is odd");
    }


 }   

}