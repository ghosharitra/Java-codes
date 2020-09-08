import java.util.Scanner;
class SumOfNaturalNo{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a anumber: ");
int n=scan.nextInt();
int s=n*(n+1)/2;
System.out.print(s);
}
}