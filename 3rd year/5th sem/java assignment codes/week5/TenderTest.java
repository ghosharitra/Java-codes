import java.util.Scanner;
class Tender{

private double cost;
private String compName;

public Tender(double cost,String compName){
this.cost=cost;
this.compName=compName;
}
public double dispCost(){
return cost;
}
public String dispCompName(){
return compName;
}
}

class TenderTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int n,i;
double cost,min;
String compName;
System.out.print("enter no of tenders: ");
n=scan.nextInt();
Tender x[]=new Tender[n];
for(i=0;i<n;i++){
scan.nextLine();
System.out.print("enter company name: ");
compName=scan.nextLine();
System.out.print("enter cost: ");
cost=scan.nextDouble();
x[i]=new Tender(cost, compName);
}
min=x[0].dispCost();
for(i=0;i<n;i++){
if(min>x[i].dispCost())
min=x[i].dispCost();
}
System.out.println("minimum price: "+min);
} }
