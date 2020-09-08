import java.util.Scanner;
class CountDigit{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a anumber: ");
int a=scan.nextInt();
int i;
for(i=0;a>0;i++){
a=a/10;
}
System.out.println("No of digits: "+i );
}
}