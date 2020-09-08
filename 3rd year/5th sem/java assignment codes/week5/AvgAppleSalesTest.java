import java.util.Scanner;
class AvgAppleSales{

private int sale;
private static float avg=0;

public AvgAppleSales(int sale){
this.sale=sale;
avg=avg+this.sale;
}
public float getAvg(){
return avg/7;
}

}
class AvgAppleSalesTest{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int a,i;
System.out.println("enter sales of each of 7 days:"); 
AvgAppleSales x[]=new AvgAppleSales[7];
for(i=0;i<7;i++){
a=scan.nextInt();
x[i]=new AvgAppleSales(a);
}

System.out.print("average sale of the week: "+x[0].getAvg());
} }
