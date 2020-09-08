import java.util.Scanner;

class ConditionalOperator{
public static void main(String args[]){
int a,b,c;
Scanner obj=new Scanner(System.in);
System.out.print("enter two numbers: ");
a=obj.nextInt();
b=obj.nextInt();
c=(a>b)?a:b;
System.out.print("greater number is: "+c);
}
}