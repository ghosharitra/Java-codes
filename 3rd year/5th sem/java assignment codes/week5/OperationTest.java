import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
class Operation{

public double salesCommission(int salesAmmount ,double commisionRate){
return salesAmmount*commisionRate/100;
}
public double squareRoot(double n){
return Math.pow(n, 0.5);
}
public boolean evenOdd(int n){
if(n%2==0)
return true;
else
return false;    
}
public void multipleMsg(double n){
for(int i=0;i<n;i++)
System.out.println("message");
}
public double Interest(double p,double n,double r){
return ((p*r)/(100*12));
}
}

class OperationTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
Operation a =new Operation();
System.out.print("enter sales amount and commission rate: ");
System.out.println("sales commission: "+a.salesCommission(scan.nextInt() ,scan.nextDouble()));
System.out.print("enter a number: ");
System.out.println("square root of the no.: "+a.squareRoot(scan.nextDouble()));
System.out.print("enter a number: ");
if(a.evenOdd(scan.nextInt()))
System.out.println("even number");
else
System.out.println("odd number");
System.out.print("enter the number of times message will be printed: ");
a.multipleMsg(scan.nextInt());
System.out.print("enter loan amount,number of years and annual interest rate: ");
System.out.print("monthly payment: "+a.Interest(scan.nextDouble(), scan.nextDouble(), scan.nextDouble()));

}}