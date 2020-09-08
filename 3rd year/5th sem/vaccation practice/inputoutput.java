import java.util.Scanner;

class InputOutput{
public static void main(String args[]){
    int a;
    Scanner obj=new Scanner(System.in);
    System.out.print("enter a number: ");
    //System.out.println("enter a number");
    a=obj.nextInt();
    System.out.println("number is "+a+" and square is "+(a*a));

    }



}