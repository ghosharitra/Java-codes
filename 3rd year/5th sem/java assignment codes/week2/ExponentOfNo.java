import java.util.Scanner;
class ExponentOfNo{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter base and exponent: ");
int a=scan.nextInt();
int n=scan.nextInt();
int r=1;

for(int i=0;i<n;i++){
r=r*a;
}

System.out.print(r); 

}
}