import java.util.Scanner;

class LeapYear{
 public static void main(String args[]){
    int a;
    System.out.print("enter a year: ");
    Scanner obj=new Scanner(System.in);
    a=obj.nextInt();
    if(a%4==0){
        if(a%100==0){
            if(a%400==0){
                System.out.println("it is a leap year");
            }
            else{
                System.out.println("it is not a leap year");
            }
        } 
        else{
            System.out.println("it is a leap year");
        }   
    }
    else{
        System.out.println("it is not a leap year");
    }
 }   
}