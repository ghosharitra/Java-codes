import java.util.Scanner;

class GradeSystem{

 public static void main(String args[]){
    int a;
    System.out.print("enter marks in %: ");
    Scanner obj=new Scanner(System.in);
    a=obj.nextInt();
    if(a>=90){
        System.out.println("Grade A");   
    }
    else if(90>a && a>=80){
        System.out.println("Grade B");
    }
    else if(80>a && a>=70){
        System.out.println("Grade C");
    }
    else if(70>a && a>=60){
        System.out.println("Grade D");
    }
    else if(60>a && a>=40){
        System.out.println("Grade E");
    }
    else if(40>a){
        System.out.println("Grade F");
    }


 }   

}