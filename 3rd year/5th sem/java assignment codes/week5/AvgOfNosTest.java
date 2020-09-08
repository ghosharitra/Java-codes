import java.util.Scanner;
class AvgOfNos{

private int no;
private static float avg=0;
private static int n;
public AvgOfNos(int no){
this.no=no;
avg=avg+this.no;
n++;
}
public float getNo(){
return no;
}
public float getAvg(){
return avg/n;
}}

class AvgOfNosTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int a,i,n;
float avg;
System.out.print("enter no. of elements: "); 
n=scan.nextInt();
AvgOfNos x[]=new AvgOfNos[n];
System.out.print("enter the elements: "); 
for(i=0;i<n;i++){
a=scan.nextInt();
x[i]=new AvgOfNos(a);
}
avg=x[0].getAvg();
System.out.println("average: "+avg);
System.out.print("elements above average: "); 
for(i=0;i<n;i++){
if(x[i].getNo()>avg){
System.out.print(x[i].getNo()+" ");
}}

}}
