import java.util.Scanner;
class MultiplicationTable{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a anumber: ");
int a=scan.nextInt();

System.out.println("Multiplication Table:");
for(int i=1;i<=12;i++){
System.out.println(a+"x"+i+"="+ (a*i));
}

}
}