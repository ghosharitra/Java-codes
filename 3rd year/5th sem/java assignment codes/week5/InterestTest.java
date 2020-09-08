import java.util.Scanner;
class Interest{
private double p,n,r;

public Interest(double p,double n,double r){
this.p=p;
this.n=n;
this.r=r;
}
public double amount(){
return p+((p*n*r)/100);
}
}

class InterestTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
double p,r;
int i;
System.out.print("enter investment amount and interest rate: ");
p=scan.nextDouble();
r=scan.nextDouble();
Interest x[]=new Interest[30];
System.out.println("invested: "+p+" Annual rate: "+r+"%"+"\nFuture Values of 1 to 30 years:");
for(i=0;i<30;i++){
x[i]=new Interest(p, i+1, r);
System.out.println((i+1)+"\t"+x[i].amount());
}
}}