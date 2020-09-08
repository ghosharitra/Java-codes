import java.util.Scanner;
class Hcf{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter two anumber: ");
int a=scan.nextInt();
int b=scan.nextInt();
int g=1,i;
for(i=1;i<=a && i<=b;i++){
if(a%i==0 && b%i==0)
g=i;
}
System.out.println("HCF: "+g);
}
}