import java.util.Scanner;
class Commission{
private int sales;
public Commission(int s){
this.sales=s;
int a=(this.sales*2)/100;
System.out.println("2% commission is "+a);
}}
class Demo1{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
System.out.print("enter sales: ");
int s=scan.nextInt();
if(s>=0){
Commission a =new Commission(s);
}
else{
System.out.println("Invalid Input");
}}

}