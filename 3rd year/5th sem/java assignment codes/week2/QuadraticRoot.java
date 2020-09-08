import java.util.Scanner;
//import java.lang.Math;
class QuadraticRoot{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter coefficient of quadratic eq: ");
double a=scan.nextInt();
double b=scan.nextInt();
double c=scan.nextInt();
double r1,r2;
r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
System.out.print("roots:"+r1+" "+r2);
}
}