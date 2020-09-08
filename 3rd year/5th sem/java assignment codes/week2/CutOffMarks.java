import java.util.Scanner;
class CutOffMarks{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter marks of Mathematics subject: ");
int m=scan.nextInt();
System.out.print("Enter marks of Physics subject: ");
int p=scan.nextInt();
System.out.print("Enter marks of Chemistry subject: ");
int c=scan.nextInt();

if(m>=60 && p>=50 && c>=40 && ( (m+p+c)>=200 || (m+p)>=150 ) ){
System.out.print("eligible candidate");
}
else{
System.out.print("uneligible candidate");
}

}
}