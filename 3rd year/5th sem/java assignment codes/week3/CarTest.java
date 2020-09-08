import java.util.*;
class Car{
private static int tp=0,tnt=0;

public int pass(){
tp++;
return tp;
}
public int tax(int t){
if(t!=2)
tnt++;
return tnt;
}
}

class CarTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int p=1,t,tp=0,tnt=0;

while(p==1){
System.out.print("enter  Press 1 if you want to pass a Car: ");
p=scan.nextInt();
if(p==1){
System.out.print("enter  Press 2 if you want to pay tax: ");
t=scan.nextInt();
Car a = new Car();
tp=a.pass();
tnt=a.tax(t);    
}}
System.out.println("Total no. of cars passed by: "+tp);
System.out.println("No. of cars which have not paid tax: "+tnt);
System.out.println("Amount of cash collected: "+(50*(tp-tnt)));
}}