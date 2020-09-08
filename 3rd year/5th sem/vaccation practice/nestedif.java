import java.util.Scanner;

class NestedIf{

 public static void main(String args[]){
    int a;
    System.out.print("enter marks in %: ");
    Scanner obj=new Scanner(System.in);
    a=obj.nextInt();
    if(a>30){
        System.out.print("pass,");
        if(a>90){
            System.out.println("grade A+");   
        }
        else if(90>a && a>75){
            System.out.println("grade A");
        }
        else if(75>a && a>50){
            System.out.println("grade B");
        }
        else if(50>a && a>30){
            System.out.println("grade C");
        }
        
    }
    else{
        System.out.println("fail, grade D");
    }


 }   

}