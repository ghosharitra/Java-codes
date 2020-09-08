import java.util.Scanner;
class PrintMultiple{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a anumber: ");
int n=scan.nextInt();

System.out.print("Multiple of 10:");
for(int i=10;i<=n;i=i+10){
System.out.print(i+" ");
}

}
}