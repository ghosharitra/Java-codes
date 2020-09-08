import java.util.Scanner;
class Reverse{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a anumber: ");
int x=scan.nextInt();
int y=0;

while(x>0){
y=y*10+(x % 10);
x=x/10;
}
System.out.print("reverse of the number: "+y);
}
}