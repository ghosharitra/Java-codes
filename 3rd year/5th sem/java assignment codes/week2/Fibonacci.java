import java.util.Scanner;
class Fibonacci{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a anumber: ");
int n=scan.nextInt();
int a=0,b=1,c;

for(;a<=n;){
System.out.print(a+" ");
c=a+b;
a=b;
b=c;
}

}
}